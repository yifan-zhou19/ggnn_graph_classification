package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int g;
	int j;
	int[] a = new int[200];
	int[] b = new int[200];
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
	g = 0;
	for (j = 0;j < n;j++)
	{
		if ((a[j] - b[j] == -1) || (a[j] - b[j] == 2))
		{
		g += 1;
		}
		else
		{
			if (a[j] - b[j] == 0)
			{
			g = g;
			}
			else
			{
				g += -1;
			}
		}
	}
	if (g > 0)
	{
	System.out.print("A");
	}
	if (g == 0)
	{
	System.out.print("Tie");
	}
	if (g < 0)
	{
	System.out.print("B");
	}
	return 0;
	}
}

