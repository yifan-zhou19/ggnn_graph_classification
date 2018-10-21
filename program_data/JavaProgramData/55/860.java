package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String c = new String(new char[40]);
		  int a;
		  int b;
		  int x;
		  int i;
		  int l;
		  int k;
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
		  l = c.length();
		  if (c.charAt(0) == '0')
		  {
			System.out.print("0\n");
		  }
		  else
		  {
						  for (i = 0;i < l;i++)
						  {
							  if (c.charAt(i) >= 'A' && c.charAt(i) <= 'Z')
							  {
								  c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) - 'A'+'a');
							  }
						  }
						  x = 0;
						  int d;
						  for (i = 0;i < l;i++)
						  {
								if (c.charAt(i) >= 'a')
								{
								   d = c.charAt(i) - 'a' + 10;
								}
								else
								{
								   d = c.charAt(i) - '0';
								}
								 x = d + x * a;
						  }
						  String e = new String(new char[40]);
						  for (k = 0;x != 0;k++)
						  {
										   e = tangible.StringFunctions.changeCharacter(e, k, x % b);
										   x = x / b;
						  }
							  e = tangible.StringFunctions.changeCharacter(e, k, '\0');
							 String f = new String(new char[40]);
							 for (i = 0;i < k;i++)
							 {
									  if (e.charAt(i) < 10)
									  {
									  f = tangible.StringFunctions.changeCharacter(f, k - 1 - i, e.charAt(i) + '0');
									  }
									  else
									  {
									  f = tangible.StringFunctions.changeCharacter(f, k - 1 - i, e.charAt(i) + 'A' - 10);
									  }
							 }
							 f = tangible.StringFunctions.changeCharacter(f, k, '\0');
							 System.out.printf("%s",f);
		  }

	}

}

