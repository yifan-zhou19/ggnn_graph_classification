package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		int[] num = new int[1000];
		int i;
		int j;
		int len;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len = a.length();
		for (i = 0;i < len ;i++)
		{
			if (a.charAt(i) > 'Z')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 'a' + 'A');
			}
		}
		for (i = 0; i < len ;i++)
		{
			j = i;
			while (a.charAt(j) == a.charAt(i))
			{
				j++;
				num[i]++;
			}
			System.out.print("(");
			System.out.print(a.charAt(i));
			System.out.print(",");
			System.out.print(num[i]);
			System.out.print(")");
			i = j - 1;
		}
		return 0;
	}
}

