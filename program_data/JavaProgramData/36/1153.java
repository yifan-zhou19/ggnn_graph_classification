package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] alpha = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int[] alphb = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int lenA = a.length();
		int lenB = b.length();
		int i;
		int j;
		for (i = 0, j = 0 ; i < lenA, j < lenB ; i++, j++)
		{
			if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
			{
				alpha[a.charAt(i) - 'a']++;
			}
			else if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z')
			{
				alpha[a.charAt(i) - 'A']++;
			}
			if (b.charAt(i) >= 'a' && b.charAt(i) <= 'z')
			{
				alphb[b.charAt(i) - 'a']++;
			}
			else if (b.charAt(i) >= 'A' && b.charAt(i) <= 'Z')
			{
				alphb[b.charAt(i) - 'A']++;
			}
		}
		for (i = 0 ; i < 52 ; i++)
		{
			if (alpha[i] != alphb[i])
			{
				break;
			}
		}
		if (i < 52)
		{
			System.out.print("NO");
			System.out.print("\n");
		}
		else
		{
			System.out.print("YES");
			System.out.print("\n");
		}
		return 0;
	}
}

