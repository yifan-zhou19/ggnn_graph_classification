package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int a;
		  int b;
		  int i;
		  int c;
		  int d;
		  int[] x = new int[2000];
		  int s = 0;
		  int e;
		  int l;
		  int k;
		  String s1 = new String(new char[1000]);
		  String s2 = new String(new char[1000]);
		  String y = new String(new char[2000]);
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead(" ");
		  if (tempVar2 != null)
		  {
			  s1 = tempVar2.charAt(0);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  b = Integer.parseInt(tempVar3);
		  }
		  for (i = 0;;i++)
		  {
					   if (s1.charAt(i) == '\0')
					   {
									  s2 = tangible.StringFunctions.changeCharacter(s2, i, '\0');
									  break;
					   }
					   if (s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z')
					   {
									  s1 = tangible.StringFunctions.changeCharacter(s1, i, s1.charAt(i) - 'a'+'A');
					   }
					   s2 = tangible.StringFunctions.changeCharacter(s2, i, s1.charAt(i));
		  }
		  for (c = 0;c <= i - 1;c++)
		  {
					   if (s2.charAt(c) >= 'A' && s2.charAt(c) <= 'Z')
					   {
					   x[c] = s2.charAt(c) - 55;
					   }
					   else
					   {
					   x[c] = s2.charAt(c) - 48;
					   }
		  }
		  for (d = i - 1;d >= 0;d--)
		  {
						   e = i - 1 - d;
						   if (e != 0)
						   {
							   do
							   {
										 x[d] = x[d] * a;
										 e--;
							   } while (e > 0)
							   ;
						   }
						   if (e == 0)
						   {
						   x[d] = x[d];
						   }
						   s = s + x[d];
		  }
		  if (s != 0)
		  {
		  for (l = 0;s != 0;l++)
		  {
						   if (s % b <= 9)
						   {
					y = tangible.StringFunctions.changeCharacter(y, l, s % b + '0');
						   }
					else
					{
					y = tangible.StringFunctions.changeCharacter(y, l, s % b + '7');
					}
					  s = s / b;
		  }
		  for (k = l - 1;k >= 0;k--)
		  {
		  System.out.printf("%c",y.charAt(k));
		  }
		  }
		  else
		  {
		  System.out.print("0");
		  }
	}
}

