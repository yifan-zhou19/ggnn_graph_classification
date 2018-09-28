package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String s = new String(new char[2000]);
		  s = new Scanner(System.in).nextLine();
		  int i;
		  for (i = 0;s.charAt(i) != '\0';i++)
		  {
			  if (s.charAt(i) >= 48 && s.charAt(i) <= 57 && s.charAt(i + 1) >= 48 && s.charAt(i + 1) <= 57)
			  {
		  System.out.printf("%c",s.charAt(i));
			  }
		  if (s.charAt(i) >= 48 && s.charAt(i) <= 57 && (s.charAt(i + 1) < 48 || s.charAt(i + 1)>57))
		  {
		  System.out.printf("%c\n",s.charAt(i));
		  }
		  }
		  System.in.read();
		  System.in.read();
		  return 0;
	}

}
