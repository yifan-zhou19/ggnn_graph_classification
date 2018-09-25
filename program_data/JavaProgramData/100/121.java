package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int[] a = new int[26];
		int sum = 0;
		String b = new String(new char[26]);
		String str = new String(new char[300]);
		str = new Scanner(System.in).nextLine();
		for (i = 0;i < 26;i++)
		{
			b = tangible.StringFunctions.changeCharacter(b, i, 'a' + i);
		}
		for (i = 0;i < str.length();i++)
		{
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
			{
				a[str.charAt(i) - 'a']++;
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (a[i] != 0)
			{
				sum++;
				System.out.printf("%c=%d\n",b.charAt(i),a[i]);
			}
		}
		if (sum == 0)
		{
			System.out.print("No");
		}
	}
}

