package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n;
		int m;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
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
		n = a.length();
			 m = b.length();
			 if (m == n)
			 {
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a.charAt(i) == b.charAt(j))
				{
					break;
				}
			}
			if (j == n)
			{
				break;
			}
			else
			{
				b = tangible.StringFunctions.changeCharacter(b, j, '&');
			}
		}
		if (i < n)
		{
			System.out.printf("%s\n","NO");
		}
		else
		{
			System.out.printf("%s\n","YES");
		}
			 }
			 else
			 {
				 System.out.printf("%s\n","NO");
			 }
	}

}

