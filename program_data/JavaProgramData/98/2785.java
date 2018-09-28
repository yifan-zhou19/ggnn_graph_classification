package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String word = new String(new char[50]);
		int count = 0;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			word = tempVar.charAt(0);
		}
		count = word.length();
		System.out.print(word);
		for (int i = 1;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				word = tempVar2.charAt(0);
			}
			if (count + word.length() + 1 <= 80)
			{
				count = count + word.length() + 1;
				System.out.print(" ");
				System.out.print(word);
			}
			else
			{
				System.out.print("\n");
				System.out.print(word);
				count = word.length();
			}
		}
		return 0;

	}
}

