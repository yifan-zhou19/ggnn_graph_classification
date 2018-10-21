package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] str =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		int n;
		int[] num = new int[1000];
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
		*(str + i) = ConsoleInput.readToWhiteSpace(true);
		for (int j = 0; * (*(str + i) + j) != 0;j++)
		{
			(num[i])++;
		}
		}
		System.out.print(str);
		sum = num[0];
		for (int i = 1;i < n;i++)
		{
			sum += num[i] + 1;
			if (sum > 80)
			{
				System.out.print("\n");
				System.out.print((str + i));
				sum = num[i];
			}
			else if (sum == 80)
			{
				System.out.print(' ');
				System.out.print((str + i));
				System.out.print("\n");
				System.out.print((str + i + 1));
				sum = num[i + 1];
				i++;
			}
			else
			{
				System.out.print(' ');
				System.out.print((str + i));
			}
		}
		return 0;
	}

}

