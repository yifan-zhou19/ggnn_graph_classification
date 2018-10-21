package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		int t;
		int r;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		i = 1;
		while (true)
		{
			i++;
		 j = 0;
		 t = i;
		 r = 1;
		while (r <= n)
		{
			if ((t - k) % n != 0 || (t - k) == 0)
			{
				break;
			}
		else
		{
			j = j + 1;
			t = t - (t - k) / n - k;
		}
		r++;
		}
		if (j == n)
		{
			System.out.printf("%d",i);
			break;
		}
		}
	}


}

