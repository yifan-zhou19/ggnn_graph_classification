public class stu
{
	public stu next;
	public String a = new String(new char[100]);
}

package <missing>;

public class GlobalMembers
{
	public static void print(stu p, int n)
	{
		if (n > 0)
		{
			System.out.printf("%s",p.a);
			System.out.print("\n");
			print(p.next, n - 1);
		}
	}
	public static int Main()
	{
		int n = 1;
		int i;
		int m = 100000;
		stu p1;
		stu p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (stu)malloc(LEN);
		p1.a = new Scanner(System.in).nextLine();
			for (i = 0;i < m;i++)
			{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
				p2 = (stu)malloc(LEN);
				p2.a = new Scanner(System.in).nextLine();
				if (p2.a.charAt(0) != 'e' && p2.a.charAt(1) != 'n' && p2.a.charAt(2) != 'd')
				{
					p2.next = p1;
					p1 = p2;
					n += 1;
				}
				else
				{
					p2.next = p1;
					break;
				}
			}
			print(p2.next, n);
			return 0;
	}
}
