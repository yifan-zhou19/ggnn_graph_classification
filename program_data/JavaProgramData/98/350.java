package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int total = 0;
		int i = 0;
		int m = 0;
		int len;
		String word = new String(new char[40]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			word = tempVar.charAt(0);
		}
		len = word.length();
		System.out.print(word);
		i += len;
		total += 1;
		while (true)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				word = tempVar2.charAt(0);
			}
			len = word.length();
			if (total == n - 1)
			{
				System.out.print(" ");
				System.out.print(word);
				break;
			}
			else if (total < n - 1)
			{
				if (i + len + 1 <= 80)
				{
					System.out.print(" ");
					System.out.print(word);
					i += len + 1;
					total += 1;
				}
				else
				{
					System.out.print("\n");
					System.out.print(word);
					i = len;
					total += 1;
				}
			}
		}
		return 0;
	}
}

