package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int n;
	int m;
	int a = 0;
	int i;
	String str = new String(new char[3000]);
	str = new Scanner(System.in).nextLine();
	n = str.length();
	str = tangible.StringFunctions.changeCharacter(str, n, '\0');
	for (i = 0;;i++)
	{
	  if (str.charAt(i) == ' ' || str.charAt(i) == '\0')
	  {
		  m = i;
		  System.out.printf("%d",m);
		  break;
	  }
	  else
	  {
		  continue;
	  }
	}
	for (i = m + 1;i < n;i++)
	{
	  if (str.charAt(i) != ' ')
	  {
		  a++;
	  }
	  if ((str.charAt(i) == ' ' && str.charAt(i + 1) != ' '))
	  {
		  System.out.printf(",%d",a);
		  a = 0;
	  }
	  if (str.charAt(i + 1) == '\0')
	  {
		  System.out.printf(",%d",a);
	  }
	}
	}


}

