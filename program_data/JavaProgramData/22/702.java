package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] S = new int[300];
		int a;
		int b;
		int c;
		int i;
		int j;
		int k;
		for (i = 0;i < 300;i++)
		{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					S[i] = Integer.parseInt(tempVar);
				}
				if (System.in.read() == '\n')
				{
					break;
				}
		};

		for (j = i + 1;j < 300;j++)
		{
				S[j] = S[j - 1];
		}
		b = S[0];
		a = -32768;
		c = S[0];
		for (k = 0;k < 300;k++)
		{
			if (S[k] > b)
			{
				a = b;
				b = S[k];
			}
			if (S[k] < c)
			{
				c = S[k];
			}
			if (S[k] < b && a < S[k])
			{
				a = S[k];
			}
		}
		if (b != c && i != 0)
		{
			System.out.printf("%d\n",a);
		}
		else
		{
			System.out.print("No");
		}

		return 0;

	}
}

