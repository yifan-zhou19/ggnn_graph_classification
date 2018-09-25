package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1000]; //??
		int n;
		int[] b = new int[1000];
		int m = 0;
		int f;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[i] % 2 == 1)
			{
			   m++;
			   b[m] = a[i];
			}
		}
		for (int i = 1;i <= 1000;i++) //??
		{
			for (int j = 1;j < m;j++)
			{
				if (b[j] > b[j + 1])
				{
				   f = b[j];
				   b[j] = b[j + 1];
				   b[j + 1] = f;
				}
			}
		}
		for (int i = 1;i <= m;i++) //??
		{
			System.out.print(b[i]);
			if (i == m)
			{
			break;
			}
			System.out.print(",");
		}
		return 0;
	}


}

