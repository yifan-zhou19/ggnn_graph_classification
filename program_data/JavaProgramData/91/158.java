package <missing>;

public class GlobalMembers
{
	public static int hh(char stu1,char stu2)
	{
		int a1;
		int a2;
		int b;
		a1 = stu1;
		a2 = stu2;
		b = a1 + a2;
		return (b);
	}
	public static int Main()
	{
		final String s = "";
		int[] b = new int[1000];
		int i;
		String ps;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *pb;
		int pb;
		s = new Scanner(System.in).nextLine();
		i = 0;
		ps = s;
		pb = b;
		while (*(ps.Substring(i) + 1) != '\0')
		{
			*(pb + i) = hh(*(ps.Substring(i)), *(ps.Substring(i) + 1));
			i++;
		}
		*(pb + i) = hh(ps, *(ps.Substring(i)));
		for (i = 0; * (pb + i) != 0;i++)
		{
			System.out.printf("%c",*(pb + i));
		}
		return 0;

	}

}
