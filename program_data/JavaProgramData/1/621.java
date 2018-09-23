package <missing>;

public class GlobalMembers
{
	public static int f(int i,int t)
	{
		if (i < t)
		{
			return 0;
		}
		int b = 1;
		int a;
		for (a = t;a < i;a++)
		{
			if (i % a == 0)
			{
				b = b + f(i / a, a);
			}
		}
		return b;
	}

	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i = 0;
		int[] d = new int[100];
		do
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				d[i] = Integer.parseInt(tempVar2);
			}
			i++;
		}while (i < n);
		i = 0;
		do
		{
			System.out.printf("%d\n",f(d[i], 2));
			i++;
		}while (i < n);
		return 0;
	}
}

