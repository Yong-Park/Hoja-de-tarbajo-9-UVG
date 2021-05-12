interface map<key,value> {
    public boolean contains(key key);
    public void put(key key, value value);
    public void remove(key key);
    public int size();
    public value get(key key);
    public int height();
}
