@Override
public String toString() {
    return new JsonBuilder(this).toPrettyString()
}