public class stu
{
	public String a = new String(new char[100]);
	public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static stu create()
	{
		stu head;
		stu p1;
		stu p2;
		p2 = p1 =  new stu();
		p1.a = new Scanner(System.in).nextLine();
		p1.next = null;
		while (!(p1.a.charAt(0) == 101 && p1.a.charAt(1) == 110 && p1.a.charAt(2) == 100))
		{
			p1 =  new stu();
			p1.a = new Scanner(System.in).nextLine();
			p1.next = p2;
			p2 = p1;
		}
		return p1.next;
	}
	public static void print(stu p)
	{
		while (p != 0)
		{
			System.out.printf("%s\n",p.a);
			p = p.next;
		}
	}
	public static int Main()
	{
		stu p;
		p = create();
		print(p);
		return 0;
	}
}
