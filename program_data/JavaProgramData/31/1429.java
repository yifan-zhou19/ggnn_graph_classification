public class student
{
	public String c = new String(new char[100]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static student creat()
	{
		student p1;
		student p2;
		student p;
		int i;
		p1 = p2 = new student();
		p = p1;
		p1.c = new Scanner(System.in).nextLine();
		while (strcmp(p1.c,"end") != 0)
		{
			p1 = new student();
			p1.c = new Scanner(System.in).nextLine();
			if (strcmp(p1.c,"end") == 0)
			{
				break;
			}
			p2.next = p1;
			p2 = p1;
		}
		p2.next = null;
		return p;
	}
	public static student change(student p)
	{
		student p1;
		student p2;
		student p3;
		p1 = p;
		p2 = p;
		p3 = null;
		while (p1.next != null)
		{
			p2 = p1.next;
			p1.next = p3;
			p3 = p1;
			p1 = p2;
		}
		p1.next = p3;
		return (p1);
	}
	public static void print(student p)
	{
		student p1;
		student p2;
		p1 = p;
		while (p1 != null)
		{
			System.out.printf("%s\n",p1.c);
			p1 = p1.next;
		}
	}
	public static void Main()
	{
		student p;
		student p1;
		p = creat();
		p = change(p);
		print(p);
	}


}
