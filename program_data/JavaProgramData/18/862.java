package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int l;
		int n;
		int[][] arr = new int[101][101];
		int[][] temp = new int[101][101];
		int cnt_a;
		int cnt_b;
		int[] ptr = new int[101];
		int ans;
		int m;
		int[] ptr_t = new int[101];
		int mini;
		ptr = arr;
		ptr_t = temp;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 0; k < n; ++k)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(arr, 0, (Integer.SIZE / Byte.SIZE));
			ans = 0;
			for (i = 0; i < n; ++i)
			{
				for (j = 0; j < n; ++j)
				{
					*(ptr[i] + j) = ConsoleInput.readToWhiteSpace(true);
				}
			}
			m = n;
			for (i = 0; i < n - 1; ++i)
			{
				mini = 2147483647;
				for (j = 0; j < m; ++j)
				{
					mini = 2147483647;
					for (l = 0; l < m; ++l)
					{
						if (*(ptr[j] + l) < mini)
						{
							mini = (ptr[j] + l);
						}
					}
					for (l = 0; l < m; ++l)
					{
						*(ptr[j] + l) -= mini;
					}
				}
				mini = 2147483647;
				for (j = 0; j < m; ++j)
				{
					mini = 2147483647;
					for (l = 0; l < m; ++l)
					{
						if (*(ptr[l] + j) < mini)
						{
							mini = (ptr[l] + j);
						}
					}
					for (l = 0; l < m; ++l)
					{
						*(ptr[l] + j) -= mini;
					}
				}
				ans += *(ptr[1] + 1);
				cnt_a = 0;
				cnt_b = 0;
				for (j = 0; j < m; ++j)
				{
					cnt_b = 0;
					for (l = 0; l < m; ++l)
					{
						if (j == 1 || l == 1)
						{
							continue;
						}
						*(ptr_t[cnt_a] + cnt_b) = *(ptr[j] + l);
						cnt_b++;
					}
					if (j != 1)
					{
						cnt_a++;
					}
				}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
				memset(arr, 0, (Integer.SIZE / Byte.SIZE));
				for (j = 0; j < cnt_a; ++j)
				{
					for (l = 0; l < cnt_b; ++l)
					{
						*(ptr[j] + l) = *(ptr_t[j] + l);
					}
				}
				m--;
			}
			System.out.print(ans);
			System.out.print("\n");
		}
		return 0;
	}


}

