package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String line = new String(new char[100]);
		char boy;
		char girl;
		line = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int sum;
		sum = line.length();
		int i;
		int j;
		int k;
		boy = line.charAt(0);
		for (i = 1; i <= sum - 1; i++) // ?????????
		{
			if (line.charAt(i) != boy)
			{
				girl = line.charAt(i);
				break;
			}
		}
		for (j = 1; j <= sum - 1; j++)
		{
			if (line.charAt(j) != boy)
			{
				for (k = j - 1; k >= 0; k--)
				{
					if (line.charAt(k) == boy)
					{
						System.out.print(k);
						System.out.print(" ");
						System.out.print(j);
						System.out.print("\n");
						line = tangible.StringFunctions.changeCharacter(line, k, girl);
						break;
					}
				}
			}
		}
		return 0;
	}
}

