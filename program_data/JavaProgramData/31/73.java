public class student
{
	public String info = new String(new char[50]);
	public student pre;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i = 0;
		int n = 0;
		student p;
		student head;
		student p0;
		p = head = new student();
		while (strcmp((gets(p.info)),"end") != 0)
		{
			n += 1;
			p0 = p;
			p = p.next = new student();
			p.pre = p0;
		}

		while (i++<n)
		{
			p = p.pre;
			System.out.printf("%s\n",p.info);
		}
	}
}
