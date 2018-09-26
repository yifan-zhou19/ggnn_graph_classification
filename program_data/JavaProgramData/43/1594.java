package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m = 0;
		int good;
		int count = 0;
		int[] b = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i < n;i++)
		{
			good = 0;
			for (j = 2;j < i;j++)
			{
				if (i % j == 0)
				{
					good = 1;
				}
			}
			if (good == 0)
			{
				b[m] = i;
				m++;
				count++;
			}
		}
		for (i = 0;i < count;i++)
		{
			for (j = 0;j < count;j++)
			{
				if (b[i] + b[j] == n && b[i] <= b[j])
				{
					System.out.printf("%d %d\n",b[i],b[j]);
				}
			}
		}
		return 0;
	}



}

