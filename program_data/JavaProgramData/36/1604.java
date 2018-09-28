package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String ce = "abcdefghijklmnopqrstuvwxyz";
		String s1 = new String(new char[max]);
		String s2 = new String(new char[max]);
		s1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		s2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int[] ce1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		for (int i = 0; i < s1.length();i++)
		{
		for (int j = 0; j < 26;j++)
		{
		if (s1.charAt(i) == ce.charAt(j))
		{
			ce1[j]++;
			break;
		}
		}
		}
		for (int i = 0; i < s2.length();i++)
		{
		for (int j = 0; j < 26;j++)
		{
		if (s2.charAt(i) == ce.charAt(j))
		{
			ce1[j]--;
			break;
		}
		}
		}
		int i = 0;
		for (i = 0; i < 26;i++)
		{
		if (ce1[i] != 0)
		{
			break;
		}
		}
		if (i == 26)
		{
			System.out.print("YES");
		}
		else
		{
			System.out.print("NO");
		}

	}










}

