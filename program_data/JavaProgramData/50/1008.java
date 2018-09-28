package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int w;
		int i;
		int d;
		int t;
	int[] a = {12, 43, 71, 102, 132, 163, 193, 224, 255, 285, 316, 346};

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		w = Integer.parseInt(tempVar);
	}
	for (i = 0, t = 0;i < 12;i++)
	{
		d = a[i] % 7 + w;
		if (d > 7)
		{
			d = d - 7;
		}

		if (d == 5)
		{
			if (t == 0)
			{
				System.out.printf("%d\n",i + 1);
			}
			else
			{
				System.out.printf("\n%d\n",i + 1);
			}
		}
	}
	return 0;
	}
}

