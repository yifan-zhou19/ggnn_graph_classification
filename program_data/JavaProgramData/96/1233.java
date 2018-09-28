package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String s = new String(new char[100]);
	  int i;
	  int j = 0;
	  int a = 0;
	  s = new Scanner(System.in).nextLine();
	  for (i = 0;s.charAt(i) != '\0';i++)
	  {
		a = a * 10 + s.charAt(i) - '0';
		if (j != 0 || a / 13 != 0)
		{
		  s = tangible.StringFunctions.changeCharacter(s, j, '0' + a / 13);
		  a = a % 13;
		  j++;
		}
	  }
	  s = s.substring(0, j);
	  if (j > 0)
	  {
		  System.out.printf("%s\n%d",s,a);
	  }
	  else
	  {
		  System.out.printf("0\n%d",a);
	  }
	}
}

