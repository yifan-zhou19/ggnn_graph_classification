package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int p = 0;
		int pj = 0;
		int reverse = new int(int i,int j);
		int s = new int(int i,int j);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
			if (i == reverse(i, 0))
			{
				if (s(i, 2) == 1)
				{
					pj = 1;
					if (p == 0)
					{
						System.out.printf("%d",i);
						p = 1;
					}
					else
					{
						System.out.printf(",%d",i);
					}
				}
			}
		}
			 if (pj == 0)
			 {
				 System.out.print("no");
			 }
	}
	public static int reverse(int i,int j)
	{
		int a;
		int k;
		if (i == 0)
		{
			a = j;
		}
		else
		{
			k = i % 10;
			a = reverse(i / 10, j * 10 + k);
		}
		return (a);
	}
	public static int s(int i,int j)
	{
		int a;
		int k;
		k = Math.sqrt(i);
		if (i == 1)
		{
			a = 0;
		}
		else if (i == j)
		{
			a = 1;
		}
		else
		{
			if (i % j == 0)
			{
				a = 0;
			}
			else
			{
				a = s(i, j + 1);
			}
		}
		return (a);
	}
}

