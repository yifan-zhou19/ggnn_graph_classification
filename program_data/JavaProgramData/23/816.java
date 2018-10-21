package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str1 = new String(new char[100]);
		String str2 = new String(new char[100]);
		int i;
		int j;
		int k;
		int l;
		int m;
		int n;
		str1 = new Scanner(System.in).nextLine();
		l = str1.length();
		m = 0;
		n = -1;
		j = l - 1;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	 loop:
	 {
			  for (i = n + 1;i < l;i++)
			  {
				  if (str1.charAt(i) != ' ')
				  {
					  break;
				  }
			  }
			  m = i;
			  for (i = m + 1;i <= l;i++)
			  {
				  if (str1.charAt(i) == ' ')
				  {
					  break;
				  }
				  else if (str1.charAt(i) == '\0')
				  {
					  break;
				  }
			  }
			  n = i - 1;
			  for (k = n;k >= m;k--)
			  {
				  str2 = tangible.StringFunctions.changeCharacter(str2, j, str1.charAt(k));
				  j = j - 1;
			  }
			  if (i != l)
			  {
				str2 = tangible.StringFunctions.changeCharacter(str2, j, ' ');
				j = j - 1;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto loop;
			  }
			else
			{
				str2 = tangible.StringFunctions.changeCharacter(str2, l, '\0');
				System.out.printf("%s",str2);
			}
	 }
	}
}

