package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int max = 0;
		int i;
		int jc = 0;
		int[] a = new int[1000];
		int[] b = new int[1000];
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
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		if (n == 1)
		{
			if (a[0] >= 90 && a[0] <= 140 && b[0] >= 60 && b[0] <= 90)
			{
				System.out.printf("%d\n",n);
			}
			else
			{
				System.out.print("0");
			}
		}
		else if (n != 1)
		{
		for (i = 0;i < n;i++)
		{
			if ((a[i] >= 90 && a[i] <= 140 && b[i] >= 60 && b[i] <= 90))
			{
				jc++;
				if (jc > max)
				{
					max = jc;
				}
			}
			else
			{
				jc = 0;
			}
		}
		System.out.printf("%d\n",max);
		}

		return 0;
	}

}

