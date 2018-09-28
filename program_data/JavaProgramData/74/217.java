package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int p;
		int q;
		int[] r = new int[100];
		int s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
			p = 1;
			for (j = 2;j < i;j++)
			{
				if (i % j == 0)
				{
				p = 0;
				}
			}
			for (j = 0,q = i;q != 0;j++)
			{
				r[j] = q % 10;
				q = q / 10;
			}
			q = j - 1;
			for (j = 0;j <= q;j++)
			{
				if (r[j] != r[q - j])
				{
				p = 0;
				}
			}
			if (p == 1)
			{
				s++;
				if (s != 1)
				{
				System.out.print(",");
				}
				System.out.printf("%d",i);
			}
		}
		if (s == 0)
		{
		System.out.print("no");
		}
	}





}

