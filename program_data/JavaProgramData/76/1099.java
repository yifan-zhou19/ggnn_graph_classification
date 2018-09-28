package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[50000];
		int[] b = new int[50000];
		int zuo;
		int you;
		int x;
		int h = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
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
		zuo = a[0];
		you = b[0];
		for (int k = 0;k < n;k++)
		{
			if (a[k] < zuo)
			{
				zuo = a[k];
			}
			if (b[k] > you)
			{
				you = b[k];
			}
		}
		for (double z = zuo;z <= you;z += 0.5)
		{
			for (int m = 0;m < n;m++)
			{
				if ((z <= 1.0 * b[m]) && (a[m] * 1.0 <= z))
				{
					x = 1;
				}
			}
			h *= x;
			x = 0;

		}
		if (h == 0)
		{
			System.out.print("no");
		}
		else
		{
			System.out.printf("%d %d",zuo,you);
		}

			return 0;
	}




}

