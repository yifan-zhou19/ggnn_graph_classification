package <missing>;

public class GlobalMembers
{
	public static int check1(int i)
	{
		int j;
		int x = 0;
		if (i == 2)
		{
			return 1;
		}
		for (j = 2;j < i;j++)
		{
			 if (i % j == 0)
			 {
				 x++;
			 }
		}
		if (x == 0)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int check2(int i)
	{
		int x;
		int j = 0;
		x = i;
		while (i != 0)
		{
			j = j * 10 + i % 10;
			i = i / 10;
		}
		if (j == x)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
			if (check1(i) != 0 && check2(i) != 0)
			{
			System.out.printf("%d",i);
			break;
			}
			else if (i == n)
			{
				System.out.print("no\n");
			}
		}
		for (j = i + 1;j <= n;j++)
		{
			if (check1(j) != 0 && check2(j) != 0)
			{
				System.out.printf(",%d",j);
			}
		}
		System.out.print("\n");
	}
}

