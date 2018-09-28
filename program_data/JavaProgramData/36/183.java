package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		char c;
		int i;
		int j;
		int z;
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
		for (j = a.length() - 1;j >= 1;j = j - 1)
		{
			for (i = 0;i <= j - 1;i = i + 1)
			{
				if (a.charAt(i) > a.charAt(i + 1))
				{
				  c = a.charAt(i);
				  a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i + 1));
				  a = tangible.StringFunctions.changeCharacter(a, i + 1, c);
				}
				if (b.charAt(i) > b.charAt(i + 1))
				{
				  c = b.charAt(i);
				  b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i + 1));
				  b = tangible.StringFunctions.changeCharacter(b, i + 1, c);
				}
			}
		}
		for (i = 0;i <= a.length() - 1;i = i + 1)
		{
			if (a.charAt(i) == b.charAt(i))
			{
				z = 1;
			}
			else
			{
				z = 0;
				break;
			}
		}
			  if (a.length() != b.length())
			  {
				  System.out.print("NO");
			  }
		else if (z == 1)
		{
			System.out.print("YES");
		}
			else
			{
				System.out.print("NO");
			}
	}

}

