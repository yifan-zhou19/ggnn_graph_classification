///#define LEN sizeof(struct student)
public class student
{
		public String num = new String(new char[50]);
		public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static final String end = "end";

	public static student creat()
	{
		student p1;
		student p2;
		n = 0;
		p1 = p2 = new student();
		p1.num = new Scanner(System.in).nextLine();
		while (strcmp(end,p1.num) != 0)
		{
			n = n + 1;
			if (n == 1)
			{
				p2.next = null;
			}
			else
			{
				p1.next = p2;
			}
			p2 = p1;
			p1 = new student();
			p1.num = new Scanner(System.in).nextLine();

		}


		return (p2);


	}

	public static void print(student p2)
	{
		student p;
		p = p2;
			do
			{
				System.out.printf("%s\n",p.num);
				p = p.next;
			}while (p != null);
	}

	public static int Main()
	{
		print(creat());
		return 0;
	}
}
