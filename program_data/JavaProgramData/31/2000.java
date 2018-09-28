public class node
{
	public String str = new String(new char[100]);
	public node next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		node head = null;
		node element;
		String str = new String(new char[100]);
		str = new Scanner(System.in).nextLine();
		while (strcmp(str,"end"))
		{
			element = new node();
			element.str = str;
			element.next = head;
			head = element;
			str = new Scanner(System.in).nextLine();
		}
		while (head != null)
		{
			System.out.println(head.str);
			head = head.next;
		}
	}
}
