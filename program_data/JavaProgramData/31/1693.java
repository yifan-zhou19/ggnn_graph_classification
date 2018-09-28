public class stu
{
	public String zifu = new String(new char[200]);
	public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static stu[] stu = tangible.Arrays.initializeWithDefaultstuInstances(1000);
	public static void Main()
	{
		int i;
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to contain a copy constructor call - this should be verified and a copy constructor should be created:
//ORIGINAL LINE: struct stu *p=stu;
		stu[] p = new stu(stu);
		for (i = 0;i < 1000;i++,p++)
		{
			p.zifu = new Scanner(System.in).nextLine();
			final String str = "end";
			if ((strcmp(p.zifu,str)) == 0)
			{
				break;
			}
			p.next = (p - 1);
		}
		p = p - 1;
		stu[0].next = null;
		while (p != null)
		{
			System.out.println(p.zifu);
			p = p.next;
		}
	}

}

