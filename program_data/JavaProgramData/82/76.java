package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		int[] b = new int[100];
		int i;
		int j;
		int[] c = new int[100];
		int k = 0;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		c[0] = 0;
	for (i = 0;i < n;i++)
	{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
	}

	if (n == 1)
	{
	if (a[0] <= 140 && a[0] >= 90 && b[0] >= 60 && b[0] <= 90)
	{
		System.out.print("1");
	}
	else
	{
		System.out.print("0");
	}
	}

	if (n != 1)
	{
			for (i = 0;i < n;i++)
			{
			if (a[i] <= 140 && a[i] >= 90 && b[i] >= 60 && b[i] <= 90)
			{
				k++;
			for (j = (i + 1);j < n;j++)
			{
				if (a[j] > 140 || a[j] < 90 || b[j] < 60 || b[j]>90)
				{
					break;
				}
			}
				c[k] = j - i;
			}
			}
		for (i = 0;i < k;i++)
		{
			if (c[i] > c[i + 1])
			{
				e = c[i];
				c[i] = c[i + 1];
				c[i + 1] = e;
			}
		}
		System.out.printf("%d",c[k]);
	}
		return 0;




	}




}

