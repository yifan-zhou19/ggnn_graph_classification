package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j = 0;
		int a;
		int[] b = new int[52];
		String s = new String(new char[301]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		a = s.length();
		for (i = 0;i < a;i++)
		{
			if (s.charAt(i) >= 65 && s.charAt(i) <= 90)
			{
				b[s.charAt(i) - 65]++;
			}
			if (s.charAt(i) >= 97 && s.charAt(i) <= 122)
			{
				b[s.charAt(i) - 71]++;
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (b[i] > 0)
			{
				j++;
				System.out.printf("%c=%d\n",i + 65,b[i]);

			}
		}
		for (i = 26;i < 52;i++)
		{
			if (b[i] > 0)
			{
				j++;
				System.out.printf("%c=%d\n",i + 71,b[i]);
			}
		}
		if (j == 0)
		{
			System.out.print("No");
		}
		return 0;
	}
}

