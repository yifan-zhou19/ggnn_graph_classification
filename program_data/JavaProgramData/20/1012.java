package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int s1;
	  int s2;
	  int i;
	  int j;
	  int t;
	  int max;
	  String str = new String(new char[20]);
	  String substr = new String(new char[5]);
	  String a = new String(new char[20]);
	  while (scanf("%s%s",str,substr) != EOF)
	  {
		  s1 = str.length();
		  s2 = substr.length();
		  max = 0;
		  for (i = 0;i < s1;i++)
		  {
			if (max < str.charAt(i))
			{
			  max = str.charAt(i);
			  t = i;
			}
		  }
		   j = 0;
		   for (i = t + 1;i < s1;i++)
		   {
			  a = tangible.StringFunctions.changeCharacter(a, j, str.charAt(i));
			  j++;
		   }
		   j = 0;
		   for (i = t + 1;i < t + s2 + 1;i++)
		   {
			   str = tangible.StringFunctions.changeCharacter(str, i, substr.charAt(j));
			   j++;
		   }
		   j = 0;
		   for (i = t + s2 + 1;i < s1 + s2;i++)
		   {
				  str = tangible.StringFunctions.changeCharacter(str, i, a.charAt(j));
			   j++;
		   }
		   for (i = 0;i < s1 + s2 - 1;i++)
		   {
			 System.out.printf("%c",str.charAt(i));
		   }
		   System.out.printf("%c\n",str.charAt(s1 + s2 - 1));
	  }
	return 0;
	}
}

