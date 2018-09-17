package <missing>;

public class GlobalMembers
{
	public static int x1;
	public static int y1;
	public static int[] a1 = new int[100];
	public static int[] a2 = new int[100];
	public static int max(int a,int b)
	{
		if (a >= b)
		{
			return a;
		}
		else
		{
			return b;
		}
	}
	public static void find(int n)
	{
		int i;
		int j;
		int k;
		for (j = 0;;j++)
		{
			if (power(2, j + 1) > n && power(2, j) <= n)
			{
				x1 = j;
				break;
			}
		}
	}
	public static int power(int a,int b)
	{
		int p;
		int s = 1;
		for (p = 0;p < b;p++)
		{
			s = s * a;
		}
		return s;
	}
	public static int Main()
	{
		int n1;
		int n2;
		int i;
		int j;
		int o;
		int t1;
		int t2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n2 = Integer.parseInt(tempVar2);
		}
		find(n1);
		t1 = x1;
		for (i = x1;i >= 0;i--)
		{
			a1[i] = n1;
			y1 = n1 - power(2, i);
			if (n1 % 2 == 0)
			{
				o = y1 / 2 + power(2, i - 1);
			}
			else
			{
				o = (y1 + 1) / 2 + power(2, i - 1);
			}
			n1 = n1 - o;
		}
		find(n2);
		t2 = x1;
		for (i = x1;i >= 0;i--)
		{
			a2[i] = n2;
			y1 = n2 - power(2, i);
			if (n2 % 2 == 0)
			{
				o = y1 / 2 + power(2, i - 1);
			}
			else
			{
				o = (y1 + 1) / 2 + power(2, i - 1);
			}
			n2 = n2 - o;
		}
		for (i = max(t1, t2);i >= 0;i--)
		{
			if (a2[i] == a1[i])
			{
				System.out.printf("%d\n",a1[i]);
				break;
			}
		}
		return 0;
	}
}

