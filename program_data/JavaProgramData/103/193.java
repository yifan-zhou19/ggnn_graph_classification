package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String c = new String(new char[10000]);
	char a;
	int i;
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		c = tempVar.charAt(0);
	}
	a = c.charAt(0);
	n = 1;
	if (c.charAt(1) == '\0')
	{
				  if (a - 'a' >= 0)
				  {
				  System.out.printf("(%c,1)",a - 'a'+'A');
				  }
				  else
				  {
				  System.out.printf("(%c,1)",a);
				  }
	}
	else
	{
	for (i = 1;c.charAt(i) != '\0';i++)
	{
						   if ((c.charAt(i) == a) || (c.charAt(i) - 'a'+'A' == a) || (c.charAt(i) + 'a'-'A' == a))
						   {
																			 n = n + 1;
																			 if (c.charAt(i + 1) == '\0')
																			 {
																							 if (a - 'a' >= 0)
																							 {
																							 System.out.printf("(%c,%d)",a - 'a'+'A',n);
																							 }
																							 else
																							 {
																							 System.out.printf("(%c,%d)",a,n);
																							 }
																			 }
						   }
						   else
						   {
								   if (a - 'a' >= 0)
								   {
								   System.out.printf("(%c,%d)",a - 'a'+'A',n);
								   }
								   else
								   {
								   System.out.printf("(%c,%d)",a,n);
								   }
								   n = 1;
								   a = c.charAt(i);
						   if (c.charAt(i + 1) == '\0')
						   {
							if (a - 'a' >= 0)
							{
							System.out.printf("(%c,1)",c.charAt(i) - 'a'+'A');
							}
							else
							{
							System.out.printf("(%c,1)",c.charAt(i));
							}
						   }
						   }
	}
	}
		  System.in.read();
		  System.in.read();
	}

}

