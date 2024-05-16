class RandomizedSet {
    HashSet<Integer> set = new HashSet<>();
    Random rand =new Random();
    public RandomizedSet() {

    }

    public boolean isPresent(int val) {
        return set.contains(val);
    }

    public boolean insert(int val) {
        if (isPresent(val))
            return false;

        set.add(val);
        return true;

    }

    public boolean remove(int val) {
        if (!isPresent(val))
            return false;

            set.remove(val);
            return true;
    }

    public int getRandom() {
  
        
        List<Integer> list = new ArrayList<>(set);

       int randomIdx= rand.nextInt(list.size());
        return list.get(randomIdx);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */