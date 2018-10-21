package <missing>;

public class GlobalMembers
{
	public static String str = new String(new char[10000]);

	public static int Main()
	{
		int i;
		int n;
		int word;
		int temp;
		int start;
		str = new Scanner(System.in).nextLine();
		n = str.length();
		word = 0;
		temp = 0;
		start = 0;
		for (i = 0;i < n;i++)
		{
			if (str.charAt(i) != ' ')
			{
				word++;
				temp = 0;
			}
			else if (temp == 0)
			{
				if (start == 0)
				{
					System.out.printf("%d",word);
					start++;
				}
				else
				{
					System.out.printf(",%d",word);
				}
				word = 0;
				temp = 1;
			}
		}
		if (start == 0)
		{
				System.out.printf("%d",word);
		}
		else
		{
			System.out.printf(",%d",word);
		}

		return 0;
	}
}
