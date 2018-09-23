package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int l;
		String a = new String(new char[1000]);
		String b = new String(new char[1000]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		l = a.length();
		int[] num = new int[1000];
		int i;
		int j = 0;
		for (i = 0; i <= l; i++)
		{
			num[i] = 1;
		}
		for (i = 0; i < l;i++)
		{
			if (a.charAt(i + 1) != a.charAt(i) && a.charAt(i + 1) != a.charAt(i) + 32 && a.charAt(i + 1) != a.charAt(i) - 32)
			{
				b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(i));
				j++;
			}
		   if (a.charAt(i + 1) == a.charAt(i) || a.charAt(i + 1) == a.charAt(i) + 32 || a.charAt(i + 1) == a.charAt(i) - 32)
		   {
			   num[j]++;
		   }
		}
		b = tangible.StringFunctions.changeCharacter(b, j - 1, a.charAt(l - 1));
		for (i = 0; i < j; i++)
		{
			if (b.charAt(i) >= 'A' && b.charAt(i) <= 'Z')
			{
				System.out.print("(");
				System.out.print(b.charAt(i));
				System.out.print(",");
				System.out.print(num[i]);
				System.out.print(")");
			}
			if (b.charAt(i) >= 'a' && b.charAt(i) <= 'z')
			{
			System.out.print("(");
			System.out.print((char)(b.charAt(i) - 'a' + 'A'));
			System.out.print(",");
			System.out.print(num[i]);
			System.out.print(")");
			}
		}
		return 0;
	}
}

