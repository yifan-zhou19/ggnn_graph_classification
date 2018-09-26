package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num;
		char[][] word =
		{
			{' ', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		int[] length = new int[1000];
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		for (i = 0;i < num;i++)
		{
			word[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			length[i] = String.valueOf(word[i]).length() + 1;
		}
		int sumlength = 0;
		for (i = 0;i < num;i++)
		{
			sumlength += length[i];
			if (sumlength > 81)
			{
				System.out.print("\n");
				System.out.print(word[i]);
				System.out.print(" ");
				sumlength = length[i];
			}
			else
			{
				if (sumlength == 81)
				{
					System.out.print(word[i]);
					System.out.print("\n");
					sumlength = 0;
				}
				else
				{
					System.out.print(word[i]);
					if (sumlength + length[i + 1] <= 81 && i != num - 1)
					{
						 System.out.print(" ");
					}
				}
			}
		}
		return 0;
	}



}

