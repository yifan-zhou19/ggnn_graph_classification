package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int f = int p;
		int n;
		int m;
		int i;
		int k;
		int q;
		int p;
		int x = 0;
		int t = 0;
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
		i = m;
		while (i <= n)
		{
			p = i;
			t = 0;
			while (p >= 1)
			{
				k = p % 10;
				p = p / 10;
				t = t * 10 + k;
			}
			if (t != i)
			{
				i++;
			}
			else
			{
				q = f(i);
				 if (q != 0)
				 {
					System.out.printf("%d",i);
					x++;
					break;
				 }
				else
				{
					i++;
				}
			}
		}
		i++;
		while (i <= n)
		{
			p = i;
			t = 0;
			while (p >= 1)
			{
				k = p % 10;
				p = p / 10;
				t = t * 10 + k;
			}
			if (t == i)
			{
				q = f(i);
				if (q != 0)
				{
					System.out.printf(",%d",i);
					x++;
				}
			}
			i++;
		}
		if (x == 0)
		{
			System.out.print("no");
		}
	}

	public static int f(int p)
	{
		int j;
		int k;
		if (p % 2 == 0)
		{
			k = 0;
		}
		else
		{
		   for (j = 3;j < p;j++)
		   {
			if (p % j == 0)
			{
				break;
			}
		   }
		   if (j >= p)
		   {
			   k = 1;
		   }
		   else
		   {
			   k = 0;
		   }
		}
		return (k);
	}
}

