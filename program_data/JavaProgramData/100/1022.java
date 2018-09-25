package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String as = new String(new char[300]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			as = tempVar.charAt(0);
		}
		int[] sz = new int[300];
		int len = as.length();
		String sd = new String(new char[300]);
		String df = new String(new char[300]);

		int e = 0;
		for (int i = 0;i < len;i++)
		{
			int w = as.charAt(i);
			if ((w <= 122) && (w >= 97))
			{
				sd = tangible.StringFunctions.changeCharacter(sd, e, as.charAt(i));
				e++;
			}
		}
		for (int s = 1;s <= e;s++)
		{
			for (int q = 0;q < e - s;q++)
			{
				int m;
				int n;
				char y;
				m = sd.charAt(q);
				n = sd.charAt(q + 1);
				if (m > n)
				{
					y = sd.charAt(q);
					sd = tangible.StringFunctions.changeCharacter(sd, q, sd.charAt(q + 1));
					sd = tangible.StringFunctions.changeCharacter(sd, q + 1, y);
				}
			}
		}
		if (e != 0)
		{
		df = tangible.StringFunctions.changeCharacter(df, 0, sd.charAt(0));
		sz[0] = 1;
		int t = 0;
		for (int k = 1;k < e;k++)
		{
			char r = sd.charAt(k);
			int a = 0;
			int d;
			for (int j = 0;j <= t;j++)
			{
				if (r == df.charAt(j))
				{

					a++;
					d = j;
				}
			}
				if (a != 0)
				{
					sz[d]++;
				}
				else
				{
					t++;
					df = tangible.StringFunctions.changeCharacter(df, t, r);
					sz[t]++;
				}
		}

		for (int h = 0;h <= t;h++)
		{
			System.out.printf("%c=%d\n",df.charAt(h),sz[h]);
		}
		}
		if (e == 0)
		{
			System.out.print("No");
		}
		return 0;
	}
}

