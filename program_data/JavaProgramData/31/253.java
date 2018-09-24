public class Node
{
 public String Info = new String(new char[200]);
 public Node Next;
}

package <missing>;

public class GlobalMembers
{
	public static int Insert(Node Head)
	{
		Node Tmp;
		Tmp = new Node();
		Tmp.Info = new Scanner(System.in).nextLine();
		if (strcmp(Tmp.Info,"end") == 0)
		{
			 Tmp = null;
			 return 0;
		}
		else
		{
			  Tmp.Next = Head.Next;
			  Head.Next = Tmp;
			  return 1;
		}
	}

	public static int Main()
	{
		Node Head;
		Node Tmp;
		Head = new Node();
		Head.Next = null;
//C++ TO JAVA CONVERTER TODO TASK: Variables cannot be declared in if/while/switch conditions in Java:
		while (Insert(Head) != 0)
		{
			;
		}
		Tmp = Head;
		while (Tmp.Next != null)
		{
			  Tmp = Tmp.Next;
			  System.out.printf("%s\n",Tmp.Info);
		}
	   return 1;
	}



}
