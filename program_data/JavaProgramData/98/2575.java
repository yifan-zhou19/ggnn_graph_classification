package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int word_num;
		int i;
		int sum;
		char[][] word = new char[500][45];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			word_num = Integer.parseInt(tempVar);
		}
		sum = 0;
		for (i = 0;i < word_num;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				word[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < word_num;i++)
		{
			if (sum == 0)
			{
				System.out.printf("%s",word[i]);
				sum += String.valueOf(word[i]).length();
			}
			else
			{
				sum += String.valueOf(word[i]).length() + 1;
				if (sum <= 80)
				{
					System.out.printf(" %s",word[i]);
				}
				else
				{
					sum = 0;
					i--;
					System.out.print("\n");
				}
			}
		}
		return 0;
	}




}

