package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char mid;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int i;
		int j;
		int stop;
		int length;
		int dif;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		length = a.length();
		for (i = 1;i <= length;i++)
		{
			for (j = 0;j < length - i;j++)
			{
				if (a.charAt(j + 1) < a.charAt(j))
				{
					mid = a.charAt(j);
					a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j + 1));
					a = tangible.StringFunctions.changeCharacter(a, j + 1, mid);
				}
				if (b.charAt(j + 1) < b.charAt(j))
				{
					mid = b.charAt(j);
					b = tangible.StringFunctions.changeCharacter(b, j, b.charAt(j + 1));
					b = tangible.StringFunctions.changeCharacter(b, j + 1, mid);
				}
			}
		}
		dif = strcmp(a,b);
		if (dif == 0)
		{
			System.out.print("YES");
		}
		else
		{
			System.out.print("NO");
		}
	//	printf("%s\n%s",a,b);
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			stop = Integer.parseInt(tempVar3);
		}
		return 0;
	}
}

