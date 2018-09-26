public class Node
{
	public String content = new String(new char[150]); //??????????????????????????????)
	public Node next; //??????
	public Node front;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String temp = new String(new char[150]); //std???????
		final String std = "end";
		Node head = null; //head???
		Node p;
		Node q;
		while (true)
		{
			temp = new Scanner(System.in).nextLine();
			if (strcmp(temp,std) != 0)
			{
				p = new Node();
				p.content = temp;
				p.next = null;
				p.front = null;
				if (head == null)
				{
					head = p;
				}
				else
				{
					q.next = p;
					p.front = q;
				}
				q = p;
			}
			else
			{
				break;
			}
		}
		while (p != null)
		{
			System.out.printf("%s\n",p.content);
			p = p.front;
		}
	}

}
