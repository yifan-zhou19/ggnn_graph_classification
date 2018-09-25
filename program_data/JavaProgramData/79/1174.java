package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int king = new int(int m,int n);
		while (n != 0 && m != 0)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (n != 0 && m != 0)
			{
			System.out.printf("%d\n",king(m, n) + 1);
			}
		}
	}

	public static int king(int m,int n)
	{
		int i;
		int k = 0;
		for (i = 2;i <= n;i++)
		{
		k = ((m % i) + k) % i;
		}
		return k;
	}


}

