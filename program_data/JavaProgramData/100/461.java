package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int[] b = new int[26];
		int sum = 0;
		int j;
		String s = new String(new char[300]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		while (s.charAt(i) != null)
		{
			j = s.charAt(i) - 'a';
			if (j >= 0 && j <= 25)
			{
				b[j]++;
			sum = 1;
			}
			i++;
		}
		for (j = 0; j < 26; j++)
		{
			if (b[j] != 0)
			{
				System.out.printf("%c=%d\n", (j + 'a'),b[j]);
			}
		}
		if (sum == 0)
		{
			System.out.print("No");
		}
		return 0;
	}

}

