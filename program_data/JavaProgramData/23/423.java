package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String str = new String(new char[102]); //re?????????????
	String re = new String(new char[102]);
	cin.get(str,100);
	int len;
	int i;
	int j;
	int m;
	len = str.length();
	m = 0;
	for (i = len - 1;i >= 0;i--)
	{
		if (str.charAt(i) == ' ')
		{
				for (j = i + 1;j < len;j++)
				{
			   re = tangible.StringFunctions.changeCharacter(re, m, str.charAt(j)); //?????????????????????re??
			   m++;
				}
			 re = tangible.StringFunctions.changeCharacter(re, m, ' ');
			 m++;
			 len = i;
		}
		if (i == 0)
		{
		   for (j = 0;j < len;j++)
		   {
			   re = tangible.StringFunctions.changeCharacter(re, m, str.charAt(j)); //????????????????re??
			   m++;
		   }
		}
	}
	for (i = 0;i < str.length();i++)
	{
		System.out.print(re.charAt(i));
	}
	return 0;
	}
}

