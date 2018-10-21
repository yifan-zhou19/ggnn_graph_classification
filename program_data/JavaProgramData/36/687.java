package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int i;
		int n1;
		int n2;
		int j;
		int s;
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
		n1 = a.length();
		n2 = b.length();
		if (n1 == n2)
		{
			for (i = 0;i < n1;i++)
			{
				for (j = 0;j < n1;j++)
				{
			if (a.charAt(i) == b.charAt(j))
			{
			b = tangible.StringFunctions.changeCharacter(b, j, '\0');
			break;
			}
				}
			}
			for (i = 0;i < n1;i++)
			{
				if (b.charAt(i) != '\0')
				{
				System.out.print("NO");
				break;
				}
			}
			if (i == n1)
			{
				System.out.print("YES");
			}
		}
		else
		{
			System.out.print("NO");
		}
	}
}

