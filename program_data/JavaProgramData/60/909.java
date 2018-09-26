package <missing>;

public class GlobalMembers
{
	public static int sushu(int x)
	{
		int j;
		for (j = 2;j < x;j++)
		{
			if (x % j == 0)
			{
				return 0;
			}
		}
		return 1;
	}
	public static int Main()
	{
		int n;
		int i;
		int[] s = new int[10000];
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= n;i++)
		{
			if (sushu(i) != 0)
			{
				s[k] = i;
				k++;
			}
		}
		if (k == 1)
		{
			System.out.print("empty");
		}
		else
		{
		for (i = 0;i < k - 1;i++)
		{
			if (s[i + 1] - s[i] == 2)
			{
				System.out.printf("%d %d\n",s[i],s[i + 1]);
			}
		}
		}
		return 0;
	}
}

