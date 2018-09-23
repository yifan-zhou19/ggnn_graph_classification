package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 char[][] word = new char[50][20];
	 String s = new String(new char[100]);
	 String a = new String(new char[100]);
	 String b = new String(new char[100]);
	 String e = new String(new char[100]);
	 int i = 0;
	 int j = 0;
	 int k = 0;
	 s = new Scanner(System.in).nextLine();
	 while (true)
	 {
	  if (s.charAt(i) != ' ' && s.charAt(i) != '\0')
	  {
	   e = tangible.StringFunctions.changeCharacter(e, j, s.charAt(i));
	   j++;
	  }
	  else if (s.charAt(i) == ' ')
	  {
	   e = tangible.StringFunctions.changeCharacter(e, j, '\0');
	   word[k] = e;
	   j = 0;
	   k++;
	  }
	   else if (s.charAt(i) == '\0')
	   {
	   e = tangible.StringFunctions.changeCharacter(e, j, '\0');
	   word[k] = e;
	   break;
	   }
	  i++;
	 }
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (i = 0;i <= k;i++)
		{
			if (strcmp(a,word[i]) == 0)
			{
				word[i] = b;
			}
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%s ",word[i]);
		}
		System.out.printf("%s",word[k]);
		return 0;
	}

}

