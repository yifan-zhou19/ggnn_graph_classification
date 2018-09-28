package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String word = new String(new char[SIZE]);
		int i;
		int j;
		int k;
		int count;
		int length;
		word = new Scanner(System.in).nextLine();
		length = word.length();
		for (i = 2;i <= length;i++)
		{
			for (j = 0;j < length - i + 1;j++)
			{
				count = 0;
				for (k = 0;k < i;k++)
				{
					if (word.charAt(j + k) == word.charAt(j + i - 1 - k))
					{
						count++;
					}
				}
				if (count == i)
				{
					for (k = 0;k < i;k++)
					{
						System.out.printf("%c",word.charAt(j + k));
					}
					System.out.print("\n");
				}
			}
		}
		return 0;
	}

}
