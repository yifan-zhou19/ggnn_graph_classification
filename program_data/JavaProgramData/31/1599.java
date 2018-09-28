public class student
{
	public String str = new String(new char[100]);
	public student pre;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static student p1;
	public static student p2;

	public static student create()
	{
		student last;
		student head;
		p1 = p2 = new student(); //????
		p1.str = new Scanner(System.in).nextLine(); //?????
		head = null;
		n = 0;
		while (strcmp(p1.str,"end") != 0)
		{
				n = n + 1; //??????
			if (n == 1)
			{
				head = p1;
				p1.pre = null; //??????pre??
			}
			else
			{
				p1.pre = p2; //????pre????????

			}
				p2 = p1; //?????
				p1 = new student(); //????
				p1.str = new Scanner(System.in).nextLine();

		}
		last = p1.pre = p2;
		return (last);
	}
	public static void Main()
	{
		 student create = new student();
		 student last;
		 student p;
		 last = create();
		 p = last;
		do
		{
			  System.out.printf("%s\n", p.str);
				p = p.pre;
		} while (p.pre != null);
		 if (p.pre == null)
		 {
		  System.out.printf("%s\n", p.str);
		 }

	}


}
