package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int[] sz = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 100;i++)
		{
			sz[0] = n;
				   if (sz[i] == 1)
				   {
				break;
				   }
			else if (sz[i] % 2 != 0)
			{
				sz[i + 1] = sz[i] * 3 + 1;
			System.out.printf("%d*3+1=%d\n",sz[i],sz[i + 1]);
			}
			else if (sz[i] % 2 == 0)
			{
				sz[i + 1] = sz[i] / 2;
				System.out.printf("%d/2=%d\n",sz[i],sz[i + 1]);
			}
		}
				   System.out.print("End");

			return 0;
	}
}

