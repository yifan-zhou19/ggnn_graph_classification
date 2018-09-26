package <missing>;

public class GlobalMembers
{
	public static final String flu = ""; //flu?????????????
	public static int n; //n?????
	public static int Main()
	{

		int flu_infection = 0; //??????????????,?????????????

		int i; //ill?????
		int j;
		int m;
		int ill = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				flu.charAt(i)[j] = ConsoleInput.readToWhiteSpace(true);
				if (flu.charAt(i)[j] == '@')
				{
					ill++;
				}
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i < m;i++)
		{ //??????
			ill = flu_infection();


		}
		System.out.print(ill);
		System.out.print("\n");
		return 0;
	}

	public static int flu_infection()
	{
		int count = 0;
		int i;
		int j;
		int k;
		int num = 0;
		int[][] people = new int[10000][2];

		//?????????????????
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (flu.charAt(i)[j] == '@')
				{
					people[num][0] = i;
					people[num][1] = j;
					num++;
				}
			}
		}

		for (k = 0;k < num;k++)
		{

			//????:??????
			i = people[k][0];
			j = people[k][1];
			if (i > 0 && flu.charAt(i - 1)[j] == '.')
			{
				flu.charAt(i - 1)[j] = '@';
			}
			if (i < n - 1 && flu.charAt(i + 1)[j] == '.')
			{
				flu.charAt(i + 1)[j] = '@';
			}
			if (j > 0 && flu.charAt(i)[j - 1] == '.')
			{
				flu.charAt(i)[j - 1] = '@';
			}
			if (j < n - 1 && flu.charAt(i)[j + 1] == '.')
			{
				flu.charAt(i)[j + 1] = '@';
			}
		}

		//????????
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (flu.charAt(i)[j] == '@')
				{
					count++;
				}
			}
		}
		return count;
	}
}

