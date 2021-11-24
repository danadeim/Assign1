import java.util.ArrayList;
import java.util.List;

public class Flat <TElement extends IAggregable<TElement, TAggregateResult> & IDeeplyCloneable<TElement>, TAggregateResult> implements IContainer<TElement, TAggregateResult>{
    private List<TElement> _elements = new ArrayList<>();
    public void add(TElement el){
        _elements.add(el);
    }
    public TElement get(int ind){
        if(ind>= _elements.size()||ind<0){
            return null;
        }
        return _elements.get(ind);
    }
    @Override
    public List<TElement> elements() {

        return _elements;
    }


    @Override
    public TAggregateResult aggregateAllElements() {
        TAggregateResult x= null;
        for ( TElement a: _elements){
            x= a.aggregate(x);
        }
        return x;
    }

    @Override
    public TElement cloneElementAtIndex(int index) {
        if(index>= _elements.size()||index<0){
            return null;
        }
        return _elements.get(index).deepClone();
    }
}