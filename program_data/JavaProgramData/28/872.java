package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 String s = new String(new char[6000]);
	 String tem = new String(new char[100]);
	 int i = 0;
	 int m;
	 int p;
	 int j;
	 p = 0;
	 s = new Scanner(System.in).nextLine();
	 int t;
	  t = s.length();
	 for (m = 0;m < t + 1;m++)
	 {
	  if (s.charAt(m) != ' ' && s.charAt(m) != '\0')
	  {
	   tem = tangible.StringFunctions.changeCharacter(tem, i, s.charAt(m));
	   i++;
	  }
	  else
	  {
	   if (p == 0)
	   {
		  tem = tangible.StringFunctions.changeCharacter(tem, i, '\0');
	   System.out.printf("%d",tem.length());
	   i = 0;
	   p = 1;
	   for (j = m + 1;;j++)
	   {
		   if (s.charAt(j) != ' ')
		   {
			   m = j - 1;
			   break;
		   }
	   }
	   }
	   else
	   {
	   tem = tangible.StringFunctions.changeCharacter(tem, i, '\0');
	   System.out.printf(",%d",tem.length());
	   i = 0;
	   for (j = m + 1;;j++)
	   {
		   if (s.charAt(j) != ' ')
		   {
			   m = j - 1;
			   break;
		   }
	   }
	   }
	  }
	 }
	  return 0;
	}

}

