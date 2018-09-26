package <missing>;

public class GlobalMembers
{
	public static int judge(int x)
	{
		int seven = 0;
		if (x % 7 == 0)
		{
			seven = 1;
		}
		if ((x - 7) % 10 == 0)
		{
			seven = 1;
		}
		if (x >= 70 && x < 80)
		{
			seven = 1;
		}
		return seven;
	}
	public static int Main()
	{
		int n;
		int i;
		int sum = 0;
		int squ = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			if (judge(i) == 0)
			{
				squ = i * i;
				sum = sum + squ;
			}
		}
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}





}

