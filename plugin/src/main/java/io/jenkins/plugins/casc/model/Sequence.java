package io.jenkins.plugins.casc.model;

import java.util.ArrayList;
import java.util.Objects;

/**
 * @author <a href="mailto:nicolas.deloof@gmail.com">Nicolas De Loof</a>
 */

public final class Sequence extends ArrayList<CNode> implements CNode {

    private Source source;

    public Sequence() {
    }

    public Sequence(int initialCapacity) {
        super(initialCapacity);
    }

    @Override
    public Type getType() {
        return Type.SEQUENCE;
    }


    @Override
    public Sequence asSequence() {
        return this;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    @Override
    public Source getSource() {
        return source;
    }

    @Override
    public Sequence clone() {
        final Sequence clone = new Sequence();
        stream().map(CNode::clone).forEach(clone::add);
        return clone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Sequence sequence = (Sequence) o;
        return Objects.equals(source, sequence.source);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), source);
    }
}
