public class student
{
	public String id = new String(new char[1000]);

	public student pre;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		student p1;
		student p2;
		student head1;
		student head2;
		int n = 0;
		String temp = new String(new char[1000]);
		p1 = p2 = null;
		while (gets(temp),strcmp(temp,"end") != 0)
		{
			n = n + 1;
			p1 = new student();
			p1.pre = null;
			p1.next = null;
			head1 = null;
			p1.id = temp;

			if (n == 1)
			{
				head1 = p1;
			}
			else
			{
				p2.next = p1;
				p1.pre = p2;
			}
			p2 = p1;
		}

		head2 = p2;
		while (p2 != null)
		{
			System.out.printf("%s\n",p2.id);
			p2 = p2.pre;
		}
	}

}
