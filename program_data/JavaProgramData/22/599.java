package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int max;
		int imax;
		int n;
		int i = 1;
		int[] a = new int[310];
		char c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
		while ((c = System.in.read()) == ',')
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			i++;
		}
		n = i;
		if (n == 1)
		{
			System.out.print("No");
		}
		else
		{
			for (i = 0;i < n;i++)
			{
				if (a[i] != a[0])
				{
					break;
				}
			}
			if (i == n)
			{
				System.out.print("No");
			}
			else
			{
				max = 0;
				for (i = 1;i < n;i++)
				{
					if (a[i] < a[max])
					{
						imax = i;
						break;
					}
					else if (a[i] > a[max])
					{
						imax = max;
						max = i;
						break;
					}
				}
				for (;i < n;i++)
				{
					if (a[i] > a[max])
					{
						imax = max;
						max = i;
					}
					else if (a[i] < a[max] && a[i]> a[imax])
					{
						imax = i;
					}
				}
				System.out.printf("%d",a[imax]);
			}
		}
	}

}

