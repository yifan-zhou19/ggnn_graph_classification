package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s1 = new String(new char[10]);
		String s2 = new String(new char[30]);
	  int i;
	  int j;
	  int len;
	  int max;
	  while (scanf("%s%s",s1,s2) != EOF)
	  {
		max = 0;
		final String s3 = "";
	  len = s1.length();
	  for (i = 0;i < len;i++)
	  {
		if (s1.charAt(i) > max)
		{
			j = i,max = s1.charAt(i);
		}
	  }
	for (i = j + 1;i < len;i++)
	{
		s3 = tangible.StringFunctions.changeCharacter(s3, i - j - 1, s1.charAt(i),s1[i] = '\0');
	}
	  s1 += s2;
	  s1 += s3;
	  System.out.printf("%s\n",s1);
	  }
	}
}

