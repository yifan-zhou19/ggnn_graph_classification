public class sa
{
	public String a = new String(new char[500]);
	public sa next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static sa kao()
	{
		sa head;
		sa p1;
		sa p2;
		n = 0;
		head = null;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (sa)malloc(len);
		p1.a = new Scanner(System.in).nextLine();
		head = p1;
		for (;;)
		{
		   n++;
		   if (n == 1)
		   {
			   p1.next = null;
		   }
		   else
		   {
			   p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			   p1 = (sa)malloc(len);
			   p1.next = p2;
			   p1.a = new Scanner(System.in).nextLine();
		   }
		   if (strcmp(p1.a,"end") == 0)
		   {
			   break;
		   }
		}
		head = p2;
		return (head);
	}
	public static int Main()
	{
		sa p;
		p = kao();
		for (;p != null;)
		{
			System.out.printf("%s\n",p.a);
			p = p.next;
		}
		return 0;
	}

}
