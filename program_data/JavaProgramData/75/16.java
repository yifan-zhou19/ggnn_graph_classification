package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String s = "";
		final String t = "";
		int[] a = new int[1001];
		int[] b = new int[1001];
		int[] c = new int[1000];
		int i = 1;
		int j = 0;
		int m;
		int n;
		int k;
		s = new Scanner(System.in).nextLine();
		m = s.length();
		for (i = 0;i < m;i++)
		{
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
			{
				a[j] = a[j] * 10 + s.charAt(i) - 48;
			}
			else
			{

				   if (s.charAt(i - 1) >= '0' && s.charAt(i - 1) <= '9')
				   {
					  j++;
				   }
			}
		}

		if (s.charAt(m - 1) >= '0' && s.charAt(m - 1) <= '9')
		{
			m = j + 1;
		}
		else
		{
			m = j;
		}
		t = new Scanner(System.in).nextLine();
		n = t.length();
		j = 0;
		for (i = 0;i < n;i++)
		{
			if (t.charAt(i) >= '0' && t.charAt(i) <= '9')
			{
				b[j] = b[j] * 10 + t.charAt(i) - 48;
			}
			else
			{

				   if (t.charAt(i - 1) >= '0' && t.charAt(i - 1) <= '9')
				   {
					  j++;
				   }
			}
		}

		if (t.charAt(n - 1) >= '0' && t.charAt(n - 1) <= '9')
		{
			n = j + 1;
		}
		else
		{
			n = j;
		}
		for (i = 0;i < 1000;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (i >= a[j] != 0 && i < b[j])
				{
					c[i]++;
				}
			}
		}
		k = c[0];
		for (i = 0;i < 1000;i++)
		{
			if (c[i] > k)
			{
				k = c[i];
			}
		}

		System.out.printf("%d %d",n,k);

		return 0;
	}


}
