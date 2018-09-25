package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[301]);
		int[] count = new int[52];
		int i;
		int flag = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}

		i = 0;
		while (str.charAt(i) != '\0')
		{
			if ((str.charAt(i) >= 'A') && (str.charAt(i) <= 'Z'))
			{
				count[str.charAt(i) - 'A']++;
			}
			else if ((str.charAt(i) >= 'a') && (str.charAt(i) <= 'z'))
			{
				count[str.charAt(i) - 'a' + 26]++;
			}
			i++;
		}

		for (i = 0; i < 26; i++)
		{
			if (count[i] > 0)
			{
				System.out.printf("%c=%d\n", i + 'A', count[i]);
				flag++;
			}
		}
		for (; i < 52; i++)
		{
			if (count[i] > 0)
			{
				System.out.printf("%c=%d\n", i + 'a' - 26, count[i]);
				flag++;
			}
		}
		if (flag == 0)
		{
			System.out.print("No\n");
		}

		return 0;
	}
}

