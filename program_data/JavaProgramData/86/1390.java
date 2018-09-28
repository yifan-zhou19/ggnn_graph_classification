package <missing>;

public class GlobalMembers
{
	public static void count()
	{
		int k;
		int m1 = 0;
		int m2 = 0;
		int s = 0;
		int t = 0;
		int i = 0;
			while (k > 1)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					m1 = Integer.parseInt(tempVar);
				}
				k--;
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				k = Integer.parseInt(tempVar2);
			}
			while (k > 0)
			{
				m1 = m2;
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					m2 = Integer.parseInt(tempVar3);
				}
				m1 = m2 - m1;
				while (i < m1)
				{
					i++;
					t++;
					if (t > 60)
					{
						break;
						break;
					}
					s++;
				}
					i = 0;
				t += 3;
					if (t > 60)
					{
						break;
					}
				k--;
			}
				if (t < 60)
				{
					s += 60 - t;
				}
			System.out.printf("%d\n",s);

	}

	public static int Main()
	{
			int p;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p = Integer.parseInt(tempVar);
			}
			while (p > 0)
			{
				count();
				p--;
			}
			return 0;
	}

}

