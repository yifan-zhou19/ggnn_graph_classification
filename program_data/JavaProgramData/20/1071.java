package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int a;
		int b;
		int max;
		String str = new String(new char[11]);
		String substr = new String(new char[4]);
		String mix = new String(new char[14]);
		while (scanf("%s%s",str,substr) != EOF)
		{

			a = str.length();
			b = substr.length();
			max = 0;
			j = 0;
			for (i = 0;i < a + b;i++)
			{
				mix = mix.substring(0, i);
			}

			for (i = 0;i < a;i++)
			{
				if (str.charAt(i) > max)
				{
					max = str.charAt(i);
					j = i;
				}
			}

			for (i = 0;i < a + b;i++)
			{
				if (i <= j)
				{
					mix = tangible.StringFunctions.changeCharacter(mix, i, str.charAt(i));
				}
				if (i > j && i <= j + b)
				{
					mix = tangible.StringFunctions.changeCharacter(mix, i, substr.charAt(i - j - 1));
				}
				if (i > j + b && i < a + b)
				{
					mix = tangible.StringFunctions.changeCharacter(mix, i, str.charAt(i - b));
				}
				System.out.printf("%c",mix.charAt(i));
			}
			System.out.print("\n");

		}
	}









}

