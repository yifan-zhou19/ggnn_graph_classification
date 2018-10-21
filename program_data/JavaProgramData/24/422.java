package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int max;
		int min;
		int n;
		int i;
		int b;
		int c;
		int len;
		char[][] str = new char[200][20];
		String x = new String(new char[500]);
		x = new Scanner(System.in).nextLine();
		int totalLen = x.length();
		x = tangible.StringFunctions.changeCharacter(x, totalLen, ' ');
		x = tangible.StringFunctions.changeCharacter(x, totalLen + 1, '\0');
		int begin = 0;
		int end;
		len = 0;
		for (i = 0;i <= totalLen;i++)
		{
			if (x.charAt(i) == ' ')
			{
				end = i;
				str[len] = String.valueOf(x.charAt(begin)).substring(0, end - begin);
				str[len][end - begin] = '\0';
				len++;
				begin = i + 1;
			}
		}
		max = 0;
		min = 100;
		for (i = 0;i < len;i++)
		{
			if (String.valueOf(str[i]).length() > max)
			{
				max = String.valueOf(str[i]).length();
				b = i;
			}
			if (String.valueOf(str[i]).length() < min)
			{
				min = String.valueOf(str[i]).length();
				c = i;
			}
		}
		System.out.printf("%s\n%s",str[b],str[c]);
			 return 0;
	}
}

