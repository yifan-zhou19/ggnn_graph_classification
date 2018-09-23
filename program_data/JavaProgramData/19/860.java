package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String a = new String(new char[100]);
	   String b = new String(new char[100]);
	   String c = new String(new char[100]);
	   a = new Scanner(System.in).nextLine();
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   b = tempVar.charAt(0);
	   }
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   c = tempVar2.charAt(0);
	   }
	   int i;
	   int j;
	   int k;
	   int strat;
	   strat = 0;
	   for (i = strat;a.charAt(i) != '\0';i++)
	   {
		  if (a.charAt(i) == b.charAt(0))
		  {
			 for (j = 1,k = i + 1;j < b.length();j++,k++)
			 {
				if (b.charAt(j) != a.charAt(k))
				{
					break;
				}
			 }
		  }
			  if (j == b.length() && i == 0)
			  {
			  for (k = strat;k < i;k++)
			  {
				  System.out.printf("%c",a.charAt(k));
			  }
			  System.out.printf("%s",c);
			  strat = i + b.length();
			  i = strat - 1;
			  }

		  else if (j == b.length() && a.charAt(i - 1) == ' ')
		  {
			  for (k = strat;k < i;k++)
			  {
				  System.out.printf("%c",a.charAt(k));
			  }
			  System.out.printf("%s",c);
			  strat = i + b.length();
			  i = strat - 1;
		  }
		  j = 0;
	   }
	   for (i = strat;a.charAt(i) != '\0';i++)
	   {
		   System.out.printf("%c",a.charAt(i));
	   }
	   System.out.print("\n");
	}
}

