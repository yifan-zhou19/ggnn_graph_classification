package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[101]);
		int[] a = new int[101];
		int[] b = new int[101];
		int n;
		int i;
		int j;
		int k;
		int t;
		int m;
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		k = s.length();
		for (i = 0;i < k;i++)
		{
			a[i] = s.charAt(i) - 48;
		}
		if (k == 1)
		{
			System.out.printf("%d\n",0);
			System.out.printf("%d\n",a[0]);
		}
		else if (k == 2)
		{
			if ((a[1] + a[0] * 10) >= 13)
			{
				System.out.printf("%d\n",(a[0] * 10 + a[1]) / 13);
				System.out.printf("%d\n",(a[1] + a[0] * 10) % 13);
			}
			else
			{
				System.out.printf("%d\n",0);
				System.out.printf("%d\n",a[0] * 10 + a[1]);
			}
		}
		else
		{
			t = 0;
			for (i = 0,m = 0;i < k;i++)
			{
				b[m] = (t * 10 + a[i]) / 13;
				t = (t * 10 + a[i]) % 13;
				m++;
			}
			for (i = 0;i < n;i++)
			{
				if (b[i] == 0 && b[i + 1] != 0)
				{
					x = i;
					break;
				}
			}
			for (j = x + 1;j < m;j++)
			{
				System.out.printf("%d",b[j]);
			}
			System.out.print("\n");
			System.out.printf("%d\n",t);
		}
	}
}

