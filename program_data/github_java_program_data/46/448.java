  /** Auxiliary method used by removeElement. */
  protected void swap(Position swapPos, Position remPos){
    T.replaceElement(swapPos, remPos.element());
  }
  /** Auxiliary method used by findElement, insertItem, and removeElement. */
  protected Position findPosition(Object key, Position pos) {
    if (T.isExternal(pos))
      return pos; // key not found and external node reached returned
    else {
      Object curKey = key(pos);
      if(C.isLessThan(key, curKey))
        return findPosition(key, T.leftChild(pos));
      else if(C.isGreaterThan(key, curKey)) // search in left subtree
        return findPosition(key, T.rightChild(pos)); // search in right subtree
      else
        return pos; // return internal node where key is found
    }
  }

  // methods of the dictionary ADT
  public int size()  { 
    return (T.size() - 1) / 2; 
  }
  
  public boolean isEmpty() { 
    return T.size() == 1;
  }
  
  public Object findElement(Object key) throws InvalidKeyException {
    checkKey(key); // may throw an InvalidKeyException
    Position curPos = findPosition(key, T.root());
    actionPos = curPos; // node where the search ended
    if (T.isInternal(curPos))
      return element(curPos);
    else
      return NO_SUCH_KEY;
  }
