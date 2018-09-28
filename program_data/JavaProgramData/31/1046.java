public class node
{
	public String str = new String(new char[MAX]);
	public node next;
}

package <missing>;

public class GlobalMembers
{
	public static node head;

	public static void Main()
	{
		node p1;
		node p2;
		node p;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (node)malloc(LEN);
		p1.str = new Scanner(System.in).nextLine();
		p1.next = null;
		while (strcmp(p1.str, "end") != 0)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (node)malloc(LEN);
			p1.str = new Scanner(System.in).nextLine();
			p1.next = p2;
			head = p2;
			p2 = p1;
		}

		p = head;
		while (p != 0)
		{
			System.out.println(p.str);
			p = p.next;
		}
	}

}
