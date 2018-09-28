package <missing>;

public class GlobalMembers
{
	public static int Main()



	{
		  int x;
		  int y;
		  int i;
		  int j;
		  int n;
		  String test1 = new String(new char[100]);
		  String test2 = new String(new char[100]);
		  String a = new String(new char[100]);
		  String b = new String(new char[100]);
		  String c = new String(new char[100]);

		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }

		  for (j = 0;j < n;j++)

		  {
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				test1 = tempVar2.charAt(0);
			}
		  x = test1.length();
		  for (i = 0;i < x;i++)
		  {
		  a = tangible.StringFunctions.changeCharacter(a, i, test1.charAt(x - i - 1));
		  }
		  for (i = x;i < 100;i++)
		  {
		  a = tangible.StringFunctions.changeCharacter(a, i, '0');
		  }

		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  test2 = tempVar3.charAt(0);
		  }
		  y = test2.length();
		  for (i = 0;i < y;i++)
		  {
		  b = tangible.StringFunctions.changeCharacter(b, i, test2.charAt(y - i - 1));
		  }
		  for (i = y;i < 100;i++)
		  {
		  b = tangible.StringFunctions.changeCharacter(b, i, '0');
		  }

		  for (i = 0;i < x;i++)
		  {
			  if (a.charAt(i) >= b.charAt(i))
			  {
			  c = tangible.StringFunctions.changeCharacter(c, i, a.charAt(i) - b.charAt(i) + '0');
			  }
			  else
			  {
				  c = tangible.StringFunctions.changeCharacter(c, i, a.charAt(i) - b.charAt(i) + 10 + '0');
				  a = tangible.StringFunctions.changeCharacter(a, i + 1, a.charAt(i + 1) - 1);
			  }
		  }


		  for (i = x - 1;i >= 0;i--)
		  {
		  System.out.printf("%c",c.charAt(i));
		  }
		  System.out.print("\n");
		  }
	}

}

