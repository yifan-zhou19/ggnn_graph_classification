package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] c = new int[15];
		int[] d = new int[15];
		int p;
		int q;
		int i;
		int x;
		int j;
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		i = 0;
		do
		{
			c[i] = n;
			n = n / 2;
			i = i + 1;
		}while (n > 0);
		p = i;
		i = 0;
		do
		{
			d[i] = m;
			m = m / 2;
			i = i + 1;
		}while (m > 0);
		q = i;
		x = 0;
		for (i = 0;i < p;i++)
		{
			if (x == 1)
			{
				break;
			}
		 else
		 {
			 for (j = 0;j < q;j++)
			 {
				if (c[i] == d[j])
				{
					System.out.printf("%d",c[i]);
					x = 1;
					break;
				}
			 }
		 }
		}
	}


}

