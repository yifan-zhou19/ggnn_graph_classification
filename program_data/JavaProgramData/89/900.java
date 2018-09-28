package <missing>;

public class GlobalMembers
{
	//*******************************************************
	//*12.7??  ??????                               *
	//*?????  ?? 1100012844                          *
	//*???2011?12?10?                                 *
	//*******************************************************
	public static int Main()
	{

		// ???????????????????????
		// ??????????????
		int[][] a = new int[10000][2];
		int n;
		int i;
		int j;
		int k;
		int flag = 1;
		int[] p = 0; // ????
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a, 0, (Integer.SIZE / Byte.SIZE)); // ????
		p = a; // ????????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		j = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (i != 0 || j != 0) // ????
		{
			*(p[i]) += 1; // i????+1
			*(p[j] + 1) += 1; // ??j??+1
			i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			j = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (k = 0; k < n; k++) // ??
		{

			// ???????0???n - 1??????????????
			if (*(p[k]) == 0 && *(p[k] + 1) == n - 1)
			{
				System.out.print(k);
				System.out.print("\n");
				flag = 0;
			}
		}

		// ??????NOT FOUND
		if (flag != 0)
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
		}
		return 0;
	}
}

