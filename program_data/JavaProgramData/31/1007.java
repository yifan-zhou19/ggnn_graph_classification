public class node
{
	public String s = new String(new char[100]);
	public node next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   node p1;
	   node p2;
	   node head;
	   head = new node();
	   p1 = head;
	   p2 = head;
	   int i = 0;
	   while (true)
	   {
		   p2 = new node();
		   if (i == 0)
		   {
			p2.next = null;
		   }
		   else
		   {
			p2.next = p1;
		   }
		   p1 = p2;
		   p2.s = new Scanner(System.in).nextLine();
		   if (strcmp(p2.s,"end") == 0)
		   {
		   break;
		   }
		   head.next = p2;
		   i = 1;
	   }
	   p1 = head.next;
	   while (p1 != null)
	   {
		   System.out.printf("%s\n",p1.s);
		   p1 = p1.next;
	   }

		return 0;
	}

}
