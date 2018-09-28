package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String a = new String(new char[50]);
	String b = new String(new char[50]);
	String c = new String(new char[50]);
	int i;
	int j;
	int m;
	int s;
	int t = 0;
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
	int l = a.length();
	for (i = 0;b.charAt(i) != '\0';i++)
	{
		if (b.charAt(i) == a.charAt(0))
		{
			c = tangible.StringFunctions.changeCharacter(c, 0, a.charAt(0));
				m = i + 1;
			for (j = 1;j < l;j++)
			{
				 c = tangible.StringFunctions.changeCharacter(c, j, b.charAt(m));
				 m++;
			}
			c = tangible.StringFunctions.changeCharacter(c, j, '\0');

		}
			s = strcmp(a,c);
			if (s == 0)
			{
				t++;
			}
			if (t == 1)
			{
				System.out.printf("%d",i);
			}

	}
	return 0;
	}


}

