  public void insertItem(Object key, Object element)
    throws InvalidKeyException  {
    checkKey(key); // may throw an InvalidKeyException
    Position insPos = T.root();
    do {
      insPos = findPosition(key, insPos);
      if (T.isExternal(insPos))
        break;
      else // the key already exists
        insPos = T.rightChild(insPos);
    } while (true);
    T.expandExternal(insPos);
    Item newItem = new Item(key, element);
    T.replaceElement(insPos, newItem);
    actionPos = insPos; // node where the new item was inserted
  }
  
  public Object removeElement(Object key) throws InvalidKeyException  {
    Object toReturn;
    checkKey(key); // may throw an InvalidKeyException
    Position remPos = findPosition(key, T.root());
    if(T.isExternal(remPos)) {
      actionPos = remPos; // node where the search ended unsuccessfully
      return NO_SUCH_KEY;
    }
    else{
      toReturn = element(remPos); // element to be returned
      if (T.isExternal(T.leftChild(remPos)))
        remPos = T.leftChild(remPos);
      else if (T.isExternal(T.rightChild(remPos)))
        remPos = T.rightChild(remPos);
      else { // key is at a node with internal children
        Position swapPos = remPos; // find node for swapping items
        remPos = T.rightChild(swapPos);
        do
	  remPos = T.leftChild(remPos);
	while (T.isInternal(remPos));
	swap(swapPos, T.parent(remPos));
      }
      actionPos = T.sibling(remPos); // sibling of the leaf to be removed
      T.removeAboveExternal(remPos);
      return toReturn;
    }
  }
}
