package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int k;
		int i;
		int m;
		int sum;
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

		m = n - 1;
		for (i = 1;;)
		{
			sum = i;
			while ((n * sum + k) % (n - 1) == 0)
			{
				sum = (n * sum + k) / (n - 1);
				m--;
				if (m == 0)
				{
					break;
				}
			}
			if (m != 0)
			{
				i++;
				m = n - 1;
			}
			else
			{
				break;
			}
		}
		System.out.printf("%d",n * sum + k);
	}



}

