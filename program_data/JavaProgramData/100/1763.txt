package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int i;
		int j;
		int k;
		int n;
		int m;
		a = 1;

		j = 0;
		String zfc = new String(new char[len]);
		String zm = new String(new char[len]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			zfc = tempVar.charAt(0);
		}
		n = zfc.length();
		for (i = 0;i < n;i++)
		{
			if ((zfc.charAt(i) >= 'A' && zfc.charAt(i) <= 'Z') || (zfc.charAt(i) >= 'a' && zfc.charAt(i) <= 'z'))
			{
				zm = tangible.StringFunctions.changeCharacter(zm, j, zfc.charAt(i));
				j++;

			}
		}
		zm = tangible.StringFunctions.changeCharacter(zm, j, '\0');
	if (j == 0)
	{
		  System.out.print("No");
	}
	else
	{
		char e;
		m = zm.length();
		for (k = 1;k <= m;k++)
		{
			for (j = 0;j < m - k;j++)
			{
				if (zm.charAt(j) > zm.charAt(j + 1))
				{
					e = zm.charAt(j + 1);
					zm = tangible.StringFunctions.changeCharacter(zm, j + 1, zm.charAt(j));
					zm = tangible.StringFunctions.changeCharacter(zm, j, e);
				}
			}
		}

		for (j = 0;j < m - 1;j++)
		{
			if (zm.charAt(j) == zm.charAt(j + 1))
			{
				a++;
			}
			else
			{
				System.out.printf("%c=%d\n",zm.charAt(j),a);
				a = 1;
			}
		}
			 System.out.printf("%c=%d",zm.charAt(m - 1),a);
	}
			return 0;
	}
}

