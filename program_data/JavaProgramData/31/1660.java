public class student
{
	public String num = new String(new char[100]);
	public student prev;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		student p1;
		student p2;
		int flag = 0;
		while (true)
		{
			p1 = new student();
			p1.num = new Scanner(System.in).nextLine();
			if (*(p1.num) == 'e')
			{
				break;
			}
			else
			{
				if (flag == 0)
				{
					p2 = p1;
					p1.prev = null;
					flag = 1;
				}
				else
				{
					p1.prev = p2;
					p2 = p1;
				}
			}
		}
		while (p2 != null)
		{
			System.out.printf("%s\n",p2.num);
			p2 = p2.prev;
		}
		return 0;
	}
}
