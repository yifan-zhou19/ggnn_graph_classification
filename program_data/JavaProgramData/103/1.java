package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 String p = new String(new char[1000]);
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 p = tempVar.charAt(0);
	 }
	 int i = 0;
	 char c;
	 char t;
	 int n;
	 while (true)
	 {
			 if (p.charAt(i) == '\0')
			 {
				  System.out.printf("(%c,%d)\n",c,n);
				  break;
			 }
			 if (i == 0)
			 {
				  if (p.charAt(i) >= 'A' && p.charAt(i) < 'Z')
				  {
					 c = p.charAt(i);
				  }
				  else
				  {
					 c = p.charAt(i) - 'a'+'A';
				  }
				  n = 1;
			 }
			 else
			 {
				  if (p.charAt(i) >= 'A' && p.charAt(i) < 'Z')
				  {
					 t = p.charAt(i);
				  }
				  else
				  {
					 t = p.charAt(i) - 'a'+'A';
				  }
				  if (t == c)
				  {
					 n++;
				  }
				  else
				  {
					  System.out.printf("(%c,%d)",c,n);
					  c = t;
					  n = 1;
				  }
			 }
		i++;
	 }
	}

}

