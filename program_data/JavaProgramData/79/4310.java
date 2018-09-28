package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void election(int n, int m);
		int n;
		int m;
		int i;
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
			if (n == 0 && m == 0)
			{
					 break;
			}
			election(n, m);
			n = 0;
			m = 0;
		}
		return 0;
	}
	public static void election(int n, int m)
	{
		int a;
		int t = 0;
		int i;
		int j;
		int k;
		int l;
		int[] s = new int[600];
		for (i = 0;i <= n - 1;i++)
		{
			s[i] = i + 1;
		}
		s[n] = 0;
		l = n;
		for (i = 0;;i++)
		{
			if (m % n != 0)
			{
					   a = m % n;
			}
			else
			{
				 a = n;
			}
			if (s[1] == 0)
			{

						break;
			}
			if ((t + a) % n != 0)
			{
						   a = (t + a) % n;
			}
			else
			{
				a = n;
			}
			for (j = a - 1;j <= l - 1;j++)
			{
				s[j] = s[j + 1];
			}
			n = n - 1;
			if (n == 0)
			{
					 n = 1;
			}
			t = a - 1;

		}
		System.out.printf("%d\n", s[0]);

		return 0;
	}

}

