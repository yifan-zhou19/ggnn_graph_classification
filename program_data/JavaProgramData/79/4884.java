package <missing>;

public class GlobalMembers
{
		public static int f(int n,int m)
		{
			if (n == 1)
			{
				return (1);
			}
			else
			{
				return ((f(n - 1, m) + m - 1) % n + 1);
			}
		}
	public static int Main()
	{
		int[] a = new int[300];
		int[] b = new int[300];
			int i;
			int n;
			for (i = 0;;i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i] = Integer.parseInt(tempVar);
				}
				String tempVar2 = ConsoleInput.scanfRead(" ");
				if (tempVar2 != null)
				{
					b[i] = Integer.parseInt(tempVar2);
				}
				if (a[i] == 0 && b[i] == 0)
				{
					break;
				}
			}
			n = i;
			for (i = 0;i < n;i++)
			{
				System.out.printf("%d\n",f(a[i], b[i]));
			}
	}
}

