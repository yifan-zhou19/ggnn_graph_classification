package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int l;
		int j;
		char[][] a = new char[1100][256];
		String b = new String(new char[256]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= (n - 1);i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b = tempVar2.charAt(0);
			}
			l = b.length();
			for (j = 0;j <= (l - 1);j++)
			{
				 if (b.charAt(j) == 'A')
				 {
					b = tangible.StringFunctions.changeCharacter(b, j, 'T');
				 }
				 else if (b.charAt(j) == 'T')
				 {
					b = tangible.StringFunctions.changeCharacter(b, j, 'A');
				 }
				 else if (b.charAt(j) == 'G')
				 {
					 b = tangible.StringFunctions.changeCharacter(b, j, 'C');
				 }
				 else if (b.charAt(j) == 'C')
				 {
					b = tangible.StringFunctions.changeCharacter(b, j, 'G');
				 }
			}
			a[i] = b;
		}
		for (i = 0;i <= (n - 1);i++)
		{
			System.out.printf("%s\n",a[i]);
		}
	}
}

