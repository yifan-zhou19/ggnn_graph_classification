package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String a = new String(new char[256]);
		  String b = new String(new char[256]);
		  String c = new String(new char[256]);
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = tempVar.charAt(0);
		  }
		  String tempVar2 = ConsoleInput.scanfRead(" ");
		  if (tempVar2 != null)
		  {
			  b = tempVar2.charAt(0);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  c = tempVar3.charAt(0);
		  }
		  int i;
		  int j;
		  int k;
		  int nb;
		  int nc;
		  int count;
		  nb = 0;
		  nc = 0;
		  for (i = 0;b.charAt(i) != '\0';i++)
		  {
			  nb++;
		  }
		  for (i = 0;c.charAt(i) != '\0';i++)
		  {
			  nc++;
		  }
		  for (i = 0;a.charAt(i + 1) != '\0';i++)
		  {
			  if (a.charAt(i) == b.charAt(0))
			  {
				  count = 0;
				  k = i;
				  for (j = 0;j < nb;j++)
				  {
					  if (a.charAt(k + j) == b.charAt(j))
					  {
								count++;
					  }
					  else
					  {
						   break;
					  }
				  }
				  if (count == nb)
				  {
					   for (j = 0;j < nc;j++)
					   {
						  a = tangible.StringFunctions.changeCharacter(a, k + j, c.charAt(j));
					   }
					   break;
				  }
			  }
		  }
		  System.out.println(a);
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
	}

}

