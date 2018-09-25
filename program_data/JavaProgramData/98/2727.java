package <missing>;

public class GlobalMembers
{
	public static String word = new String(new char[45]);
	public static int length = 0;

	public static int Main()
	{
		int n;
		int i = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while ((i++) < n)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				word = tempVar2.charAt(0);
			}
			int len = word.length();
			if (length + len + 1 <= 80)
			{
				length += len;
				if (i != 1)
				{
				length++, cout << " " << word;
				}
				else
				{
				System.out.print(word);
				}
			}
			else
			{
				System.out.print("\n");
				System.out.print(word);
				length = len;
			}
		}
		return 0;

	}


}

