package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p=null;
		int p = null;
		int n;
		int[] init = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		init[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		p = init[0];

		for (int i = 1; i < n ;i++)
		{
		*(p + i) = ConsoleInput.readToWhiteSpace(true);
		}

		for (int i = 1;i < n;i++)
		{
		System.out.print((p + n - i));
		System.out.print(' ');
		}
		System.out.print(p);


		return 0;
	}

}

