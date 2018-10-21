public class student
{
	public String info = new String(new char[50]);
	public student p;
}
	p = head,j = 0;

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		student p;
		student head;
		for (i = 0;;i++)
		{
			p = DT;
			if (i == 0)
			{
			  p.p = null;
			}
			p.info = new Scanner(System.in).nextLine();
			if (strcmp(p.info,"end") == 0)
			{
				break;
			}
			p.p = head;
			head = p;
		}
		for (p = head,j = 0;j < i;j++,p = p.p)
		{
			System.out.println(p.info);
		}
	}



}
