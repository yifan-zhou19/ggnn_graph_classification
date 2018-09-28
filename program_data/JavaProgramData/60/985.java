package <missing>;

public class GlobalMembers
{
	// shang.cpp : Defines the entry point for the console application.
	//

	public static int sushu(int x)
	{
		int i;
		int count = 0;
		int result;
		for (i = 2;i < x;i++)
		{
			if (x % i == 0)
			{
				count++;
			}
		}
		if (count == 0)
		{
			result = 1;
		}
		else
		{
			result = 0;
		}
		return result;
	}
	public static void Main(String[] args)
	{
		int n;
		int i;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int sushu = int x;
		for (i = 2;i <= n - 2;i++)
		{
			if (sushu(i) != 0)
			{
				if (sushu(i + 2) != 0)
				{
					System.out.printf("%d %d\n",i,i + 2);
					sum++;
				}
			}
		}
		if (sum == 0)
		{
			System.out.print("empty");
		}
	}


}

