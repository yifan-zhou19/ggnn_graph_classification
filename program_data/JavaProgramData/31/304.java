public class stu
{
	public String a = new String(new char[100]);
public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		stu head;
		stu p1;
		stu p2;
	head = new stu();
	p1 = head;
	p2 = head;
	p1.next = null;
		while (true)
		{
		p1.a = new Scanner(System.in).nextLine();
		if (strcmp(p1.a,"end") == 0)
		{
		break;
		}
		else
		{
		head = p1;
		}
		p1 = new stu();

	   p1.next = p2;
	   p2 = p1;
		}

	p1 = head;
	while (true)
	{
	System.out.println(p1.a);
	if (p1.next == 0)
	{
	break;
	}
	p1 = p1.next;
	}

	   return 0;
	}

}
