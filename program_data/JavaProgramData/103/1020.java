package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int j;
		  int k;
		  int t;
		  int a = 1;
		  String c = new String(new char[1001]);
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  c = tempVar.charAt(0);
		  }
		  for (i = 1;i <= 1000;i++)
		  {
			 if (c.charAt(i) >= 65 && c.charAt(i) < 97)
			 {
				 if (c.charAt(i) != c.charAt(i - 1) && (c.charAt(i) != c.charAt(i - 1) - 32))
				 {
					 if (c.charAt(i - 1) < 97)
					 {
					 System.out.printf("(%c,%d)",c.charAt(i - 1),a);
					 }
					 else
					 {
					 System.out.printf("(%c,%d)",c.charAt(i - 1) - 32,a);
					 }
					 a = 1;
				 }
				 else
				 {
					  a++;
				 }
			 }
			 if (c.charAt(i) >= 97 && c.charAt(i) <= 122)
			 {
				  if (c.charAt(i) != c.charAt(i - 1) && c.charAt(i) != (c.charAt(i - 1) + 32))
				  {
					  if (c.charAt(i - 1) < 97)
					  {
					  System.out.printf("(%c,%d)",c.charAt(i - 1),a);
					  }
					  else
					  {
					  System.out.printf("(%c,%d)",c.charAt(i - 1) - 32,a);
					  }
					  a = 1;
				  }
				 else
				 {
					  a++;
				 }
			 }
			  if (c.charAt(i) == '\0')
			  {
				  if (c.charAt(i - 1) < 97)
				  {
				  System.out.printf("(%c,%d)",c.charAt(i - 1),a);
				  }
				  else
				  {
				  System.out.printf("(%c,%d)",c.charAt(i - 1) - 32,a);
				  }
				  break;
			  }
		  }

	}

}

