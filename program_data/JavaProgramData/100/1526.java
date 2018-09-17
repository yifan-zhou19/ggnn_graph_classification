package <missing>;

public class GlobalMembers
{
	public static String s = new String(new char[255]);

	public static int Main()
	{
	  char c;
	  int f = 1;
	  while ((c = System.in.read()) != '\n')
	  {
		  ++s.charAt(c);
	  }
	  for (c = 'A'; c <= 'Z'; ++c)
	  {
		if (s.charAt(c) != null)
		{
		  System.out.printf("%c=%d\n", c, s.charAt(c));
		  f = 0;
		}
	  }
	  for (c = 'a'; c <= 'z'; ++c)
	  {
		if (s.charAt(c) != null)
		{
		  System.out.printf("%c=%d\n", c, s.charAt(c));
		  f = 0;
		}
	  }
	  if (f != 0)
	  {
		  System.out.print("No\n");
	  }
	  return 0;
	}

}
