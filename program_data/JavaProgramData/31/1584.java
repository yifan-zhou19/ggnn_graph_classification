public class student
{
	public String a = new String(new char[100]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static student p1;
	public static student p2;
	public static student head;

	public static int Main()
	{
		int n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(Len);
		p1.a = new Scanner(System.in).nextLine();
		p2.next = null;
		while (true)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(Len);
			p1.a = new Scanner(System.in).nextLine();
			p1.next = p2;
			if (strcmp(p1.a,"end") == 0)
			{
				head = p1.next;
				break;
			}
			else
			{
				p2 = p1;
			}

		}
		p1 = head;
		while (p1 != null)
		{
			System.out.printf("%s\n",p1.a);
			p1 = p1.next;
		}


	}
}
