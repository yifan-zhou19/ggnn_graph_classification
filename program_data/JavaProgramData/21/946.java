package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int sum = 0;
		int i;
		int j;
		int[] a = new int[301];
		int temp;
		double ave;
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
				(a + i) = tempVar2;
			}
		}
		for (i = 0;i < n;i++)
		{
			sum += a[i];
		}
		ave = (double)sum / (double)n;
		for (j = 1;j < n;j++)
		{
			for (i = 0;i < n - j;i++)
			{
				if (Math.abs(ave - a[i]) < Math.abs(ave - a[i + 1]))
				{
					temp = a[i];
					a[i] = (a + i + 1);
					a[i + 1] = temp;
				}
			}
		}
		temp = 0;
		for (i = 0;i < n;i++)
		{
			if (Math.abs(ave - a[i]) != Math.abs(ave - a[i + 1]))
			{
				if (temp == 0)
				{
					System.out.printf("%d",a[i]);
					temp++;
				}
				else
				{
					System.out.printf(",%d",a[i]);
				}
				break;
			}
			else
			{
				if (temp == 0)
				{
					System.out.printf("%d",a[i]);
					temp++;
				}
				else
				{
					System.out.printf(",%d",a[i]);
				}
			}
		}
		System.out.print("\n");
		return 0;
	}
}

