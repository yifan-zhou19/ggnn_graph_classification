package <missing>;

public class GlobalMembers
{
	public static int f(int n1,int n2,int n3)
	{
		int an = 0;
		int i;
		if (n1 == 0 || n1 == 1)
		{
			an = 1;
		}
		else
		{
		if (n2 == 1)
		{
			an = 0;
		}
		if (n2 == 2)
		{
			if (n1 % 2 == 0)
			{
			for (i = n3;i >= n1 / 2;i--)
			{
				an = an + 1;
			}
			}
			else
			{
				for (i = n3;i > n1 / 2;i--)
				{
				an = an + 1;
				}
			}
		}
		else
		{
			if (n1 % n2 == 0)
			{
			for (i = n3;i >= n1 / n2;i--)
			{
				if (n1 - i < i)
				{
				an = an + f(n1 - i, n2 - 1, n1 - i);
				}
				else
				{
					an = an + f(n1 - i, n2 - 1, i);
				}
			}
			}
			else
			{
			   for (i = n3;i > n1 / n2;i--)
			   {
				if (n1 - i < i)
				{
				an = an + f(n1 - i, n2 - 1, n1 - i);
				}
				else
				{
					an = an + f(n1 - i, n2 - 1, i);
				}
			   }
			}
		}
		}
		return an;
	}
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[100];
		int[] b = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",f(a[i], b[i], a[i]));
		}
	}

}

