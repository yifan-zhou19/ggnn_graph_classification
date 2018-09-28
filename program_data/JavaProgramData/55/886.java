package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int l;
		int j;
		int m;
		int k;
		int s = 0;
		String n = new String(new char[40]);
		String x = new String(new char[40]);
		String y = new String(new char[40]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}

		l = n.length();
		for (int i = 0;i < l;i++)
		{
				if (n.charAt(i) >= 'a' && n.charAt(i) <= 'z')
				{
				   n = tangible.StringFunctions.changeCharacter(n, i, n.charAt(i) - 'a' + 10);
				}
				else if (n.charAt(i) >= 'A' && n.charAt(i) <= 'Z')
				{
						n = tangible.StringFunctions.changeCharacter(n, i, n.charAt(i) - 'A' + 10);
				}
					 else
					 {
						 n = tangible.StringFunctions.changeCharacter(n, i, n.charAt(i) - '0');
					 }
					 s = n.charAt(i) + s * a;
		}
		if (s == 0)
		{
			System.out.print("0");
		}
		else
		{
		for (j = 0;s != 0;j++)
		{
				x = tangible.StringFunctions.changeCharacter(x, j, s % b);
				s = (int)s / b;
		}
	  for (k = 0;k < j;k++)
	  {
			   y = tangible.StringFunctions.changeCharacter(y, k, x.charAt(j - 1 - k));
	  }
		for (int i = 0;i < j;i++)
		{
		if (y.charAt(i) > 9)
		{
			y = tangible.StringFunctions.changeCharacter(y, i, y.charAt(i) - 10 + 'A');
		}
				else
				{
					y = tangible.StringFunctions.changeCharacter(y, i, y.charAt(i) + '0');
				}
		}

	  y = tangible.StringFunctions.changeCharacter(y, j, '\0');

		System.out.printf("%s",y);
		}
		System.in.read();
		System.in.read();

	}
}

