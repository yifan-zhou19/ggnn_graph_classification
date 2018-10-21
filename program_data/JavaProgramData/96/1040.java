package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String a = new String(new char[100]);
		  String b = new String(new char[100]);
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = tempVar.charAt(0);
		  }
		  int t = a.charAt(0) - 48;
		  int i;
		  int j;
		  j = 0;
		  for (int k = 0;k < 100;k++)
		  {
		  b = tangible.StringFunctions.changeCharacter(b, k, '\0');
		  }
		 for (i = 1;a.charAt(i) != '\0';i++)
		 {
				 t = t * 10 + (a.charAt(i) - 48);
				 if (t / 13 >= 0)
				 {
					 b = tangible.StringFunctions.changeCharacter(b, j, (t / 13 + 48));
				 j++;
				 }
				 t = t % 13;

		 }
				if (a.charAt(1) != '\0')
				{
							   if (b.charAt(0) == '0' && b.charAt(1) != '\0')
							   {
								for (int k = 1;b.charAt(k - 1) != '\0';k++)
								{
								b = tangible.StringFunctions.changeCharacter(b, k - 1, b.charAt(k));
								}
							   }
							  System.out.printf("%s\n",b);
							   System.out.printf("%d",t);
				}
				  else
				  {
					  System.out.print("0\n");
				  System.out.printf("%c",a.charAt(0));
				  }

	}

}

