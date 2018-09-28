package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
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
			for (j = a.length() - 1;j >= a.length() - b.length();j--)
			{
				if (a.charAt(j) >= b.charAt(j - a.length() + b.length()))
				{
					a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j) - b.charAt(j - a.length() + b.length()) + 48);
				}
				else
				{
					a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j) - b.charAt(j - a.length() + b.length()) + 58);
					a.charAt(j - 1)--;
				}
			}
				j = 0;
				while (a.charAt(j) == '0')
				{
					j++;
				}
				for (;j <= a.length() - 1;j++)
				{
					System.out.printf("%c",a.charAt(j));
				}
				System.out.print("\n");
		}
	}
}

