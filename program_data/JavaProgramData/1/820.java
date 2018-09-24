package <missing>;

public class GlobalMembers
{
	public static int sum = 0; //??????sum????????
	public static int[] yueshu = new int[100];
	public static int s = 0;

	public static void number(int num,int s)
	{
		int i;
		for (i = s;i >= 0;i--)
		{
			if (num < yueshu[i])
			{
				continue;
			}
			if (num == yueshu[i])
			{
				sum++;
			}
			else if (num > yueshu[i] && num % yueshu[i] == 0)
			{
				number(num / yueshu[i], i);
			}
		}
	}

	public static int Main()
	{
		int n = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int num = 0;
		while ((num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			int i = 0;
			int j = 0;
			for (i = 2;i <= num;i++)
			{
				if (num % i == 0)
				{
					yueshu[j] = i;
					j++;
				}
			}
			s = j - 1;
			number(num, s);
			System.out.print(sum);
			System.out.print("\n");
			sum = 0;
		}
		return 0;
	}
}

