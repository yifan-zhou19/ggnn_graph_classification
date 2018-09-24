package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int c;
		int A;
		int B;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
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
		A = a.length();
		B = b.length();
		if (A != B)
		{
			System.out.print("NO");
		}
		else
		{
			for (i = 0;i < A;i++)
			{
				for (j = 0;j < A;j++)
				{
					if (a.charAt(i) == b.charAt(j))
					{
						b = tangible.StringFunctions.changeCharacter(b, j, '0');
						break;
					}
				}
			}
			c = 0;
			for (i = 0;i < A;i++)
			{
				if (b.charAt(i) != '0')
				{
					c = 1;
					break;
				}
				else
				{
					c = 0;
				}
			}
			if (c == 1)
			{
				System.out.print("NO");
			}
			else
			{
				System.out.print("YES");
			}
		}
		return 0;
	}
}

