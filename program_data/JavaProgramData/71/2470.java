package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] y = new int[200];
		int m;
		int s = 0;
		int n;
		int i;
		int p = 0;
		int[] a = new int[200];
		int[] b = new int[200];
		int q;
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
			y[i] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			a[i] = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			b[i] = Integer.parseInt(tempVar4);
		}
		}
	for (i = 0;i < n;i++)
	{

				for (m = 1;m < a[i];m++)
				{
					if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)
					{
						s += 31;
					}
					else if (m == 2)
					{

						if ((y[i] % 400 == 0) || ((y[i] % 100 != 0) && (y[i] % 4 == 0)))
						{
							s += 29;
						}
						else
						{
							s += 28;
						}
					}
					else
					{
						s += 30;
					}
				}
	for (m = 1;m < b[i];m++)
	{
					if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)
					{
						p += 31;
					}
					else if (m == 2)
					{

						if ((y[i] % 400 == 0) || ((y[i] % 100 != 0) && (y[i] % 4 == 0)))
						{
							p += 29;
						}
						else
						{
							p += 28;
						}
					}
					else
					{
						p += 30;
					}
	}
	q = s - p;
	if (q % 7 == 0)
	{
		System.out.print("YES\n");
	}
	else
	{
		System.out.print("NO\n");
	}
		s = 0;
		p = 0;
	}
		return 0;
	}











}

