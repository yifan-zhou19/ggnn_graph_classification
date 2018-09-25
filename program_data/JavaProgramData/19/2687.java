package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String src = new String(new char[MAX]);
		String find = new String(new char[MAX]);
		String replace = new String(new char[MAX]);

		char[][] temp = new char[MAX][MAX];
		src = new Scanner(System.in).nextLine();
		find = new Scanner(System.in).nextLine();
		replace = new Scanner(System.in).nextLine();

		int temp_count = 0;
		int iter = 0;
		for (int i = 0; i < src.length(); i++)
		{
			if (src.charAt(i) == ' ')
			{
				for (int j = iter; j < i; j++)
				{
					temp[temp_count][j - iter] = src.charAt(j);
				}
				temp[temp_count][i - iter] = 0;
				temp_count++;
				iter = i + 1;
			}
		}
		for (int j = iter; j < src.length(); j++)
		{
			temp[temp_count][j - iter] = src.charAt(j);
		}
		temp[temp_count][src.length() - iter] = 0;
		temp_count++;

		for (int i = 0; i < temp_count - 1; i++)
		{
			if (strcmp(temp[i], find) == 0)
			{
				System.out.print(replace);
				System.out.print(" ");
			}
			else
			{
				System.out.print(temp[i]);
				System.out.print(" ");
			}
		}
		if (strcmp(temp[temp_count - 1], find) == 0)
		{
			System.out.print(replace);
			System.out.print("\n");
		}
		else
		{
			System.out.print(temp[temp_count - 1]);
			System.out.print("\n");
		}

		return 0;
	}
}
