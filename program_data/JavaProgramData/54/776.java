package <missing>;

public class GlobalMembers
{
	/*
	*????111114 05.cpp
	*??????
	*?????2011-11-14
	*?????????????
	*/

	public static int Main()
	{
		int n; //????
		int k;
		int i = 1;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] f = new int[n + 1]; //????
		while (i > 0) //??????????
		{
			f[0] = (n - 1) * i; //?????
			for (j = 1;j < n + 1;j++) //????
			{
				if (f[j - 1] % (n - 1) != 0)
				{
					break;
				}
				f[j] = f[j - 1] * n / (n - 1) + k;
			}
			if (j == n + 1)
			{
				break; //???????
			}
			i = i + 1;
		}
		System.out.print(f[n]);
		System.out.print("\n");
		return 0;
	}
}

