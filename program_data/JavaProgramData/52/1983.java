package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int[] num = new int[100];
		int temp;
		int i;
		int k;
		int j;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				num[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0,k = 1;k <= m;i++,k++)
		{
			temp = num[i];
			num[i] = num[n - m + k - 1];
			for (j = 0;j < n - m;j++)
			{
				num[n - m + k - 1 - j] = num[n - m + k - 1 - j - 1];
			}
			num[i + 1] = temp;
		}
		for (i = 0;i < n;i++)
		{
			if (i != 0)
			{
				System.out.printf(" %d",num[i]);
			}
			else if (i == 0)
			{
				System.out.printf("%d",num[i]);
			}
		}
	}


}

