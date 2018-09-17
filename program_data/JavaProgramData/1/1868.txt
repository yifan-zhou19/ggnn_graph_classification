package <missing>;

public class GlobalMembers
{
	/*1090 ????*/ 



	public static int num;

	public static void divide(int a,int k)
	{
		int i;
		if (a == 1)
		{
			num++; //??????????????
		}
		for (i = k;i <= a;i++) //????????
		{
			if (a % i == 0)
			{
				divide(a / i, i);
			}
		}
	}

	public static int Main()
	{
		int t;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (t-- != 0)
		{
				int n;
				n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				num = 1;
				int i;
				for (i = 2;i * i <= n;i++)
				{
					if (n % i == 0)
					{
						divide(n / i, i);
					}
				}
				System.out.print(num);
				System.out.print("\n");
		}
		return 0;
	}
}

