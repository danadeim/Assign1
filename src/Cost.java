public final class Cost implements IAggregable<Cost, Integer>, IDeeplyCloneable<Cost> {
    private final int _cash;

    public Cost(int cash) {
        this._cash = cash;
    }

    public int cash() {
        return this._cash;
    }

    public Integer aggregate(Integer intermediateResult) {
        return intermediateResult == null ? this._cash : this.cash() + intermediateResult;
    }

    public Cost deepClone() {
        return new Cost(this._cash);
    }
}