package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String s = new String(new char[1000]);
		  int l;
		  int i;
		  int j = 1;
		  s = new Scanner(System.in).nextLine();
		  l = s.length();
		  for (i = 0;i < l;i++)
		  {
		  if (s.charAt(i + 1) == s.charAt(i) || s.charAt(i + 1) == s.charAt(i) + 32 || s.charAt(i + 1) == s.charAt(i) - 32)
		  {
		  j++;
		  }
		  else
		  {
			  if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
			  {
				  System.out.printf("(%c,%d)",s.charAt(i) - 32,j);
			  j = 1;
			  }
			  else
			  {
				  System.out.printf("(%c,%d)",s.charAt(i),j);
			  j = 1;
			  }
		  }
		  }
		  System.in.read();
		  System.in.read();
		  return 0;
	}

}
