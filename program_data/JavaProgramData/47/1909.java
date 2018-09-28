package <missing>;

public class GlobalMembers
{
	/*
	 * ????nixu.cpp
	 * ??????
	 * ?????2012 12 22
	 * ?????????
	 */



	public static int Main()
	{
		int i;
		int n;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		p = a; //??????????????
		for (i = 0;i < n;i++)
		{
			*(p + n - 1 - i) = ConsoleInput.readToWhiteSpace(true);
		}
		for (i = 0;i < n;i++)
		{
			if (i != n - 1)
			{
			System.out.print((p + i));
			System.out.print(' ');
			}
			else
			{
				System.out.print((p + i));
				System.out.print("\n");
			}
		}
	}

}

