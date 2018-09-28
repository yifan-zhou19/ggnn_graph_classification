package <missing>;

public class GlobalMembers
{
	public static int a;
	public static int b;
	public static int[] c = new int[100];
	public static int[] d = new int[100];
	public static void size()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
	}
	public static void num(int s, int[] j)
	{
		int i;
	for (i = 0;i < s;i++)
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			j[i] = Integer.parseInt(tempVar);
		}
	}
	}
	public static void arrange(int s, int[] j)
	{
		int i;
		int k;
		int temp;
	for (k = 0;k < s - 1;k++)
	{
		for (i = 0;i < s - k - 1;i++)
		{
		if (j[i + 1] <= j[i])
		{
			temp = j[i];
			j[i] = j[i + 1];
			j[i + 1] = temp;
		}
		}
	}
	}
	public static void plus(int x, int[] m, int y, int[] n)
	{
		int i;
	arrange(x, m);
	arrange(y, n);
	System.out.printf("%d",m[0]);
	for (i = 1;i < x;i++)
	{
		System.out.printf(" %d",m[i]);
	}
	for (i = 0;i < y;i++)
	{
		System.out.printf(" %d",n[i]);
	}
	}
	public static void Main()
	{
		size();
		num(a, c);
		num(b, d);
		plus(a, c, b, d);
	}

}

