package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String n = new String(new char[40]);
		String y = new String(new char[40]);
		String z = new String(new char[40]);
		int a;
		int b;
		int c = 0;
		int l;
		int i;
		int k;
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
		for (i = 0;i < l;i++)
		{
		 if (n.charAt(i) >= '0' && n.charAt(i) <= '9')
		 {
			n = tangible.StringFunctions.changeCharacter(n, i, n.charAt(i) - '0');
		 }
		 if (n.charAt(i) >= 'a' && n.charAt(i) <= 'z')
		 {
			n = tangible.StringFunctions.changeCharacter(n, i, n.charAt(i) - 'a' + 10);
		 }
		 if (n.charAt(i) >= 'A' && n.charAt(i) <= 'Z')
		 {
			n = tangible.StringFunctions.changeCharacter(n, i, n.charAt(i) - 'A' + 10);
		 }
		}

		for (i = 0;i < l;i++)
		{
			c = n.charAt(i) + a * c;
		}
		for (k = 0;c != 0;k++)
		{
		 y = tangible.StringFunctions.changeCharacter(y, k, c % b);
		 c = c / b;
		}
		if (k == 0)
		{
		System.out.print("0\n");
		}
		else
		{
		 for (i = 0;i < k;i++)
		 {
		 z = tangible.StringFunctions.changeCharacter(z, i, y.charAt(k - i - 1));
		 }
		 for (i = 0;i < k;i++)
		 {
		 if (z.charAt(i) >= 0 && z.charAt(i) <= 9)
		 {
			z = tangible.StringFunctions.changeCharacter(z, i, z.charAt(i) + '0');
		 }
		 if (z.charAt(i) > 9 && z.charAt(i) <= 36)
		 {
			z = tangible.StringFunctions.changeCharacter(z, i, z.charAt(i) - 10 + 'A');
		 }
		 }
		z = z.substring(0, k);

		System.out.printf("%s\n",z);
		}
	}
}

