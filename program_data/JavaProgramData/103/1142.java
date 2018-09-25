package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		String str = new String(new char[1100]);
		int[] a = new int[26];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		str = tangible.StringFunctions.changeCharacter(str, str.length(), str.charAt(str.length() - 1) + 1);
		for (i = 0;i < str.length() - 1;i++)
		{
			if (str.charAt(i) == str.charAt(i + 1) || Math.abs(str.charAt(i) - str.charAt(i + 1)) == 'a'-'A')
			{
				if (str.charAt(i) - 'A' < 26)
				{
					a[str.charAt(i) - 'A']++;
				}
				else
				{
					a[str.charAt(i) - 'a']++;
				}
			}
			else
			{
				if (str.charAt(i) - 'A' < 26)
				{
					a[str.charAt(i) - 'A']++;
				}
				else
				{
					a[str.charAt(i) - 'a']++;
				}
				if (str.charAt(i) - 'A' < 26)
				{
					System.out.printf("(%c,%d)",str.charAt(i),a[str.charAt(i) - 'A']);
					a[str.charAt(i) - 'A'] = 0;
				}
				else
				{
					System.out.printf("(%c,%d)",str.charAt(i) - 'a'+'A',a[str.charAt(i) - 'a']);
					a[str.charAt(i) - 'a'] = 0;
				}
			}
		}

	}

}

