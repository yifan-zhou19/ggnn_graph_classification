package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int t;
		int sum = 0;
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
		if (a.length() == b.length())
		{
			for (i = 0;i < a.length() && a.charAt(i) != '\0';i++)
			{
				t = 0;
				for (j = 0;j < b.length() && b.charAt(j) != '\0';j++)
				{
					if (b.charAt(j) == a.charAt(i))
					{
						b = tangible.StringFunctions.changeCharacter(b, j, '0');
						t = 1;
						sum++;
						break;
					}
				}
				if (t == 0)
				{
					System.out.print("NO");
					break;
				}
			}
			if (sum == a.length())
			{
				System.out.print("YES");
			}
		}
		else
		{
			System.out.print("NO");
		}
		return 0;
	}
}

