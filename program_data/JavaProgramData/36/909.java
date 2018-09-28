package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		for (int k = 0;k < 100;k++)
		{
			a = tangible.StringFunctions.changeCharacter(a, k, '{');
			b = tangible.StringFunctions.changeCharacter(b, k, '{');
		}
		int[] a1 = new int[100];
		int[] b1 = new int[100];
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		a = tangible.StringFunctions.changeCharacter(a, a.length(), '{');
		b = tangible.StringFunctions.changeCharacter(b, b.length(), '{');
		for (int i = 0;i < 100;i++)
		{
		   a1[a.charAt(i) - 'A']++;
		   b1[b.charAt(i) - 'A']++;
		}
		for (int j = 0;j < 100;j++)
		{
			if (a1[j] != b1[j])
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

