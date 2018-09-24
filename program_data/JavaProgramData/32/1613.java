package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		final String a = "\0";
		final String b = "\0";
		char c;
		int i;
		int j;
		int k;
		int m;
		int n;
		int s;
		int t = 0;
		int length;
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
			k = a.length();
			m = b.length();
			length = k - m;
			for (j = k - 1;j >= length;j--)
			{
				if (t != 0)
				{
					a.charAt(j)--;
				}
				if (a.charAt(j) >= b.charAt(j - length))
				{
					a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j) - b.charAt(j - length) + 48);
					t = 0;
				}
				else
				{
					a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j) + 10 - b.charAt(j - length) + 48);
					t = 1;
				}
			}
			for (j = length - 1;j >= 0;j--)
			{
				if (t != 0)
				{
					a.charAt(j)--;
				}
				if (a.charAt(j) < 48)
				{
					a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j) + 10);
					t = 1;
				}
				else
				{
					t = 0;
				}
			}
			for (j = 0;j < k;j++)
			{
				if (a.charAt(j) != 48)
				{
					s = j;
					break;
				}
			}
			if (s > 200)
			{
				System.out.print("0\n");
			}
			else
			{
				for (j = s;j < k;j++)
				{
					System.out.printf("%c",a.charAt(j));
				}
				System.out.print("\n");
			}
		}
	}
}

