package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int result;
		int m;
		int k;
		String zfc = new String(new char[50]);
		String bz = new String(new char[50]);
		String z = new String(new char[50]);
		final String sz = "ing";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zfc = tempVar2.charAt(0);
			}
			m = zfc.length();
			int p = 0;
			int q = 0;
			for (k = m - 3;k < m;k++)
			{
			   bz = tangible.StringFunctions.changeCharacter(bz, p, zfc.charAt(k));
			   p++;
			}
			bz = tangible.StringFunctions.changeCharacter(bz, p, '\0');
			result = strcmp(bz,sz);
			if (result == 0)
			{
			   for (j = 0;j < m - 3;j++)
			   {
				   z = tangible.StringFunctions.changeCharacter(z, q, zfc.charAt(j));
				   q++;
			   }
			   z = tangible.StringFunctions.changeCharacter(z, q, '\0');
			   System.out.printf("%s\n",z);
			}
			else
			{
			   for (j = 0;j < m - 2;j++)
			   {
				   z = tangible.StringFunctions.changeCharacter(z, q, zfc.charAt(j));
				   q++;
			   }
			   z = tangible.StringFunctions.changeCharacter(z, q, '\0');
			   System.out.printf("%s\n",z);
			}
		}
		return 0;
	}
}

