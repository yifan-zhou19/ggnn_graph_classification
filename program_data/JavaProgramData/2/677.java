package <missing>;

public class GlobalMembers
{
	//????????????
	//???2013.12.21
	//****************************
	public static int Main()
	{
		int n = 0;
		int i = 0;
		int j = 0;
		int[] num = new int[100];
		int k = 0;
		int[] count = new int[26];
		int max = 0;
		char[][] nam =
		{
			{null, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.in.read();
			nam[i] = new Scanner(System.in).nextLine();
			for (j = 0;j < String.valueOf(nam[i]).length();j++)
			{
				count[nam[i][j] - 'A']++;
			}
		}
		max = count[0];
		for (i = 0;i < 26;i++)
		{
			if (max < count[i])
			{
				max = count[i];
				k = i;
			}
			else
			{
				continue;
			}
		}
		j = 0;
		System.out.print((char)(k + 'A'));
		System.out.print("\n");
		System.out.print(max);
		System.out.print("\n");
		for (i = 0;i < n;i++)
		{
			for (j = 0;;j++)
			{
				if (nam[i][j] == k + 'A')
				{
					System.out.print(num[i]);
					System.out.print("\n");
					break;
				}
				if (nam[i][j] == null)
				{
					break;
				}
			}
		}

		return 0;
	}
}

