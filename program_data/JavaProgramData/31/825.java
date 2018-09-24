public class stu
{
	   public String a = new String(new char[50]);
	   public stu b;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	stu p1;
	stu p2;
	stu stu = new stu();
	p1 = p2 = stu;
	p1.b = null;
	p1.a = new Scanner(System.in).nextLine();
	for (;;)
	{
		   if (strcmp(p2.a,"end") == 0)
		   {
			   break;
		   }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		   p2 = (stu)malloc(N);
		   p2.a = new Scanner(System.in).nextLine();
		   p2.b = p1;
		   p1 = p2;

	}
	p2 = p2.b;
	for (;;)
	{
		   System.out.printf("%s",p2.a);
		   if (p2.b == null)
		   {
			   break;
		   }
		   p2 = p2.b;
		   System.out.print("\n");
	}

	}

}
