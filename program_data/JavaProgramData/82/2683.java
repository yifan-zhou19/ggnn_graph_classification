package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int e;
	int n;
	int m;
	int i;
	m = 0;
	e = 0;
	int[] a = new int[100];
	int[] b = new int[100];
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
	for (i = 0;i < n;i++)
	{
		if (a[i] >= 90 && a[i] <= 140)
		{
			if (b[i] >= 60 && b[i] <= 90)
			{
			m++;

			if (m > e)
			{
			e = m;
			}

			}
			else
			{
				m = 0;
			}

		}
		else
		{
			m = 0;
		}

	}
	System.out.printf("%d",e);



		return 0;
	}

}

