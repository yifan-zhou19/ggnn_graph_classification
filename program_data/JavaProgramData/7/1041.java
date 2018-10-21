package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String a = new String(new char[1000]);
		  String b = new String(new char[1000]);
		  String c = new String(new char[1000]);
		  int l;
		  int i;
		  int j;
		  int k;
		  int temp;
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
		  l = b.length();
		  for (i = 0;a.charAt(i) != '\0';i++)
		  {
								 if (a.charAt(i) == b.charAt(0))
								 {
											   temp = 0;
											   for (j = 0;j < l;j++)
											   {
															   if (b.charAt(j) != a.charAt(j + i))
															   {
																   break;
															   }
											   }
											   if (j == l)
											   {
													   for (j = 0;j < l;j++)
													   {
																	   a = tangible.StringFunctions.changeCharacter(a, j + i, c.charAt(j));
													   }
													   break;
											   }
								 }
		  }
		  System.out.printf("%s",a);

	}

}

