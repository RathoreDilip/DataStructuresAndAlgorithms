package com.hashtables;

import java.util.LinkedList;

public class HashTable {
    private class Entry {
        private int key;
        private String value;

        public Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<Entry>[] entries = new LinkedList[5];

    public void put(int key, String value) {
          var entry=getEntry(key);
          if(entry!=null){
              entry.value=value;
              return;
          }
          var bucket=getOrCreateBucket(key);
          bucket.add(new Entry(key, value));


//        int index = hash(key);
//        if (entries[index] == null)
//            entries[index] = new LinkedList<>();
//
//        var buckets = entries[index];
//        for (var entry : buckets) {
//            if (entry.key == key) {
//                entry.value = value;
//                return;
//            }
//        }
//
//        buckets.addLast(new Entry(key, value));
    }

    public String get(int key) {
        var entry=getEntry(key);
        return (entry==null) ? null: entry.value;

//        var index = hash(key);
//        var buckets = entries[index];
//        if (buckets != null) {
//            for (var entry : buckets)
//                if (entry.key == key)
//                    return entry.value;
//        }
//        return null;
    }

    public void remove(int key) {

        var entry=getEntry(key);
        if(entry==null)
             throw new IllegalStateException();

        getBucket(key).remove(entry);


//        var index = hash(key);
//        var buckets = entries[index];
//        if (buckets == null)
//            throw new IllegalStateException();
//
//        for (var entry : buckets) {
//            if (entry.key == key) {
//                buckets.remove(entry);
//                return;
//            }
//        }
//        throw new IllegalStateException();
    }

    public void print(){
        for (var bucket:entries)
            if(bucket!=null)
                for (var entry : bucket)
                    System.out.println(entry.key+"="+entry.value);

    }

    private LinkedList<Entry> getBucket(int key){
        return entries[hash(key)];
    }

    private LinkedList<Entry> getOrCreateBucket(int key){
        int index = hash(key);
        var bucket=entries[index];
        if (bucket == null)
            entries[index] = new LinkedList<>();

        return entries[index];
    }

    private Entry getEntry(int key){
        var buckets=getBucket(key);
        if(buckets!=null){
            for (var entry : buckets) {
                if (entry.key == key)
                    return entry;
            }
        }
        return null;
    }

    private int hash(int key) {
        return key % entries.length;
    }

}