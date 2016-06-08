import org.apache.flink.api.common.functions.FlatMapFunction;
import org.apache.flink.api.java.DataSet;
import org.apache.flink.api.java.ExecutionEnvironment;
import org.apache.flink.api.java.aggregation.Aggregations;
import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.util.Collector;

public class FlinkHelloWorld {
    public static void main(String[] args) throws Exception {
        final ExecutionEnvironment env = ExecutionEnvironment.getExecutionEnvironment();

        DataSet<String> sampleData = env.fromElements(
                "Hello! This is a text sample",
                "to represent Apache Flink streaming",
                "Hello Hello Hello"
        );

        DataSet<Tuple2<String, Integer>> wordCountResults =
                sampleData.flatMap(new LineSplitter())
                        .groupBy(0)
                        .aggregate(Aggregations.SUM, 1);

        wordCountResults.print();
    }
}

class LineSplitter implements FlatMapFunction<String, Tuple2<String, Integer>> {
    public void flatMap(String value, Collector<Tuple2<String, Integer>> out) {
        String[] tokens = value.toLowerCase().split("\\W+");
        for (String token : tokens) {
            if (token.length() > 0) {
                out.collect(new Tuple2<String, Integer>(token, 1));
            }
        }
    }
}