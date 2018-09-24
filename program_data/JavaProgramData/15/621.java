package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int j;
		int m;
		int n;
		int t;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		i = 0;
		j = 0;
		m = 0;
		t = 0;
		do
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				k = Integer.parseInt(tempVar2);
			}
			t++;
			if (k == 0 && m == 0 && j == 0)
			{
				i++;
			}
			if (j == 1 && k == 0)
			{
				m++;
			}
			if (k != 0 && i != 0)
			{
				j = 1;
			}
		}while (t < (n * n));
		s = (i - 2) * (m - i) / 2;
		System.out.printf("\n%ld",s);
			 return 0;
	}

}

