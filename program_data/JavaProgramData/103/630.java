package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String s = new String(new char[255]);
	String p = s;
	int i = 0;
	int j = 1;

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		s = tempVar.charAt(0);
	}
	if (s.length() > 255)
	{


	}
	while (i < s.length())
	{
		while (p != '\0')
		{
		  if (p >= 'A' && p <= 'Z')
		  {
		  p = p.Substring(32);
		  }
		  p = p.Substring(1);
		}
	  if (s.charAt(i) == s.charAt(i + 1))
	  {
	   j++;
	  }
	 else
	 {
	   System.out.printf("(%c,%d)",s.charAt(i) - 'a'+'A',j);
	   j = 1;
	 }
	i++;
	}
	}
}

