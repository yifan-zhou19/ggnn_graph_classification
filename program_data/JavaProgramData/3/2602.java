package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[1000];
	public static int Main()
	{
		int i;
		int n;
		int h;
		int j;
		int k;
		int l;
		String m = new String(new char[3]);
		m = tangible.StringFunctions.changeCharacter(m, 0, 'a');
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(a[i]) = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			   for (j = 0;j < n;j++)
			   {
				   if (k == a[i] + a[j])
				   {
					   m = tangible.StringFunctions.changeCharacter(m, 0, 'y');
					   m = tangible.StringFunctions.changeCharacter(m, 1, 'e');
					   m = tangible.StringFunctions.changeCharacter(m, 2, 's');
					   for (l = 0;l < 3;l++)
					   {
						   System.out.printf("%c",m.charAt(l));
					   }
					   break;
				   }
			   }
			   if (m.charAt(0) == 'y')
			   {
				   break;
			   }
		}
		if (m.charAt(0) != 'y')
		{
			m = tangible.StringFunctions.changeCharacter(m, 0, 'n');
			m = tangible.StringFunctions.changeCharacter(m, 1, 'o');
			for (l = 0;l < 2;l++)
			{
				System.out.printf("%c",m.charAt(l));
			}
		}
		return 0;
	}

}

