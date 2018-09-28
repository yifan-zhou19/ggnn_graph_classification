package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int[] b = new int[20];
		int[] c = new int[20];
		int i;
		int j;
		int k;
		int l;
		int n;
		int m;
		int x;
		int s;
		int t;
		int p;
		int q;
		int count = 0;
		s = 0;
		t = 0;
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
			b[s] = n;
			c[s] = m;
			if ((n == 0) && (m == 0))
			{
				break;
			}
			s++;
		}
		for (j = 0;j <= s - 1;j++)
		{
			p = b[j];
			q = c[j];
			if (p == 1)
			{
				x = 1;
				System.out.printf("%d\n",x);
			}
			if (p > 1)
			{
			for (k = 0;k <= p - 1;k++)
			{
				a[k] = k + 1;
			}
			for (l = 0;;l++)
			{
				t = (q + t - 1) % (p - count);
				for (i = t;i <= p - count - 2;i++)
				{
					a[i] = a[i + 1];
				}
				count++;
				if (count == p - 1)
				{
					break;
				}
			}
			System.out.printf("%d\n",a[0]);
			t = 0;
			count = 0;
			}
		}
	}

}

