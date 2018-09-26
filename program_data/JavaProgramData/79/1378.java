package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int pos;
		int[] f = new int[400];
		while ((scanf("%d %d", n, m), n | m) != 0)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(f,0,(Integer.SIZE / Byte.SIZE));
			pos = 0;
			for (i = 1;i <= n;i++)
			{
				j = 0;
				while (j < m)
				{
					pos++;
					if (pos > n)
					{
						pos = 1;
					}
					if (f[pos] == 0)
					{
						j++;
					}

				}
				//printf("!%d\n",pos);
				f[pos] = 1;
			}
			System.out.printf("%d\n",pos);
		}
		return 0;
	}

}
