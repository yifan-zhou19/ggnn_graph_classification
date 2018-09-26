package <missing>;

public class GlobalMembers
{
	public static int Joseph(int n,int m)
	{
		int[] l = new int[300];
		int i;
		int j;
		for (i = 0;i < n - 1;i++)
		{
			l[i] = i + 1;
		}
		l[n - 1] = 0;
		do
		{
			for (j = 1;j < m;j++)
			{
				i = l[i];
			}
			l[i] = l[l[i]];
		} while (l[i] != i);
		return (i + 1);
	}
	public static void Main()
	{
		int n;
		int m;
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (n == 0 && m == 0)
			{
				break;
			}
			System.out.printf("%d\n",Joseph(n, m));
		}
	}
}

