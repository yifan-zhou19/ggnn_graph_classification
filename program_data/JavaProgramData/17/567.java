package <missing>;

public class GlobalMembers
{
	public static String s = new String(new char[100]);
	public static String a = new String(new char[100]);
	public static int[] b = new int[100];
	public static int num = 0;
	public static int i;
	public static int j;
	public static void f()
	{
		for (i = 0;i < s.length();i++) //?a[i]??????
		{
			a = tangible.StringFunctions.changeCharacter(a, i, ' ');
		}
		for (i = 0;i < s.length();i++)
		{
			if (s.charAt(i) == '(') //?s[i]=='('
			{
				 b[num] = i; //?b[num]?????
				 a = tangible.StringFunctions.changeCharacter(a, i, '$'); //?a[i]??'$'
				 num++; //num?1

			}
			else if (s.charAt(i) == ')' && num > 0) //?s[i]==')'&&num>0
			{
				num--; //num?1
				a = tangible.StringFunctions.changeCharacter(a, b[num], ' '); //?a[b[num]]????

			}
			else if (s.charAt(i) == ')' && num <= 0) //?s[i]==')'&&num<=0
			{
				a = tangible.StringFunctions.changeCharacter(a, i, '?'); //?a[i]???
			}
		}
		for (i = 0;i < s.length();i++)
		{
			System.out.print(a.charAt(i));
		}
		System.out.print("\n");
	}
	public static int Main()
	{
		while ((s = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			num = 0;
			System.out.print(s);
			System.out.print("\n");
			f();
		}
	}

}

