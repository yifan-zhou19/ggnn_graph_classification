package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int k;
		int i;
		int n;
		int zhaodao = int a;
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
			a = Integer.parseInt(tempVar2);
		}
		k = zhaodao(a);
		System.out.printf("%d\n",k);
		}
	}
	public static int zhaodao(int a)
	{
		if (a == 1 || a == 2)
		{
			return (1);
		}
		else
		{
			return (zhaodao(a - 1) + zhaodao(a - 2));
		}
	}

}

