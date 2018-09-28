package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String p;
	  String s = new String(new char[200]);
	  char l;
	  char i;
	  p = s;
	  p = new Scanner(System.in).nextLine();
	  l = p.length();
	  for (i = l + 1;i >= 0;i--)
	  {
		  if (*(p + i) == ' ')
		  {
			  System.out.printf("%s ",p + i + 1);
		  *(p + i) = '\0';
		  }

	  }
	  System.out.printf("%s",p);

	}
}
