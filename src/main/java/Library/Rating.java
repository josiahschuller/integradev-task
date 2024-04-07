package Library;

import Util.Describable;

public enum Rating implements Describable {
    G,
    PG,
    M,
    MA,
    R;

    @Override
    public String describe() {
        return this.name();
    }
}
