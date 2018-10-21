package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = tempVar.charAt(0);
	}
	  int i;
	  int j;
	   for (i = 0;a.charAt(i) != '\0';)
	   {
					  int kk = i;
						int ws;
						 for (ws = i;a.charAt(ws) != '\0';ws++)
						 {
							   if (a.charAt(ws) != a.charAt(ws + 1) && a.charAt(ws) != a.charAt(ws + 1) + 32 && a.charAt(ws) != a.charAt(ws + 1) - 32)
							   {
							   break;
							   }
						 }








						   if (kk < ws)
						   {
								  if (a.charAt(ws) >= 97)
								  {
							  a = tangible.StringFunctions.changeCharacter(a, ws, a.charAt(ws) - 32);
								  }

							  System.out.printf("(%c,%d)",a.charAt(ws),ws - kk + 1);
							  i = ws + 1;
						   }
						   else
						   {


								  if (a.charAt(ws) >= 97)
								  {
							  a = tangible.StringFunctions.changeCharacter(a, ws, a.charAt(ws) - 32);
								  }
							System.out.printf("(%c,1)",a.charAt(ws));
							   i++;
						   }

	   }

	System.in.read();
	System.in.read();
	}

}

