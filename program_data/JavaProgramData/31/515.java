public class Stu
{
	public String stu = new String(new char[100]);
	public Stu link;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		Stu p1;
		Stu p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p2 = p1 = (Stu)malloc(LEN);
		p1.stu = new Scanner(System.in).nextLine();
		p1.link = null;
		for (;;)
		{
			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (Stu)malloc(LEN);
			p1.stu = new Scanner(System.in).nextLine();
			p1.link = p2;
			if (strcmp(p1.stu,"end") == 0)
			{
				break;
			}
		}
		for (;;)
		{
			System.out.println(p2.stu);
			p2 = p2.link;
			if (p2 == null)
			{
				break;
			}
		}
		return 0;
	}

}
