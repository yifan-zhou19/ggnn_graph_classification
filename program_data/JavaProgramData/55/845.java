package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int i;
		 int j;
		 int x;
		 int y = 0;
		 int z;
		 int a;
		 int b;
		 int q;
		 String c = new String(new char[40]);
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 a = Integer.parseInt(tempVar);
		 }
		 String tempVar2 = ConsoleInput.scanfRead(" ");
		 if (tempVar2 != null)
		 {
			 c = tempVar2.charAt(0);
		 }
		 String tempVar3 = ConsoleInput.scanfRead(" ");
		 if (tempVar3 != null)
		 {
			 b = Integer.parseInt(tempVar3);
		 }
		 i = c.length();
		 if (c.charAt(0) == '0')
		 {
		 System.out.print("0\n");
		 }
		 else
		 {
			  for (j = 0;j < i;j++)
			  {
						 if (c.charAt(j) >= 'A' && c.charAt(j) <= 'Z')
						 {
							 x = c.charAt(j) - 'A' + 10;
						 }
						 else
						 {
						   if (c.charAt(j) >= 'a' && c.charAt(j) <= 'z')
						   {
							  x = c.charAt(j) - 'a' + 10;
						   }
						   else
						   {
							  x = c.charAt(j) - '0';
						   }
						 }
							   y = y * a + x;
			  }

			  String k = new String(new char[40]);
			  for (i = 0,q = y;q != 0;i++)
			  {
				  k = tangible.StringFunctions.changeCharacter(k, i, q % b);
				  q = q / b;
			  }
				 k = tangible.StringFunctions.changeCharacter(k, i, '0');
				 String h = new String(new char[i]);
				 for (j = 0;j < i;j++)
				 {
						if (k.charAt(j) > 9)
						{
							 h = tangible.StringFunctions.changeCharacter(h, i - j - 1, k.charAt(j) + 'A' - 10);
						}
						else
						{
							 h = tangible.StringFunctions.changeCharacter(h, i - j - 1, k.charAt(j) + '0');
						}
				 }
				  for (j = 0;j < i;j++)
				  {
				  System.out.printf("%c",h.charAt(j));
				  }

		 }
		System.in.read();
		System.in.read();
	}


}

