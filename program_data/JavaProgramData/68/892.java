package <missing>;

public class GlobalMembers
{
	public static int judge(int a)
	{
		int i;

		for (i = 3;i <= Math.sqrt((float)a) + 1;i += 2)
		{
			if (a % i == 0)
			{
				return 0;
				break;
			}
		}
		if (i > Math.sqrt((float)a) + 1)
		{
			return 1;
		}
	}

	public static int Main()
	{
		int i;
		int j;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		//for(i=3;i<=200;i+=2)
		//	cout <<i<<"?"<<judge(i)<<endl;

		for (i = 6;i <= n;i += 2)
		{
			for (j = 3;j <= i / 2 + 1 ;j += 2)
			{
				if (judge(j) == 1 && judge(i - j) == 1)
				{
					System.out.print(i);
					System.out.print('=');
					System.out.print(j);
					System.out.print('+');
					System.out.print(i - j);
					System.out.print("\n");
					break;
				}
			}
		}
		return 0;
	}

}

