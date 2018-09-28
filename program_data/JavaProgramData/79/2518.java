package <missing>;

public class GlobalMembers
{
	public static int king(int M,int N)
	{
		int k = 0;
		for (int i = 2;i <= M;i++)
		{
		k = (k + N) % i;
		}
		return ++k;
	}
	public static int Main()
	{
		int n;
		int m;
		int[] a = new int[100];
		int i = 1;
		int x;
		while (scanf("%d%d", n, m) && n != 0 && m != 0)
		{
										if (m == 0 && n == 0)
										{
										break;
										}
										else
										{
										a[i] = king(n, m);
										}
										x = i;
										i++;
		}
		for (i = 1;i <= x;i++)
		{
				   System.out.print(a[i]);
				   System.out.print("\n");
		}
		return 0;
	}
}
