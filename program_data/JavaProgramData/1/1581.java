package <missing>;

public class GlobalMembers
{
	public static int Digui(int a,int min)
	{
		int i;
		int result = 1;
		if (a < min)
		{
			return 0;
		}
		for (i = min;i < a;i++)
		{
			if (a % i == 0)
			{
				result += Digui(a / i, i);
			}
		}
		return (result);
	}
	public static int Main()
	{
		int[] a = new int[1000];
		int n;
		int i;
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
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",Digui(a[i], 2));
		}
		return 0;
	}



}

