public class student
{
	public String a = new String(new char[80]);
	public student pro;
}

package <missing>;

public class GlobalMembers
{
	public static student creat()
	{
		student end;
		student p1;
		student p2;
		p2 = new student();
		p2.a = new Scanner(System.in).nextLine();
		p2.pro = null;
		p1 = p2;
		do
		{
			p2 = new student();
			p2.a = new Scanner(System.in).nextLine();
			if (strcmp(p2.a,"end") == 0)
			{
				p2 = null;
				break;
			}
			else
			{
				p2.pro = p1;
				p1 = p2;
				end = p2;
			}
		} while (1 != 0);
		return (end);
	}

	public static void Main()
	{
		student creat = new student();
		void destroy(struct student * end);
		student end;
		student p;
		end = creat();
		p = end;
		do
		{
			System.out.println(p.a);
			p = p.pro;
		} while (p != null);

	}

}
