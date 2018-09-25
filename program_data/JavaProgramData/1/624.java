package <missing>;

public class GlobalMembers
{
	/*
	 *  Created on: 2011-11-18
	 *      Author: 1100012870
	 */

	public static int[] su = new int[40000];
	public static int[] b = new int[10000];
	public static int ans;

	public static void zhaosushu()
	{
		int i;
		int j;
		int p;
		for (i = 2;i < 32768;i++)
		{
			p = 1;
			for (j = 2;j <= Math.sqrt(i);j++)
			{
				if (i % j == 0)
				{
					p = 0;
					break;
				}
			}
			if (p == 0)
			{
				continue;
			}
			su[p] = 1;
		}
	}

	public static void resolve(int a,int x)
	{
		int i;
		if (a == 1 || (su[a] == 1 && a >= b[x - 1]))
		{
			ans++;
			return;
		}
		for (i = 2;i <= a;i++)
		{
			if (a % i == 0 && i >= b[x - 1])
			{
				b[x] = i;
				resolve(a / i, x + 1);
				b[x] = 0;
			}
		}
	}

	public static int Main()
	{
		int n;
		int i;
		int a;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(su,0,(Integer.SIZE / Byte.SIZE));
		zhaosushu();
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			ans = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(b,0,(Integer.SIZE / Byte.SIZE));
			resolve(a, 1);
			System.out.print(ans);
			System.out.print("\n");
		}
		return 0;
	}
}

