package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			 String p = new String(new char[50]);
			 int n;
			 int i = 1;
			 int l;

			 String tempVar = ConsoleInput.scanfRead();
			 if (tempVar != null)
			 {
				 n = Integer.parseInt(tempVar);
			 }
			 while (i < n + 1)
			 {


									   String tempVar2 = ConsoleInput.scanfRead();
									   if (tempVar2 != null)
									   {
										   p = tempVar2.charAt(0);
									   }

									   l = p.length() - 1;

									   if (p.charAt(l) == 'y')
									   {
									   p = tangible.StringFunctions.changeCharacter(p, l, p[l - 1] = '\0');
									   }

									   if (p.charAt(l) == 'r')
									   {
									   p = tangible.StringFunctions.changeCharacter(p, l, p[l - 1] = '\0');
									   }

									   if (p.charAt(l) == 'g')
									   {
									   p = tangible.StringFunctions.changeCharacter(p, l, p[l - 1] = p[l - 2] = '\0');
									   }

							  System.out.printf("%s\n",p);
							  i++;
			 }
			 return 0;
	}

}

