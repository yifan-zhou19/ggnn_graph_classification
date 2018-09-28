package <missing>;

public class GlobalMembers
{
	public static int function(int n,int m)
	{
		int[] a = new int[1000];
		int i;
		int j;
		int k;
		int s;
		for (i = 0;i < n;i++)
		{
			a[i] = i + 1;
		}
		i = -1;
		for (s = n;s > 1;s--)
		{
			i = (i + m) % s;
			k = a[i];
			for (j = i + 1;j < n;j++)
			{
				a[j - 1] = a[j];
			}
			{
				a[n - 1] = k;
		}
			i--;
		}

		return a[0];
	}
	public static void Main()
	{
		int n;
		int m;
		int l;
		int i;
		int[] king = new int[100];
		l = 0;
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
			if (m == 0 && n == 0)
			{
				break;
			}
			king[l++] = function(n, m);
		}
		for (i = 0;i < l;i++)
		{
			System.out.printf("%d\n",king[i]);
		}
	}
}

