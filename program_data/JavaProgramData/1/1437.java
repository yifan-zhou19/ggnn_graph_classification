package <missing>;

public class GlobalMembers
{
	public static int num = 0;
	public static int solution(int a,int b)
	{
		for (int i = b; i <= a; i++)
		{
			if (a % i == 0)
			{
				a = a / i;
				if (a == 1)
				{
					num++;
				}
				else
				{
					num = solution(a, i);
				}
				a = a * i;
			}
		}
			return num;
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			int a;
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			num = 0;
			System.out.print(solution(a, 2));
			System.out.print("\n");
		}

			return 0;
	}

}

