package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] xia = new int[GESHU];
		int[] shang = new int[GESHU];
		for (int p = 0;p < n;p++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				xia[p] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				shang[p] = Integer.parseInt(tempVar3);
			}
		}
		int max;
		int min;
		max = shang[0];
		min = xia[0];
		for (int q = 0;q < n;q++)
		{
			if (shang[q] > max)
			{
				max = shang[q];
			}
			if (xia[q] < min)
			{
				min = xia[q];
			}
		}
		int reference = 0;
		for (double r = min + 0.5;r < max;r = r + 1)
		{
			reference = 0;
			for (int s = 0;s < n;s++)
			{
				if (r >= xia[s] != 0 && r <= shang[s])
				{
					reference++;
				}
			}
			if (reference == 0)
			{
				break;
			}
		}
		if (reference == 0)
		{
			System.out.print("no");
		}
		else
		{
			System.out.printf("%d %d",min,max);
		}
		return 0;
	}
}

