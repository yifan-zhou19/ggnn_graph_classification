package <missing>;

public class GlobalMembers
{
	public static int sushu(int x)
	{
		int i;
		int a;
		for (i = 2;i < x;i++)
		{
		if (x % i == 0)
		{
		break;
		}
		}
		if (i == x)
		{
			  a = 1;
		}
		else
		{
			  a = 0;
		}
		return (a);
	}
	public static int Main()
	{
		int sushu = int x;
		int N;
		int n;
		int Flag = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		{
			for (n = 1;n <= (N - 2);n++)
			{
			if (sushu(n) == 1)
			{
			if (sushu(n + 2) == 1)
			{
				System.out.printf("%d %d\n",n,(n + 2));
			Flag = 1;
			}
			}
			}
	}
		if (Flag == 0)
		{
		System.out.print("empty");
		}
	}
}

