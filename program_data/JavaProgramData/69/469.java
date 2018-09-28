package <missing>;

public class GlobalMembers
{
	public static int[] c = new int[252];
	public static int Main()
	{
		  int x;
		  int y;
		  int i;
		  int z;
		  int m;
		  int k;
		  String a = new String(new char[251]);
		  String b = new String(new char[251]);
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
		  x = a.length();
		  y = b.length();
		  if (x < y)
		  {
				 for (i = x - 1;i > -1;i--)
				 {
				 a = tangible.StringFunctions.changeCharacter(a, i + y - x, a.charAt(i));
				 }
				 for (i = 0;i < y - x;i++)
				 {
				 a = tangible.StringFunctions.changeCharacter(a, i, '0');
				 }
				 z = y;
				 k = x;
		  }
		   else if (x > y)
		   {
				 for (i = y - 1;i > -1;i--)
				 {
				 b = tangible.StringFunctions.changeCharacter(b, i + x - y, b.charAt(i));
				 }
				 for (i = 0;i < x - y;i++)
				 {
				 b = tangible.StringFunctions.changeCharacter(b, i, '0');
				 }
				 z = x;
				 k = y;
		   }
			 else
			 {
				 z = x;
				 k = x;
			 }
		  for (i = z - 1;i >= 0;i--)
		  {
						   m = c[z - 1 - i] + a.charAt(i) + b.charAt(i) - '0'-'0';
						   if (m < 10)
						   {
								   c[z - 1 - i] = m;
						   }
						   else
						   {
							   m = m % 10;
							   c[z - 1 - i] = m;
							   c[z - i]++;
							   if (i == 0)
							   {
							   z++;
							   }
						   }
		  }

		  for (i = z - 1;i >= 0;i--)
		  {
					   if (c[i] == 0)
					   {
					   z--;
					   }
					   else
					   {
					   break;
					   }
		  }
		   if (z == 0)
		   {
		   System.out.print("0");
		   }
		   else
		   {
		  for (i = z - 1;i >= 0;i--)
		  {
		  System.out.printf("%d",c[i]);
		  }
		   }

	}





}

