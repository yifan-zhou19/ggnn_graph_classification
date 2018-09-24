package <missing>;

public class GlobalMembers
{
	public static int f(int[] s, int n)
	{
		int i;
		int[] b = new int[25];
		int j;
		int flag = 0;
		int flag2 = 0;
		int[] p = s;
		for (i = 0;i < n - 1;i++)
		{
			if (s[i] < s[i + 1])
			{
			flag = 1;
			break;
			}
		}
		if (flag == 0)
		{
			return n;
		}
		else
		{
			for (i = 1;i < n;i++)
			{
			if (s[i] > s[0])
			{
				flag2 = 1;
				break;
			}
			}
		if (flag2 == 0)
		{
			return f(p + 1, n - 1) + 1;
		}
	else
	{
			b[0] = s[0];
			for (i = 1,j = 1;i < n;i++)
			{
				if (s[i] <= s[0])
				{
				b[j] = s[i];
				j++;
				}
			}

				return ((f(p + 1, n - 1)) > f(b, j) != 0?(f(p + 1, n - 1)):f(b, j));
	}
		}
	}
	public static void Main()
	{
		int k;
		int[] a = new int[25];
		int i;
		int N;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		N = f(a, k);
		System.out.printf("%d",N);
	}

}

