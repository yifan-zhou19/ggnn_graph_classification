package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[301];
		char c;
		int i;
		int max;
		int lmax;
		int leap = 0;
		int n;
		int t;
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			if (c != ',')
			{
			break;
			}
		}
		n = i + 1;
		if (n == 1)
		{
		System.out.print("No");
		}
		else
		{
			for (i = 1;i < n;i++)
			{
				if (a[i] != a[i - 1])
				{
				leap = 1;
				}
			}
			if (leap == 0)
			{
			System.out.print("No");
			}
			else
			{
				max = a[0];
			for (i = 1;i < n;i++)
			{
				if (a[i] > max)
				{
					max = a[i];
					t = i;
				}
			}
			for (i = 0;i < n;i++)
			{
				if (a[i] != max)
				{
					lmax = a[i];
					break;
				}
			}
			for (i = 0;i < n;i++)
			{
				if (a[i] > lmax && a[i] != max)
				{
				lmax = a[i];
				}
			}
			System.out.printf("%d",lmax);
			}
		}
	}

}

