package <missing>;

public class GlobalMembers
{
	public static final String minword = "\0";
	public static final String maxword = "\0";

	public static void clear(int i)
	{
		int j = 0;
		for (j = 0; j < 50; j++)
		{
			if (i == 0)
			{
				minword = minword.substring(0, j);
			}
			else
			{
				maxword = maxword.substring(0, j);
			}
		}
	}

	public static int Main()
	{
		String a = new String(new char[1001]);
	   String str = new String(new char[51]);

	   int max = 0;
	   int min = 100;
	   int i;
	   int len = 0;
	   int n;
	   a = new Scanner(System.in).nextLine();
	   n = a.length();
	   a = tangible.StringFunctions.changeCharacter(a, n, ' ');
	   a = tangible.StringFunctions.changeCharacter(a, n + 1, '\0');

	   for (i = 0;i < n + 1;i++)
	   {
			 str = tangible.StringFunctions.changeCharacter(str, len, a.charAt(i));
			 len++;
			 if (a.charAt(i) == ' ')
			 {
				 str = tangible.StringFunctions.changeCharacter(str, len - 1, '\0');
				 len = 0;
				 //printf("%s\n", str);
			 }

			 if (str.length() < min && len == 0)
			 {
				 min = str.length();
				 clear(0);
				 minword = str;
				 //printf("min=%d, %s\n",min, minword);
			 }
			 if (str.length() > max && len == 0)
			 {
				 max = str.length();
				 clear(1);
				 maxword = str;
				 //printf("max=%d, %s\n",max, maxword);
			 }
	   }
		System.out.printf("%s\n%s",maxword,minword);

		return 0;
	}

}

