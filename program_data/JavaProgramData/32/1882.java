package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int la;
		int lb;
		int i;
		int j;
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
			lb = b.length();
			la = a.length();
			for (j = lb - 1;j > 0;j--)
			{
				if (a.charAt(la - lb + j) >= b.charAt(j))
				{
					a = tangible.StringFunctions.changeCharacter(a, la - lb + j, a.charAt(la - lb + j) - b.charAt(j));
				}
				else
				{
					a = tangible.StringFunctions.changeCharacter(a, la - lb + j - 1, a.charAt(la - lb + j - 1) - 1);
					a = tangible.StringFunctions.changeCharacter(a, la - lb + j, a.charAt(la - lb + j) + 10 - b.charAt(j));
				}
			}
			if (a.charAt(la - lb) < b.charAt(0))
			{
				a.charAt(la - lb - 1) -= 1;
				a = tangible.StringFunctions.changeCharacter(a, la - lb, a.charAt(la - lb) + 10 - b.charAt(0));
			}
			else
			{
				a = tangible.StringFunctions.changeCharacter(a, la - lb, a.charAt(la - lb) - b.charAt(0));
			}
			for (j = 0;j < la - lb;j++)
			{
				a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j) - 48);
			}
			for (j = 0;j < la;j++)
			{
				System.out.printf("%d",a.charAt(j));
			}
			System.out.print("\n");
		}
		return 0;
	}
}

