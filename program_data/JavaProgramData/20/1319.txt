package <missing>;

public class GlobalMembers
{
	public static int choose(String str, int k)
	{
		int i;
		int max;
		int maxc;
		maxc = str[0];
		max = 0;
		for (i = 0;i < k;i++)
		{
			if (str[i].compareTo(maxc) > 0)
			{
				maxc = str[i];
				max = i;
			}
		}
		return max;
	}
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static String Main_str = new String(new char[15]);
String substr = new String(new char[4]);
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static String Main_cs = new String(new char[11]);
	public static int Main()
	{
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//		static char str[15],substr[4];
			while (scanf("%s%s",Main_str,substr) != EOF)
			{


		int k;
		k = Main_str.length();
		int max;
		max = choose(Main_str, k);
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//	static char cs[11];
		int i;
		for (i = max + 1;i < k;i++)
		{
			Main_cs = tangible.StringFunctions.changeCharacter(Main_cs, i, Main_str.charAt(i));
		}
		for (i = max + 1;i <= max + 3;i++)
		{
			Main_str = tangible.StringFunctions.changeCharacter(Main_str, i, substr.charAt(i - max - 1));
		}
		for (i = max + 4;i < k + 3;i++)
		{
			Main_str = tangible.StringFunctions.changeCharacter(Main_str, i, Main_cs.charAt(i - 3));
		}
		Main_str = tangible.StringFunctions.changeCharacter(Main_str, k + 3, '\0');
		System.out.println(Main_str);
			}
		return 0;
	}


}

