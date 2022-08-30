package core.basesyntax.service.impl;

import core.basesyntax.db.Storage;
import core.basesyntax.model.Fruit;
import core.basesyntax.service.ReportService;
import java.util.Map;

public class ReportServiceImpl implements ReportService {
    private static final String REGEX = ",";

    @Override
    public String getReport() {
        Map<Fruit, Integer> map = Storage.getFruitsMap();
        StringBuilder builder = new StringBuilder();
        for (Map.Entry<Fruit, Integer> fruit : map.entrySet()) {
            builder.append(fruit.getKey().getName()).append(REGEX)
                    .append(fruit.getValue()).append(System.lineSeparator());
        }
        return builder.toString();
    }

}