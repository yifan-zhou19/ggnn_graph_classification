package <missing>;

public class GlobalMembers
{
	/*  */
	/*author:???*/
	/* time:2011.12.30*/



	public static int Main()
	{
		int n;
		int i;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p = null;
		int p = null;
		int mianji;
		int[][] zhongliu = new int[1000][1000];
		int[] zuoshang = new int[2];
		int[] youxia = new int[2];
		p = zhongliu[0];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				*(p + i * n + j) = ConsoleInput.readToWhiteSpace(true);
			}
		}
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				if (*(p + i * n + j) == 0 && *(p + i * n + j + 1) == 0 && *(p + (i + 1) * n + j) == 0 && j + 1 < n && i + 1 < n)
				{
					zuoshang[0] = i;
					zuoshang[1] = j;
				}
				else if (*(p + i * n + j) == 0 && *(p + i * n + j - 1) == 0 && *(p + (i - 1) * n + j) == 0 && j - 1 > 0 && i - 1 > 0)
				{
					youxia[0] = i;
					youxia[1] = j;
				}
			}
		}
		mianji = (youxia[0] - zuoshang[0] - 1) * (youxia[1] - zuoshang[1] - 1);
		System.out.print(mianji);
		System.out.print("\n");
		return 0;
	}
}

