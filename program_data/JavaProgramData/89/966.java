package <missing>;

public class GlobalMembers
{
	/************************* 
	??????? 
	??????
	???2011?12?11? 
	*************************/ 

	public static int Main()
	{
		int n;
		int i = 0;
		int j;
		int k = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 int[][] a = new int[100000][2]; // ??a[i][0]??a[i][1]
		int[] x = new int[n]; // ??x[i]?? i ???????
		int[] y = new int[n]; // ??x[i]???? i ?????
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(x, 0, (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(y, 0, (Integer.SIZE / Byte.SIZE)); // x, y ??

		for (i = 0; i < 100000; i++)
		{
			for (j = 0; j < 2; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			if ((a[i][0] == 0) && (a[i][1] == 0))
			{
				break;
			}
			k++;
		} // ??? 0 0 ????

		for (i = 0; i < k; i++)
		{
			x[a[i][0]]++;
			y[a[i][1]]++;
		}

//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p = 0; // p, q ????? x ?y???
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * q = 0;
		q = y;
		i = 0; // i ?????
		for (p = x; ; p++)
		{
			if (i == n)
			{
				System.out.print("NOT FOUND");
				break;
			}

			if ((*p == 0) && (*q == n - 1)) // ?????? 0 ??? n - 1 ????
			{
				System.out.print(i);
				break;
			}
			i++;
			q++;
		} // ???????
		return 0;
	}
}

