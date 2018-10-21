package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int j;
		int a;
		int m = 1;
		int n = 1;
		int temp;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		int[] sum = new int[k];
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			if (a == 1 || a == 2)
			{
				sum[i] = 1;
			}
			else
			{
			m = 1;
			n = 1;
			sum[i] = 0;
			for (j = 1;j <= a - 2;j++)
			{
				sum[i] = m + n;
				m = n;
				n = sum[i];
			}
			}
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%d\n",sum[i]);
		}
		return 0;
	}





}

