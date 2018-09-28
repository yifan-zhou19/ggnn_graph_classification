package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int i;
		int j;
		int b;
		int[] a = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		a[0] = 1;
		for (i = 0;i < N;i++)
		{
			for (j = 0;j < 100;j++)
			{
				a[j] *= 2;
			}
			for (j = 0;j < 100;j++)
			{
				if (a[j] > 9)
				{
					a[j + 1]++;
					a[j] %= 10;
				}
			}
		}
		for (j = 99;j >= 0;j--)
		{
			if (a[j] != 0)
			{
				b = j;
				break;
			}
		}
		for (j = b;j >= 0;j--)
		{
			System.out.printf("%d",a[j]);
		}
		return 0;
	}




}

