package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String z1 = new String(new char[51]);
		String z2 = new String(new char[51]);
		String z3 = new String(new char[51]);
		int i;
		int result;
		int n1;
		int n2;
		int k;
		int p;
		final String z4 = " ";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			z1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			z2 = tempVar2.charAt(0);
		}
		n1 = z1.length();
		n2 = z2.length();
		p = 0;
		for (i = 0;i <= n2 - n1;i++)
		{

			for (k = 0;k < n1;k++)
			{
				z3 = tangible.StringFunctions.changeCharacter(z3, k, z2.charAt(i + k));
			}
			 z3 = tangible.StringFunctions.changeCharacter(z3, k, '\0');
			result = strcmp(z3,z1);

			if ((result == 0) && (p == 0))
			{
				System.out.printf("%d",i);
				p = 1;
				result = 1;
			}
			else if (p == 0)
			{
				   continue;
			}
			else
			{
				break;
			}

		}
		return 0;
	}
}

