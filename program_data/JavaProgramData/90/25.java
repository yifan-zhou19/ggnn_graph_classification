package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int ps = new int(m,n);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			j = Integer.parseInt(tempVar);
		}
		for (i = 0;i < j;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			System.out.printf("%d\n",ps(m,n));
		}
	}

//C++ TO JAVA CONVERTER WARNING: The following constructor is declared outside of its associated class:
	public static ps(m UnnamedParameter, n UnnamedParameter2)
	{
		int i;
		int j;
		int k;
		if (n == 1)
		{
			k = 1;
		}
		else
		{
			k = 0;
			for (i = 0;i <= (m / n);i++)
			{
				k = k + ps(m - i * n,n - 1);
			}
		}
		return (k);
	}




}

