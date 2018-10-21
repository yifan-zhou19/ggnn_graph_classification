package <missing>;

public class GlobalMembers
{
	public static int[] line = new int[99999];
	public static int[] temp = new int[99999];
	public static void cal(int[] line)
	{
		int i;
		for (i = 0;i < 9999;i++)
		{
			temp[i] = line[i] * 2;

		}
		for (i = 0;i < 9999;i++)
		{
			if (temp[i] >= 10)
			{
				temp[i] = temp[i] - 10;
				temp[i + 1] = temp[i + 1] + 1;
			}
		}
		for (i = 0;i < 9999;i++)
		{
			line[i] = temp[i];
		}
	}
	public static int Main()
	{
		int n;
		int p = 0;
		int j;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 0)
		{
			System.out.print("1");
			System.out.print("\n");
		}
		else
		{
			line[0] = 1;
			while (p < n)
			{
				cal(line);
				p++;
			}
			j = 9998;
			while (temp[j] == 0)
			{
				j--;
			}
			for (i = j;i >= 0;i--)
			{
				System.out.print(temp[i]);
			}
			System.out.print("\n");
		}
		return 0;
	}
}

