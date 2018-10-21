package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[110];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		int n;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * i;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *j;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = a;i < a + n;i++)
		{
			*i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (j = a + n - 1;j > a;j--)
		{
			System.out.print(j);
			System.out.print(' ');
		}
		System.out.print(a);

		return 0;
	}
}

