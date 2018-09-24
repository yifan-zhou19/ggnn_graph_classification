package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int jisuan = int a;
		int n;
		int z;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 1)
		{
			System.out.print("End\n");
		}
		else
		{
		z = jisuan(n);
		while (z != 1)
		{
			z = jisuan(z);
		}
		if (z == 1)
		{
			System.out.print("End\n");
		}
		}
	}
	public static int jisuan(int a)
	{
		int T;
		if (a % 2 == 0)
		{
			T = a / 2;
		System.out.printf("%d/2=%d\n",a,T);
		}
		else
		{
			T = a * 3 + 1;
		System.out.printf("%d*3+1=%d\n",a,T);
		}
		return (T);
	}
}

