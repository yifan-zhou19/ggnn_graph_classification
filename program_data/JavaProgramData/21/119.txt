package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n;
		int sum = 0;
		int temp;
		int[] a = new int[300];
		float a1;
		float a2;
		float average;
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
			sum += a[i];
		}
		average = (float)sum / (float)n;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n - i - 1;j++)
			{
				if (a[i] > a[i + 1])
				{
					temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
				}
			}
		}
		a1 = Math.abs(average - (float)a[0]);
		a2 = Math.abs(average - (float)a[n - 1]);
		if (a1 == a2)
		{
			System.out.printf("%d,%d",a[0],a[n - 1]);
		}
		else
		{
			if (a1 > a2)
			{
				System.out.printf("%d",a[0]);
			}
			else
			{
				System.out.printf("%d",a[n - 1]);
			}
		}
	}
}

