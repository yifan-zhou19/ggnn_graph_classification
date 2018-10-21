package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k = 0;
		int pan;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] mon = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] ans = new int[12];
		n += 12;
		for (i = 0;i <= 11;i++)
		{
			pan = n;
			for (j = 0;j < i;j++)
			{
				pan += mon[j];
			}
			if (pan % 7 == 5)
			{
				ans[k] = i + 1;
				k++;
			}
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%d\n",ans[i]);
		}
		return 0;
	}


}

