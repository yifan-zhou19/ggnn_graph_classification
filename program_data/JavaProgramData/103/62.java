package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String c = new String(new char[1200]);
		  char m;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  c = tempVar.charAt(0);
		  }
		  int i;
		  int j;
		  int a = 0;
		  int b;
		  int l;
		  l = c.length();
		  if (c.charAt(0) >= 'a' && c.charAt(0) <= 'z')
		  {
			  m = c.charAt(0) - 'a'+'A';
		  }
		  else
		  {
			 m = c.charAt(0);
		  }
		  a = 1;

		  for (i = 1;i < l;i++)
		  {
			  if (c.charAt(i) == c.charAt(i - 1) || c.charAt(i) == c.charAt(i - 1) + 32 || c.charAt(i) == c.charAt(i - 1) - 32)
			  {
				  a++;
			  }
			  else
			  {
				 System.out.printf("(%c,%d)",m,a);
				 a = 0;
				 if (c.charAt(i) >= 'a' && c.charAt(i) <= 'z')
				 {
				 m = c.charAt(i) - 'a'+'A';
				 }
				 else
				 {
					 m = c.charAt(i);
				 }
				 a++;
			  }
		  }
		  System.out.printf("(%c,%d)",m,a);
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
	}

}

