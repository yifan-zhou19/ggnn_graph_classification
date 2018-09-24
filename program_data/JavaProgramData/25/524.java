package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] b = new int[100];
		int n;
		int i;
		int count = 0;
		int k = 1;
		int j;
		int flag = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b[0] = 1;
		for (j = 1;j <= n;j++)
		{
			for (i = 0;i < k;i++)
			{
				b[i] = b[i] * 2;
			}
			for (i = 0;i < k;i++)
			{
				if (i == k - 1 && b[i] >= 10)
				{
					k++;
				}
				if (b[i] >= 10)
				{
					b[i] = b[i] - 10;
					b[i + 1]++;
				}
			}
		}
		for (i = 99;i >= 0;i--)
		{
			if (b[i] != 0)
			{
				count = 1;
			}
			if (count != 0)
			{
				System.out.print(b[i]);
			}
		}
		return 0;
	}

}

