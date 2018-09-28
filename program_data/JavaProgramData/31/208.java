public class student
{
	public String locate = new String(new char[100]);
	public student next;
	public student last;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static String u = new String(new char[100]);
	public static student creat()
	{
	student head;
	student p1;
	student p2;
	n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	p1 = p2 = (student)malloc(LEN);
	p1.locate = new Scanner(System.in).nextLine();
	u = p1.locate;
	head = null;
	while (strcmp(p1.locate,"end") != 0)
	{
		n = n + 1;
	if (n == 1)
	{
		head = p1;
	}
	else
	{
		p2.next = p1;
		p1.last = p2;
	}
	p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	p1 = (student)malloc(LEN);
	p1.locate = new Scanner(System.in).nextLine();
	}
	p1.last = p2;
	p2.next = null;
	return (p2);
	}
	public static void Main()
	{
		student creat = new student();
		student p;
		p = creat();
		do
		{
			System.out.printf("%s\n",p.locate);
		p = p.last;
		}while (strcmp(p.locate,u) != 0);
		System.out.printf("%s",p.locate);
	}

}
