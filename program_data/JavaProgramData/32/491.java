package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int x;
		int y;
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
		String tempVar3 = ConsoleInput.scanfRead("\n");
		if (tempVar3 != null)
		{
			b = tempVar3.charAt(0);
		}
		x = a.length();
		y = b.length();
		for (j = y;j > 0;j--)
		{
		  if (a.charAt(j + x - y - 1) > b.charAt(j - 1))
		  {
		   a = tangible.StringFunctions.changeCharacter(a, j + x - y - 1, a.charAt(j + x - y - 1) - b.charAt(j - 1) + 48);
		   continue;
		  }
		  if (a.charAt(j + x - y - 1) < b.charAt(j - 1))
		  {
		   a = tangible.StringFunctions.changeCharacter(a, j + x - y - 1, a.charAt(j + x - y - 1) - b.charAt(j - 1) + 58);
		   a.charAt(j + x - y - 2)--;
		   continue;
		  }
		  if (a.charAt(j + x - y - 1) == b.charAt(j - 1))
		  {
		   a = tangible.StringFunctions.changeCharacter(a, j + x - y - 1, 48);
		  }
		}
		if (a.charAt(0) > 48)
		{
		System.out.printf("%s\n",a);
		}
		else
		{
		 for (i = 1;i < x;i++)
		 {
		  System.out.printf("%c",a.charAt(i));
		 }
		 System.out.print("\n");
		}
		}
		 return 0;
	}
}

