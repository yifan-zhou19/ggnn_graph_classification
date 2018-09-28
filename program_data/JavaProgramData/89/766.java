package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int y = 0;
		int j;
		int c;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[10001];
		int[] b = new int[10001];
		for (i = 0;;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				d = Integer.parseInt(tempVar3);
			}
			if ((c != 0) || (d != 0))
			{
				a[d]++;
				b[c]--;
			}
			if ((c == 0) && (d == 0))
			{
				break;
			}
		}
		for (j = 0;j < n;j++)
		{
			if ((a[j] == n - 1) && (b[j] == 0))
			{
			 System.out.printf("%d\n",j);
			 y = 1;
			}
		}
			if (y == 0)
			{
				System.out.print("NOT FOUND\n");
			}
		return 0;
	}
}

