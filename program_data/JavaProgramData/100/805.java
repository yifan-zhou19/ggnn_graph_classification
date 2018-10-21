package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[301]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}

		int[] array = new int[26];

		int i = 0;
		int j = 0;
		while (str.charAt(i) != '\0')
		{
			if ((str.charAt(i) >= 'a') && (str.charAt(i) <= 'z'))
			{
				array[str.charAt(i) - 'a'] += 1;
							j++;
			}
			i++;
		}

			if (j == 0)
			{
				System.out.print("No\n");
			}
		i = 0;
		char c = 'a';
		while (i < 26)
		{
			if (array[i] != 0)
			{
							c = i + 'a';
				System.out.printf("%c=%d\n\n", c, array[i]);
			}
			i++;
		}
			return 0;
	}

}

