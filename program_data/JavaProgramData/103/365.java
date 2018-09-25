package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j = 0;
		int k;
		int[] sum = new int[1000];
		String str = new String(new char[1100]);
		String a = new String(new char[1000]);
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (i = 0;i < str.length();i++)
		{
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
			{
				str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(i) - 32);
			}
		}
		a = tangible.StringFunctions.changeCharacter(a, 0, str.charAt(0));
		for (i = 1;i < str.length();i++)
		{
			if (str.charAt(i) == str.charAt(i - 1))
			{
				sum[j]++;
			}
			else
			{
				  j = j + 1;
				  a = tangible.StringFunctions.changeCharacter(a, j, str.charAt(i));
			}
		}
		for (i = 0;i <= j;i++)
		{
			System.out.print("(");
			System.out.print(a.charAt(i));
			System.out.print(",");
			System.out.print(sum[i] + 1);
			System.out.print(")");
		}
		return 0;
	}
}

