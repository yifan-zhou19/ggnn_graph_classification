package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int houwang = new int(int n,int m);
		int n;
		int m;
		int i;
		int[] c = new int[1000];

		for (i = 0;;i++)
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
			if (n == 0)
			{
			break;
			}
			c[i] = houwang(n, m);
		}
		for (n = 0;n <= i - 1;n++)
		{
			System.out.printf("%d\n",c[n]);
		}

	}
	public static int houwang(int n,int m)
	{

		int[] a = new int[301];
		int i;
		int k;
		int b = 0;

		for (i = 1;i <= n;i++)
		{
			a[i] = i;
		}
		for (i = 1;;i++)

		{
			b++;
			if (i == n + 1)
			{
				i = 1;
			}
			if (b == m)
			{
				for (k = i;k < n;k++)
				{
					a[k] = a[k + 1];



				}
				n = n - 1;
				b = 0;
				i = i - 1;
			}
			if (n == 1)
			{
				break;
			}
		}
		return (a[1]);
	}




}

