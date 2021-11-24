public final class Area implements IAggregable<Area, Integer>, IDeeplyCloneable<Area> {
    private final int _district;

    public Area(int district) {
        this._district = district;
    }

    public int district() {
        return this._district;
    }

    public Integer aggregate(Integer intermediateResult) {
        return intermediateResult == null ? this._district : this.district() + intermediateResult;
    }

    public Area deepClone() {
        return new Area(this._district);
    }
}