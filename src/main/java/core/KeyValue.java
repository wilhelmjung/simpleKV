package core;

import java.io.IOException;
import java.util.Iterator;

public interface KeyValue {

    /**
     * To implement in Lab 5.
     * 
     * Instantiates a SimpleKV object that implements this KeyValue interface
     * 
     * @param path
     *            Path to the file that stores the data.
     * @return SimpleKV object
     */
    SimpleKV initAndMakeStore(String path);

    /**
     * To implement in Lab 5.
     * 
     * Instantiates a SimpleKV object that implements this KeyValue interface,
     * and points to data living in path
     * 
     * @param path
     *            Path to the file that stores the data.
     * @return SimpleKV object
     * @throws IOException
     */
    SimpleKV load(String path) throws IOException;

    /**
     * To implement in Lab 5.
     * 
     * Stores the value in the associated to the input key
     * 
     * @param key
     * @param value
     */
    void write(char[] key, char[] value);

    /**
     * To implement in Lab 5.
     * 
     * Returns the value stored at key, or null if no value exists.
     * 
     * @param key
     * @return char[] with the value stored at that key, or null if no value
     *         exists
     */
    char[] read(char[] key);

    /**
     * To implement in Lab 5.
     * 
     * Performs a range read on the key-value store. Returns an iterator over
     * the key-value pairs found in the range [startKey, endKey]
     * 
     * @param startKey
     *            char[] that indicates the beginning of the range
     * @param endKey
     *            char[] that indicates the end of the range
     * @return
     */
    Iterator<KVPair> readRange(char[] startKey, char[] endKey);

    /**
     * To implement in Lab 6.
     * 
     * Indicates that a transaction with id tid is started
     * 
     * @param tid
     *            an integer that identifies a transaction
     */
    void beginTx(int tid);

    /**
     * To implement in Lab 6.
     * 
     * Indicates that the transaction with id tid is finished and should be
     * durable
     * 
     * @param tid
     */
    public void commit(int tid);

}
