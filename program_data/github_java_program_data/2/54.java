import java.util.Optional;

public class SkipList
{




}


class LinkedList
{
	HeadNode head;

	void setHead(HeadNode head)
	{
		this.head = head;
	}

	Optional<HeadNode> getHead()
	{
		return Optional.ofNullable(head);
	}

}

class HeadNode
{
	Node next;
	Integer value = -1;
}

class Node
{
	Node prior;
	Node next;
	Integer value;

	public Node(Integer value)
	{
		this.value = vaule;
	}

	public Integer getValue()
	{
		return value;
	}

	public void setValue(Integer value)
	{
		this.value = value;
	}

	public setPrior(Node prior)
	{
		this.prior = prior;
	}

	public Optional<Node> getPrior()
	{
		return Optional.ofNullable(prior);
	}

	public setNext(Node next)
	{
		this.next = next;
	}

	public Optional<Node> getNext()
	{
		return Optional.ofNullable(next);
	}
}