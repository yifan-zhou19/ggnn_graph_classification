//C++ TO JAVA CONVERTER NOTE: Java has no need of forward class declarations:
//struct Node;


/* Place in implementation file */
/* Stack implementation is a linked list with a header */
public class Node
{
	public int num;
	public char Element;
	public Node Next;
}

package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//int Isempty(Node S);
	public static Node CreateStack()
	{
		Node S;
		S = new Node();
		if (S == null)
		{
			System.out.print("Out of space!!");
			System.exit(0);
		}
		S.Next = null;
		MakeEmpty(S);
		return S;
	}
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//void DisposeStack(Node S);
	public static void MakeEmpty(Node S)
	{
		if (S == null)
		{
			System.out.print("Must use CreateStack first");
			System.exit(0);
		}
		else
		{
			while (IsEmpty(S) == 0)
			{
				Pop(S);
			}
		}
	}
	public static void Push(char X, int n, Node S)
	{
		Node TmpCell;
		TmpCell = new Node();
		if (TmpCell == null)
		{
			System.out.print("Out of space!!");
			System.exit(0);
		}
		else
		{
			TmpCell.Element = X;
			TmpCell.num = n;
			TmpCell.Next = S.Next;
			S.Next = TmpCell;
		}
	}
	public static int Top(Node S)
	{
		if (IsEmpty(S) == 0)
		{
			return S.Next.num;
		}
		System.out.print("Empty stack");
		return 0;
	}
	public static void Pop(Node S)
	{
		Node FirstCell;
		if (IsEmpty(S) != 0)
		{
			System.out.print("Empty stack");
			System.exit(0);
		}
		else
		{
			FirstCell = S.Next;
			S.Next = S.Next.Next;
			FirstCell = null;
		}
	}

	public static int IsEmpty(Node S)
	{
		return S.Next == null;
	}
	public static void Main()
	{
		Node S;
		String a = new String(new char[150]);
		int i;
		a = new Scanner(System.in).nextLine();
		S = CreateStack();
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			Push(a.charAt(i), i, S);
			while (IsEmpty(S) == 0 && S.Next.Next != null && S.Next.Next.Element != S.Next.Element)
			{
				System.out.printf("%d %d\n",Top(S.Next),Top(S));
				Pop(S);
				Pop(S);
			}
		}while (IsEmpty(S) == 0);
		MakeEmpty(S);
	}



}
