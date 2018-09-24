package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		int n;
		int i;
		int j;
		int c1;
		int c2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
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
		  c1 = a.length();
		  c2 = b.length();
		  for (j = c1 - 1;j >= c1 - c2;j--)
		  {
			  if (a.charAt(j) < b.charAt(j - c1 + c2))
			  {
			  a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j) + 10 - b.charAt(j - c1 + c2) + 48);
			  a.charAt(j - 1)--;
			  }
			else
			{
				a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j) - b.charAt(j - c1 + c2) + 48);
			}
		  }
		  System.out.printf("%s\n",a);
		}
	}


}

