final class Meters implements IAggregable<Meters, Integer>, IDeeplyCloneable<Meters> {
    private final int _SqrMeters;

    public Meters(int SqrMeters) {
        this._SqrMeters = SqrMeters;
    }

    public int SqrMeters() {
        return this._SqrMeters;
    }

    public Integer aggregate(Integer intermediateResult) {
        return intermediateResult == null ? this._SqrMeters : this._SqrMeters + intermediateResult;
    }

    public Meters deepClone() {
        return new Meters(this._SqrMeters);
    }
}