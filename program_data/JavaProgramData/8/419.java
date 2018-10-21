package <missing>;

public class GlobalMembers
{
	public static int paixu(int n,int m)
	{
		int i;
		int j;
		int num;
		int[] shuzu = new int[1000];
		for (i = 1;i <= n + m;i++)
		{
			num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			shuzu[i] = num;
		}
		for (i = 1;i <= n;i++)
		{
			for (j = n - 1;j >= i;j--)
			{
				if (shuzu[j] > shuzu[j + 1])
				{
					num = shuzu[j],shuzu[j] = shuzu[j + 1],shuzu[j + 1] = num;
				}
			}
		}
		for (i = n + 1;i <= n + m;i++)
		{
			for (j = n + m - 1;j >= i;j--)
			{
				if (shuzu[j] > shuzu[j + 1])
				{
					num = shuzu[j],shuzu[j] = shuzu[j + 1],shuzu[j + 1] = num;
				}
			}
		}
		for (i = 1;i <= n + m;i++)
		{
			if (i == m + n)
			{
				System.out.print(shuzu[i]);
			}
			else
			{
				System.out.print(shuzu[i]);
				System.out.print(" ");
			}
		}
		return 0;
	}
	public static int Main()
	{
		int n1;
		int n2;
		n1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		paixu(n1, n2);
		return 0;
	}
}

