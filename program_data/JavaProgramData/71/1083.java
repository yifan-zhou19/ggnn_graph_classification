package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = {1, 32, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335};
		int[] b = {1, 32, 61, 92, 122, 153, 183, 214, 245, 275, 306, 336};
		int y;
		int i;
		int j;
		int n;
		int t;
		int s;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			for (t = 0;t < n;t++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					y = Integer.parseInt(tempVar2);
				}
				String tempVar3 = ConsoleInput.scanfRead(" ");
				if (tempVar3 != null)
				{
					i = Integer.parseInt(tempVar3);
				}
				String tempVar4 = ConsoleInput.scanfRead(" ");
				if (tempVar4 != null)
				{
					j = Integer.parseInt(tempVar4);
				}
			if ((y % 4 != 0) || ((y % 100 == 0) && (y % 400 != 0)))
			{
				s = a[i - 1] - a[j - 1];
			if (s % 7 == 0)
			{
			System.out.print("YES\n");
			}
			else
			{
			System.out.print("NO\n");
			}
			}
			else
			{
				s = b[i - 1] - b[j - 1];
			if (s % 7 == 0)
			{
			System.out.print("YES\n");
			}
			else
			{
			System.out.print("NO\n");
			}
			}
			}
			return 0;
	}



}

