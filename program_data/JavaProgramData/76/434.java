package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

	int pdz = 0;
	int x;
	int y;
	int n;
	int[] a = new int[1000];
	int[] b = new int[1000];
	int[] aa = new int[1000];
	int[] bb = new int[1000];

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

	aa[i] = a[i];

	 bb[i] = b[i];
	}

	 for (int j = 0;j < n - 1;j++)
	 {
			if (a[j] < a[j + 1])
			{
				a[j + 1] = a[j];
			}
			if (b[j] > b[j + 1])
			{
				b[j + 1] = b[j];
			}
	 }
		x = a[n - 1];
		y = b[n - 1];
		for (double o = x;o <= y;o += 0.5)
		{
			for (int q = 0;q < n;q++)
			{
				if (o >= aa[q] != 0 && o <= bb[q])
				{
					pdz += 1;
					break;
				}
				else
				{
					pdz = 0;
				}
			}
			if (pdz == 0)
			{
				break;
			}
		}
		if (pdz == 0)
		{
			System.out.print("no");
		}
		else
		{
			System.out.printf("%d %d",x,y);
		}
		return 0;
	}




}

