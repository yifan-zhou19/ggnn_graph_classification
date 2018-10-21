package <missing>;

public class GlobalMembers
{
	public static char[][] words =
	{
		{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
	};
	public static int Main()
	{
	//	freopen("in.in","r",stdin);
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		int i = 0;
		for (i = 0; i < n; i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				words[i] = tempVar.charAt(0);
			}
		}

		int count = 0;
		int current = 0;
		System.out.print(words[count]);
		current = String.valueOf(words[count]).length();
		count++;
		while (count < n)
		{
			if (current + String.valueOf(words[count]).length() + 1 > 80)
			{
				System.out.print("\n");
				System.out.print(words[count]);
				current = String.valueOf(words[count]).length();
			}
			else if (current + String.valueOf(words[count]).length() + 1 == 80)
			{
				System.out.print(" ");
				System.out.print(words[count]);
				System.out.print("\n");
				current = 0;
			}
			else if (current + String.valueOf(words[count]).length() + 1 < 80)
			{
				if (current != 0)
				{
					System.out.print(" ");
					current++;
				}
				System.out.print(words[count]);
				current += String.valueOf(words[count]).length();
			}
			count++;
		}

		return 0;
	}
}

