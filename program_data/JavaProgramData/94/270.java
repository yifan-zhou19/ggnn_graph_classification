package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

	int N;
	int[] x = new int[500];
	int[] y = new int[500];
	int t;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		N = Integer.parseInt(tempVar);
	}
	int b = 0;
	for (int a = 0;a < N;a++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			x[a] = Integer.parseInt(tempVar2);
		}
	if (x[a] % 2 == 1)
	{
		y[b] = x[a];
		b++;
	}
	}
	int m = 0;
	for (int k = 0;k <= b;k++)
	{
		for (int c = 1;c <= b - k;c++)
		{
			if (y[c] > y[m])
			{
				m = c;
			}
		}

	if (m != b - k)
	{
		t = y[b - k];
	y[b - k] = y[m];
	y[m] = t;
	}
	m = 0;
	}


	for (int d = 1;d <= b;d++)
	{
	if (d < b)
	{
		System.out.printf("%d,",y[d]);
	}
	else
	{
		System.out.printf("%d",y[d]);
	}



	}
	return 0;
	}



}

