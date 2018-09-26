public class stu
{
	public String c = new String(new char[100]);
 public stu previous;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static stu creat()
	{
		stu p;
		stu q;
		n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = q = (stu)malloc(Len);
		p.c = new Scanner(System.in).nextLine();
		for (;strcmp(p.c,"end") != 0;)
		{
			n++;
			if (n == 1)
			{
				p.previous = Null;
			}
			else
			{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
				p = (stu)malloc(Len);
				p.previous = q;
				q = p;
				p.c = new Scanner(System.in).nextLine();
			}
		}
		return (p);
	}
	public static void Main()
	{
		stu p;
		p = creat();
		p = p.previous;
		for (;p != Null;)
		{
			System.out.printf("%s\n",p.c);
			p = p.previous;

		}
	}





}
