package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int k;
		int w;
		int m;
		int s = 0;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}

		for (m = k + n;;m++)
		{
			s = 0;
		w = m;
			for (i = 0;i < n;i++)
			{
			if ((w - k) % n == 0 && w > k)
			{
				w = (w - k) / n * (n - 1);
			s = s + 1;
			}

			else
			{
				break;
			}
			}
			if (s == n)
			{
			break;
			}

		}
		System.out.printf("%d\n",m);


	}
}

