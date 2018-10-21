package <missing>;

public class GlobalMembers
{
	public static int maxlength(int x,int y)
	{
		if (x > y)
		{
			return x;
		}
		else
		{
			return y;
		}
	}
	public static int Main()
	{
		int i;
		int j;
		int k;
		int m;
		int n;
		int[] a = new int[N];
		int[] b = new int[N];
		int max;
		int l = 0;
		String s1 = new String(new char[N]);
		String s2 = new String(new char[N]);
		for (i = 0;i < N;i++)
		{
			a[i] = 0;
			b[i] = 0;
		}
		s1 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();
		m = s1.length();
		n = s2.length();
		max = maxlength(m, n);
		k = max;
		for (i = k,j = m - 1;j >= 0;i--,j--)
		{
			a[i] = s1.charAt(j) - '0';
		}
		for (i = k,j = n - 1;j >= 0;i--,j--)
		{
			b[i] = s2.charAt(j) - '0';
		}
		for (i = k;i > 0;i--)
		{
			a[i] += b[i];
			if (a[i] >= 10)
			{
				a[i] -= 10;
				a[i - 1]++;
			}
		}
		for (i = 0;i <= k;i++)
		{
			if (a[i] != 0)
			{
				break;
			}
			l++;
		}
		for (i = l;i <= k;i++)
		{
			System.out.printf("%d",a[i]);
		}
		if (k == 1 && a[1] == 0)
		{
			System.out.print("0");
		}
		return 0;
	}

}
