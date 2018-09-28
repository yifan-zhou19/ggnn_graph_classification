package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int check = int x;
		int a;
		int b;
		int num;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		for (a = 2;a <= (num / 2);a++)
		{
			b = num - a;
			if (check(b) != 0 && check(a) != 0)
			{
				System.out.printf("%d %d\n",a,b);
			}
		}
		return 0;
	}
	public static int check(int x)
	{
		int i;
		int k;
		k = Math.sqrt(x);
		for (i = 2;i <= k;i++)
		{
		if ((x % i) == 0)
		{
			x = 0;
			break;
		}
		}
		return x;
	}



}

