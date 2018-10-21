package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int n;
	  int i;
	  int j;
	  int t;
	  int len1;
	  int len2;
	  String s1 = new String(new char[100]);
	  String s2 = new String(new char[100]);
	  String answer = new String(new char[100]);
	  char[] out = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 1;i <= n;i++)
	  {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			s2 = tempVar3.charAt(0);
		}
		len1 = s1.length();
		t = 99;
		for (j = len1 - 1;j >= 0;j--)
		{
		   s1 = tangible.StringFunctions.changeCharacter(s1, t, s1.charAt(j));
		   s1 = s1.substring(0, j);
		   t--;
		}
		len2 = s2.length();
		t = 99;
		for (j = len2 - 1;j >= 0;j--)
		{
		   s2 = tangible.StringFunctions.changeCharacter(s2, t, s2.charAt(j));
		   s2 = s2.substring(0, j);
		   t--;
		}
		for (j = len2;j < len1;j++)
		{
			s2 = tangible.StringFunctions.changeCharacter(s2, 99 - j, '0');
		}
		for (j = 99;j >= 0;j--)
		{
		  if (s1.charAt(j) >= s2.charAt(j))
		  {
			  answer = tangible.StringFunctions.changeCharacter(answer, j, s1.charAt(j) - s2.charAt(j) + 48);
		  }
		  else
		  {
			answer = tangible.StringFunctions.changeCharacter(answer, j, 58 + s1.charAt(j) - s2.charAt(j));
			s1 = tangible.StringFunctions.changeCharacter(s1, j - 1, s1.charAt(j - 1) - 1);
		  }
		}
		t = 0;
		for (j = 0;j <= 99;j++)
		{
			out[j] = 0;
		}
		for (j = 99 - len1 + 1;j <= 99;j++)
		{
		  out[t] = answer.charAt(j);
		  t++;
		}
		System.out.printf("%s\n",out);
	  }
	}
}

