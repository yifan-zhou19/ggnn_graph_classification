package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int[] a = new int[300];
		int n;
		int i;
		int j;
		int sum = 0;
		int t;
		float aver;
		float c = 0F;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			sum = sum + a[i];
		}
		aver = (float)sum / n;
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - 1 - i;j++)
			{
				if (a[j] > a[j + 1])
				{
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}
			if (aver - a[0] > a[n - 1] - aver)
			{
				System.out.printf("%d",a[0]);
			}
			else if (aver - a[0] < a[n - 1] - aver)
			{
				System.out.printf("%d",a[n - 1]);
			}
			else
			{
				System.out.printf("%d,%d",a[0],a[n - 1]);
			}


		return 0;
	}
}

