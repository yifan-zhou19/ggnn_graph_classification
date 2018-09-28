package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int i;
		int j;
		int n;
		int x;
		int k;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		i = 6;
		while (i <= n)
		{
			k = 2;
			b = 1;
			x = 1;
			while (k <= (i / 2))
			{
				j = 2;
				b = 1;
				a = Math.sqrt(k);
				while (j <= a)
				{
					x = (k % j != 0);
					b = b != 0 && x != 0;
					j++;
				}
				if (b == 1)
				{
					j = 2;
					b = 1;
					a = Math.sqrt(i - k);
					while (j <= a)
					{
						x = ((i - k) % j != 0);
						b = b != 0 && x != 0;
						j++;
					}
					if (b == 1)
					{
						System.out.printf("%d=%d+%d\n",i,k,i - k);
					}
				}
				k++;
				if (b == 1)
				{
					break;
				}
			}
			i = i + 2;
		}
	}

}

