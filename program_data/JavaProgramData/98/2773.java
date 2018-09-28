package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num;
		String word = new String(new char[50]);
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int count = 0;
		while (num-- != 0)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				word = tempVar.charAt(0);
			}
			if (count == 0)
			{
				System.out.print(word);
				count = word.length();
			}
			else
			{
				count += (word.length() + 1);
				if (count > 80)
				{
					System.out.print("\n");
					System.out.print(word);
					count = word.length();
				}
				else if (count == 80)
				{
					System.out.print(' ');
					System.out.print(word);
					System.out.print("\n");
					count = 0;
				}
				else
				{
					System.out.print(' ');
					System.out.print(word);
				}
			}
		}
		return 0;
	}


}

