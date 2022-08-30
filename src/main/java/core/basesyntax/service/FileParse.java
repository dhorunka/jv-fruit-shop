package core.basesyntax.service;

import core.basesyntax.model.Transaction;
import java.util.List;

public interface FileParse {
    List<Transaction> parse(List<String> lines);
}
