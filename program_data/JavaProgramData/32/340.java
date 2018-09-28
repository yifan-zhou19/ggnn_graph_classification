package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int n;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
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
				a = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = tempVar3.charAt(0);
			}
		for (j = a.length() - 1,k = b.length() - 1;k >= 0;j--,k--)
		{
			a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j) - b.charAt(k) + '0');
			if (a.charAt(j) < '0')
			{
			  a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j) + 10);
			  a = tangible.StringFunctions.changeCharacter(a, j - 1, a.charAt(j - 1) - 1);
			}
		}
		k = a.length();
	   for (j = 0;a.charAt(j) == '0';j++)
	   {
		   ;
	   }
		for (;j < k;j++)
		{
			System.out.printf("%c",a.charAt(j));
		}
		System.out.print("\n");
		}
	}

}

