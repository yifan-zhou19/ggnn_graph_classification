public class student
{
	public String inf = new String(new char[200]);
	public student prev;
}

package <missing>;

public class GlobalMembers
{
	public static student creat()
	{
		student p1;
		student p2;
		student head;
		p1 = p2 = new student();
		p1.inf = new Scanner(System.in).nextLine();
		p1.prev = null;
		while (p1.inf.charAt(0) != 'e')
		{
			p2 = p1;
			p1 = new student();
			p1.inf = new Scanner(System.in).nextLine();
			p1.prev = p2;
		}
		return (p2);
	}
	public static void print_f(student head)
	{
		student p1;
		p1 = head;
		while (p1 != 0)
		{
			System.out.printf("%s\n",p1.inf);
			p1 = p1.prev;
		}
	}
	public static void Main()
	{
		print_f(creat());
	}
}
