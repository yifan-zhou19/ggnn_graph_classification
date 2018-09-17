package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int l;
		  int i;
		  int p = 0;
		  String s = new String(new char[1010]);
		  char c;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  s = tempVar.charAt(0);
		  }
		  l = s.length();
		  if ((s.charAt(0) >= 'a') && (s.charAt(0) <= 'z'))
		  {
		  c = s.charAt(0) - 'a'+'A';
		  }
		  else
		  {
		  c = s.charAt(0);
		  }
		  for (i = 0;i <= l;i++)
		  {
			  if ((s.charAt(i) != c) && ((s.charAt(i) - 'a'+'A') != c))
			  {
						 System.out.printf("(%c,%d)",c,p);
						 p = 0;
						 if ((s.charAt(i) >= 'a') && (s.charAt(i) <= 'z'))
						 {
						 c = s.charAt(i) - 'a'+'A';
						 }
						 else
						 {
						 c = s.charAt(i);
						 }
			  }
			  p++;
		  }
		  System.in.read();
		  System.in.read();
	}
}

