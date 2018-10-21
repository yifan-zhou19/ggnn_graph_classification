package <missing>;

public class GlobalMembers
{
	public static int ysf(int n, int m)
	{
			if (n == 1)
			{
				return 1;
			}
			else
			{
				return (ysf(n - 1, m) + m - 1) % n + 1;
			}
	}
	public static int Main()
	{

		int[] nz = new int[500];
		int[] mz = new int[500];
		int s = 0;
		for (int i = 0;i < 500;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				nz[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				mz[i] = Integer.parseInt(tempVar2);
			}
			s++;
			if (nz[i] == 0 && mz[i] == 0)
			{
				break;
			}
		}

		for (int i = 0;i < s;i++)
		{
			while (nz[i] != 0 && mz[i] != 0)
			{
				System.out.printf("%d\n",ysf(nz[i], mz[i]));
				break;
			}
		}
		return 0;
	}

}

