package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		char[] word = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		int end = 0;
		for (int i = 1;i <= n;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				word = tempVar.charAt(0);
			}
			int l = word.length();
			if (end + l + 1 > 80)
			{
				System.out.print("\n");
				System.out.print(word);
				end = l;
			}
			else
			{
				if (i > 1)
				{
					System.out.print(' ');
					end++;
				}
				System.out.print(word);
				end = end + l;
			}
		}
		return 0;
	}
}

