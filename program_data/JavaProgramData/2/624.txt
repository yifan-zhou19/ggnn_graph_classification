package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] amount = new int[26];
		int[][] num = new int[26][1000];
		int num0;
		int max = 0;
		char a;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(amount,0,(Integer.SIZE / Byte.SIZE));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			num0 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.in.read();
			a = System.in.read();
			while (a != '\n')
			{
				num[a - 65][amount[a - 65]] = num0;
				amount[a - 65]++;
				a = System.in.read();
			}
		}
		for (int i = 0;i < 26;i++)
		{
			if (max < amount[i])
			{
				max = amount[i];
			}
		}
		for (int i = 0;i < 26;i++)
		{
			if (max == amount[i])
			{
				a = i + 65;
				System.out.print(a);
				System.out.print("\n");
				System.out.print(max);
				System.out.print("\n");
				for (int j = 0;j < max;j++)
				{
					System.out.print(num[i][j]);
					System.out.print("\n");
				}
				break;
			}
		}
		return 0;
	}
}

