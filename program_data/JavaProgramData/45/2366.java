package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String sho = new String(new char[51]);
		String lon = new String(new char[51]);
		String tem = new String(new char[51]);
		int a;
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			sho = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			lon = tempVar2.charAt(0);
		}

		a = sho.length();
		n = lon.length();

		for (i = 0; i < n; i++)
		{
			if (lon.charAt(i) == sho.charAt(0) && lon.charAt(i + a - 1) == sho.charAt(a - 1))
			{
															for (j = i; j < i + a; j++)
															{
																tem = tangible.StringFunctions.changeCharacter(tem, j - i, lon.charAt(j));
															}
																tem [a] = '\0';
															if (strcmp(tem,sho) == 0)
															{
																					  break;
															}
			}
		}

		System.out.printf("%d", i);

		return 0;
	}

}

