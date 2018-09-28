package <missing>;

public class GlobalMembers
{
	public static int fibo(int x)
	{
		int p = 1;
		int q = 1;
		int temp;
		int result;
		int k;
		if ((x == 1) || (x == 2))
		{
			result = 1;
		}
		else
		{
			for (k = x;k > 2;k--)
			{
				temp = q;
				q = q + p;
				p = temp;
			}
			result = q;
		}
		return result;
	}
	public static int Main()
	{
		int[] shuzu = new int[N];
		int n;
		int a;
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
				(shuzu[i]) = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			a = fibo(shuzu[i]);
			System.out.printf("%d\n",a);
		}
		return 0;
	}
}

