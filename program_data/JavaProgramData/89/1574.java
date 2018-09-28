package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[10000][2];
		int n;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE));
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int b;
		int c;
		int f;
		while (scanf("%d %d", b, c))
		{
			if (b == 0 && c == 0)
			{
				break;
			}
			a[b][0] = 1;
			a[c][1]++;
		}
		f = 0;
		for (i = 0;i < n;i++)
		{
			if (a[i][0] == 0 && a[i][1] == n - 1)
			{
				f = 1;
				System.out.printf("%d\n",i);
			}
		}
		if (f == 0)
		{
			System.out.print("NOT FOUND\n");
		}
	}
}

