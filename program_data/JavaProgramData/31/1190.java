public class student
{
	public String a = new String(new char[100]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static student create()
	{
		student p1;
		student p2;

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (student)malloc(len);
		p1.a = new Scanner(System.in).nextLine();
		p1.next = null;

		p2 = p1;
		for (;;)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(len);
			p1.a = new Scanner(System.in).nextLine();
			if (strcmp(p1.a,"end") == 0)
			{
				p1 = null;
				break;
			}
			p1.next = p2;
			p2 = p1;
		}
		return p2;
	}

	public static void Main()
	{
		student head;
		student p1;
		student create = new student();
		head = create();
		p1 = head;
		while (p1 != null)
		{
			System.out.printf("%s\n",p1.a);
			p1 = p1.next;
		}
	}


}
