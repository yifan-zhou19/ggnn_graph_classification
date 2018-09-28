public class Student
{
	public String r = new String(new char[200]);
	public Student next;
	public Student up;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		Student p;
		Student h;
		Student pre;
		h = null;
		while (true)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p = malloc(L);
			if (h == null)
			{
				h = p;
				p.up = h;
			}
			else
			{
				pre.next = p;
				p.up = pre;
			}
			p.r = new Scanner(System.in).nextLine();
			if (strcmp(p.r,"end") == 0)
			{
				break;
			}
			//scanf("\n");
			pre = p;
		}
		p = pre;
		while (true)
		{
			System.out.printf("%s",p.r);
			if (p == h)
			{
				break;
			}
			else
			{
				System.out.print("\n");
			}
			p = p.up;
		}
		return 0;
	}
}
