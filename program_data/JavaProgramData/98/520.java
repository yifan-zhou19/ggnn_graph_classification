package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] word = new char[1000][40];
		int number;
		int count = 0;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			number = Integer.parseInt(tempVar);
		}
		for (i = 0;i < number;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				word[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < number;i++)
		{
			if (count + String.valueOf(word[i]).length() + 1 <= 80)
			{
				if (i == 0)
				{
					System.out.printf("%s",word[i]);
					count += String.valueOf(word[i]).length();
				}
				else
				{
					System.out.printf(" %s",word[i]);
					count += String.valueOf(word[i]).length() + 1;
				}
			}
			else
			{
				System.out.printf("\n%s",word[i]);
				count = String.valueOf(word[i]).length();
			}
		}
		return 0;
	}

}

