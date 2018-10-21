package <missing>;

public class GlobalMembers
{
	/*
	????
	??
		?????????????
		f[i,j]????i????j?????????
		??????????
		i?j????N?????O(sqrt(n))???
	?????
		?????O(n^(3/2))
		?????O(n)
	*/
	public static int Main()
	{
		int[][] f = new int[200][200];
		int[] div = new int[40000];
		int[] divth = new int[200];
		int kase = 0;
		kase = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (; kase > 0; kase--)
		{
			int n = 0;
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(f,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(div,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(divth,0,(Integer.SIZE / Byte.SIZE));
			int m = 0;
			for (int i = 1; i <= n; i++)
			{
				if (n % i == 0)
				{
					div[i] = ++m;
					divth[m] = i;
				}
			}
			f[1][1] = 1;
			for (int i = 2; i <= m; i++)
			{
				for (int j = 2; j <= i; j++)
				{
					for (int k = j; k > 1; k--)
					{
						if (divth[i] % divth[k] == 0)
						{
							int ii = divth[i] / divth[k];
							int jj = k;
							if (div[ii] < jj)
							{
								jj = div[ii];
							}
							f[i][j] += f[div[ii]][jj];
						}
					}
				}
			}
			System.out.print(f[m][m]);
			System.out.print("\n");
		}
		return 0;
	}
}

