package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int p;
		int k;
		int judge = int af;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 3;i <= m / 2;i += 2)
		{
			p = judge(i);
			k = judge(m - i);
			if (p != 1 && k != 1)
			{
				System.out.print(i);
				System.out.print(" ");
				System.out.print(m - i);
				System.out.print("\n");
			}
		}
		return 0;
	}


	public static int judge(int af)
	{
		int j;
		for (j = 3;j < af;j += 2)
		{
			if (af % j == 0)
			{
				return 1;
				break;
			}
		}
	}










}

