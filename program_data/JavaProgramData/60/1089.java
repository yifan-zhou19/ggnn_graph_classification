package <missing>;

public class GlobalMembers
{
	public static int sushu(int a)
	{
		int i;
		int k;
		k = Math.sqrt(a);
		for (i = 2;i <= k;i++)
		{
			if (a % i == 0)
			{
				break;
			}
		}
		if (i > k)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

	public static void Main()
	{
		int n;
		int i;
		int mark = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i < n;i = i + 2)
		{
			if (sushu(i) == 1)
			{
				if (i + 2 > n)
				{
					break;
				}
				else if (sushu(i + 2) == 1)
				{
					System.out.printf("%d %d\n",i,i + 2);
					mark = 1;
				}
			}
		}
		if (mark == 0)
		{
			System.out.print("empty");
		}
	}

}

