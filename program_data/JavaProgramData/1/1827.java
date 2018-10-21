package <missing>;

public class GlobalMembers
{
	public static int num = 0;
	public static int sum(int a,int i)
	{

		if (a == 1)
		{
			num++;
		}
		else
		{
			while (i <= a)
			{
				if (a % i == 0)
				{
					sum(a / i, i);
				}
				i++;
			}
		}
		return num;
	}
	public static int Main()
	{
		int a;
		int t;
		int j;
		int i;
		int count;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 0;j < t;j++)
		{
			count = 1;
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			i = 2;
			while (i <= (a / 2))
			{
				if (a % i == 0)
				{
					num = 0;
					sum(a / i, i);
					count = count + num;
				}
				i++;
			}
			System.out.print(count);
			System.out.print("\n");
		}

		return 0;
	}








}

