package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int[] a = new int[300];
	int[] b = new int[300];
	int i;
	int j = 0;
	int n;
	int eva = new int(int x,int y,int b[]);
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
	}
	for (i = 0;i < n;i++)
	{
	if (eva(a[i], j, b) != 0)
	{
		b[j] = a[i];
		j = j + 1;
	}
	}
	for (i = 0;i < j - 1;i++)
	{
	System.out.printf("%d,",b[i]);
	}
	System.out.printf("%d",b[j - 1]);
	}

	public static int eva(int x, int y, int[] b)
	{
		int i;
	for (i = 0;i < y;i++)
	{
	if (x == b[i])
	{
		return (0);
		break;
	}
	}
	 return (1);
	}
}

