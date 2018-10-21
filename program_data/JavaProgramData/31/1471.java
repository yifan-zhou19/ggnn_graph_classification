public class student
{
	public String information = new String(new char[100]);
	public student previous;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		student p1;
		student p2;
		student p;
		p1 = z;
		p1.previous = null;
		p1.information = new Scanner(System.in).nextLine();
		do
		{
			p2 = z; //???p1,p2??????????????
			p2.previous = p1;
			p1 = p2;
			 p2.information = new Scanner(System.in).nextLine();
		} while (strcmp(p1.information,"end"));
		p1 = p1.previous;
		for (p = p1;p != null;p = p.previous)
		{
			System.out.println(p.information);
		}
	}

}
