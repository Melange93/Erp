package com.reka.lakatos.erp.log;

public class Result<T> {
    private T results;

    public Result(T results) {
        this.results = results;
    }

    public T getResults() {
        return results;
    }

    public void setResults(T results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "Result{" +
                "results=" + results +
                '}';
    }
}
