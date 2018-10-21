package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int i;
		int j = 0;
		int k;
		int x;
		int s;
		for (i = 0;i < 100;i++)
		{
			  a = a.substring(0, i);
			  b = tangible.StringFunctions.changeCharacter(b, i, '0');
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		for (i = 0;a.charAt(i) != 0;i++)
		{
		  x = i + 1;
		}
		for (i = x;i < 100;i++)
		{
		  a = tangible.StringFunctions.changeCharacter(a, i, '0');
		}
		while (j < x - 1)
		{
			  s = 0;
		   while (a.charAt(j) > '0')
		   {
				if (a.charAt(j + 1) - 3 >= '0')
				{
				  a = tangible.StringFunctions.changeCharacter(a, j + 1, a.charAt(j + 1) - 3);
				  a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j) - 1);
				  s++;
				}
			 else if (a.charAt(j) >= '2')
			 {
				  a = tangible.StringFunctions.changeCharacter(a, j + 1, a.charAt(j + 1) - 3 + 10);
				  a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j) - 2);
				  s++;
			 }
			 else
			 {
				   a = tangible.StringFunctions.changeCharacter(a, j, '0');
				   a = tangible.StringFunctions.changeCharacter(a, j + 1, a.charAt(j + 1) + 10);
			 }
		   }
		   b = tangible.StringFunctions.changeCharacter(b, j, s + '0');
		   j = j + 1;
		}
		if (b.charAt(0) == '0' && b.charAt(1) == '0')
		{
		  System.out.print("0");
		}
		else if (b.charAt(0) != '0')
		{
		  System.out.printf("%c",b.charAt(0));
		}
		for (i = 1;i < x - 1;i++)
		{
		  System.out.printf("%c",b.charAt(i));
		}
		System.out.print("\n");
		System.out.printf("%d",a.charAt(x - 1) - '0');
	}

}

