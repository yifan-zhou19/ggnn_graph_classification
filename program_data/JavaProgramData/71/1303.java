package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int min;
		int max;
		int t;
		int n;
		int i;
		int Y;
		int[] a = new int[12];
		int y;
		int j;
		int s = 0;
		a[1] = a[3] = a[5] = a[7] = a[8] = a[10] = a[12] = 31,a[4] = a[6] = a[9] = a[11] = 30;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				y = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				Y = Integer.parseInt(tempVar4);
			}
			if ((n % 100 != 0 && n % 4 == 0) || (n % 100 == 0 && n % 400 == 0))
			{
				a[2] = 29;
			}
				else
				{
					a[2] = 28;
				}
			if (y < Y)
			{
				min = y,max = Y;
			}
			else
			{
				min = Y,max = y;
			}
			for (j = min;j < max;j++)
			{
				s = s + a[j];
			}
			if (s % 7 == 0)
			{
				System.out.print("YES\n");
				s = 0;
			}
			else
			{
				System.out.print("NO\n");
				s = 0;
			}
		}
		return 0;
	}

}

