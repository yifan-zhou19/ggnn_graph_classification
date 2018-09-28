public class shuju
{
	public String str = new String(new char[100]);
	public shuju next;
}

package <missing>;

public class GlobalMembers
{
	public static shuju create()
	{

		shuju head;
		shuju p1;
		shuju p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (shuju)malloc(len);
		p1.str = new Scanner(System.in).nextLine();
		p1.next = null;
		while (true)
		{

			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (shuju)malloc(len);
			p1.str = new Scanner(System.in).nextLine();
			if (strcmp(p1.str,"end") == 0)
			{
				p1 = null;
				break;
			}
			p1.next = p2;
		}
		head = p2;
		return (head);
	}

	public static void print(shuju head)
	{

		shuju p;
		p = head;
		while (p.next != null)
		{
			System.out.println(p.str);
		   p = p.next;
		}
		System.out.println(p.str);
	}

	public static void Main()
	{


		shuju p;
		p = create();
		print(p);
	}
}
