package fr.lcdlv.kata.bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static java.util.stream.Collectors.joining;

public class History {

    List<Transaction> transactions = new ArrayList<>();

    public int size() {
        return transactions.size();
    }

    public void record(Transaction transaction) {
        transactions.add(transaction);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        History history = (History) other;
        return transactions.equals(history.transactions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transactions);
    }

    @Override
    public String toString() {
        return "History size : " + size() + "\n"
                + transactions.stream()
                .map(Transaction::toString)
                .collect(joining("\n"));
    }
}
