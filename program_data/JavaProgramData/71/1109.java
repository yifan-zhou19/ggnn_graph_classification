package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] year = new int[200];
		int[] a = new int[200];
		int[] b = new int[200];
		int e;
		int i;
		int j;
		int k;
		int x = 1;
		int y = 1;
		int[] day = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				year[i] = Integer.parseInt(tempVar2);
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
		for (i = 0; i < n; i++)
		{
					  x = 1;
			y = 1;
			day[1] = 28;
			if (((year[i] % 4 == 0) && (year[i] % 100 != 0)) || (year[i] % 400 == 0))
			{
				day[1] = 29;
			}
			for (j = 1; j < a[i]; j++)
			{
				 x = x + day[j - 1];
			}
			for (k = 1; k < b[i]; k++)
			{
				y = y + day[k - 1];
			}
			e = (x - y) % 7;
			if (e == 0)
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}
		}
		return 0;
	}
}

