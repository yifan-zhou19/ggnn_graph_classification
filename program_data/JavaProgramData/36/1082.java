package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[20]);
		String b = new String(new char[20]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		if (a.length() != b.length())
		{
			System.out.print("NO");
			System.out.print("\n");
			return 0;
		}
		int[] le1 = new int[52];
		int[] le2 = new int[52];
		for (int i = 0;i < 52;i++)
		{
			le1[i] = le2[i] = 0;
		}
		int len1 = a.length();

	for (int i = 0;i < len1;i++)
	{
		if (a.charAt(i) >= 'a')
		{
			le1[a.charAt(i) - 'a']++;
		}
		else
		{
			le1[a.charAt(i) - 'A' + 26]++;
		}
	}
	for (int i = 0;i < len1;i++)
	{
		if (b.charAt(i) >= 'a')
		{
			le2[b.charAt(i) - 'a']++;
		}
		else
		{
			le2[b.charAt(i) - 'A' + 26]++;
		}
	}
	int j;
	for (j = 0;j < 52;j++)
	{
		if (le1[j] != le2[j])
		{
			System.out.print("NO");
			System.out.print("\n");
			return 0;
		}
	}

		System.out.print("YES");
		System.out.print("\n");
	return 0;




	}
}

