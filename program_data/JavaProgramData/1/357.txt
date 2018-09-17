package <missing>;

public class GlobalMembers
{
	public static int fenjieyinshi(int n,int m) //????????
	{
		int i = 0;
		int sum = 1;
		if (n < m)
		{
			return 0; //??????????????????0
		}
		else
		{
			for (i = m;i < n;i++)
			{
				if (n % i == 0) //????????????????
				{
					sum += fenjieyinshi(n / i, i); //??
				}
			}
			return sum;
		}
	}
	public static int Main() //???
	{ //?????
		int n = 0;
		int i = 0;
		int a = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a == 1)
			{
				System.out.print(1);
				System.out.print("\n");
			}
			else
			{
				System.out.print(fenjieyinshi(a, 2));
				System.out.print("\n");
			}
		}
		return 0;
	} //?????
}

