package <missing>;

public class GlobalMembers
{
	public static int sd(int n,int m)
	{
		if (n == 1)
		{
			return 1;
		}
		if (m == 1)
		{
			return 1;
		}
		if (n < m && n >= 2)
		{
			return sd((n - 1), m) + sd(n, (m - n));
		}
		if (m <= n != 0 && m>1)
		{
			return sd(m - 1, m) + 1;
		}


	}


	public static int Main()
	{
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		int[] m = new int[100];
		int[] n = new int[100];
		int[] d = new int[100];
		int i = 0;
		do
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n[i] = Integer.parseInt(tempVar3);
			}
			i++;
		}while (i < a);
		i = 0;
		do
		{

			System.out.printf("%d\n",sd(n[i], m[i]));
			i++;
		}while (i < a);
		return 0;
	}

}

