Author: Frederik Wegner
Time: 22.06.17
Tests: 11/11
executeVariant()
{
    setIteration(getIteration()+1);
    if(getIteration() < getNodeQueue().size())
        setCurrentNode(getNodeQueue().get(getIteration()));
}
checkBreakCondition()
{
    return getIteration() < getGraph().getNodeList().size();
}
preProcess()
{
    InvalidInputException exception = new InvalidInputException("");
    AbstractGraph g = getGraph();
    if(g == null) throw exception;
    if(getNodeQueue() == null) throw exception;
    if(!(getNodeQueue().containsAll(g.getNodeList()) && g.getNodeList().containsAll(getNodeQueue()))) throw exception;
    
    setIteration(0);
    ArrayList<Node<N,E>> nodes = g.getNodeList();
    AbstractEdgeComparator<E> cmp = g.getComparator();
    for(Node<N,E> vv : nodes) {
        int v = getMatrixIndex(vv);
        for(Node<N,E> ww : nodes) {
            int w = getMatrixIndex(ww);
            if(w == v) setM(v,w,cmp.getZero());
            else setM(v,w,cmp.getMax());
        }
        for(Edge<N,E> e : (ArrayList<Edge<N,E>>)vv.getFanOut()) {
            int w = getMatrixIndex(e.getTargetNode());
            setM(v,w,e.getData());
        }
    }
    setCurrentNode(getNodeQueue().get(getIteration()));
}
doFunctionality()
{
    AbstractGraph g = getGraph();
    AbstractEdgeComparator<E> cmp = g.getComparator();
    ArrayList<Node<N,E>> nodes = g.getNodeList();
    
    for(Node<N,E> vv : nodes)
        for(Node<N,E> ww : nodes) {
            int v = getMatrixIndex(vv);
            int w = getMatrixIndex(ww);
            int u = getMatrixIndex(getCurrentNode());
            setM(v,w,cmp.min(getM(v,w), cmp.sum(getM(v,u),getM(u,w))));
        }
}
