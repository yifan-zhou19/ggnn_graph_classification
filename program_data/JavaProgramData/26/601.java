package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 String a = new String(new char[101]);
	 char c;
	 int i = 1;
	 while ((c = System.in.read()) != '\n')
	 {
	  a = tangible.StringFunctions.changeCharacter(a, i, c);
	  if (a.charAt(i) == ' ')
	  {
	   if (a.charAt(i) == a.charAt(i - 1))
	   {
		   i++;
		   continue;
	   }
	   else
	   {
		   System.out.print(" ");
		   i++;
	   }
	  }
	  else
	  {
		System.out.print(a.charAt(i));
		i++;
	  }
	 }
	 return 0;
	}
}

