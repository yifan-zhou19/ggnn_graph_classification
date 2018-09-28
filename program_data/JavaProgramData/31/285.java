public class STUDENT
{
 public String student = new String(new char[100]);
	public STUDENT former;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		STUDENT p1 =  new STUDENT();
		STUDENT p2;
		p1.former = null;
		for (gets(p1.student);p1.student.charAt(0) != 'e'; gets(p1.student))
		{
			p2 = p1;
			p1 =  new STUDENT();
			p1.former = p2;
		}
		for (p1 = p1.former; p1 != null; p1 = p1.former)
		{
			System.out.printf("%s\n", p1.student);
		}
		return 0;
	}

}
