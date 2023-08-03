package main.java.Homework8;
import java.util.HashMap;
import java.util.Map;

public class Homework8_2 {
        public static String buildQuery(Map<String, Object> params, String tableName) {
            StringBuilder sb = new StringBuilder();
            sb.append("SELECT * FROM ").append(tableName).append(" WHERE ");

            int paramCount = 0;
            for (Map.Entry<String, Object> entry : params.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();

                if (value != null) {
                    if (paramCount > 0) {
                        sb.append(" AND ");
                    }
                    sb.append(key).append(" = '").append(value).append("'");
                    paramCount++;
                }
            }

            return sb.toString();
        }

        public static void main(String[] args) {
            Map<String, Object> params = new HashMap<>();
            params.put("model", "V-60");
            params.put("country", "Germany");
            params.put("city", "Berlin");
            params.put("year", null);
            params.put("active", true);

            String tableName = "cars";

            String sqlQuery = buildQuery(params, tableName);
            System.out.println(sqlQuery);
        }
}

