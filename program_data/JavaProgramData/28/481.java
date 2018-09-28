package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'b', so pointers on this parameter are left unchanged:
	public static void getword(String a, int * b)
	{
		int i;
		int l;
		l = a.length();
		for (i = 0;i < l;i++)
		{
			if (!a[i].equals(' '))
			{
				(*b)++;
				if (a[i + 1].equals(' '))
				{
					b++;
				}
			}
		}
	}
	public static void Main()
	{
		String a = new String(new char[3001]);
		int[] b = new int[300];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *pb;
		int pb;
		int i;
		a = new Scanner(System.in).nextLine();
		pb = b[0];
		getword(a, pb);
		for (i = 0;b[i] != 0;i++)
		{
			System.out.printf("%d",*(pb + i));
			if (b[i + 1] != 0)
			{
				System.out.print(',');
			}
		}
	}
}
