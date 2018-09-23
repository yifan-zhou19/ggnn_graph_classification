package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String c = new String(new char[100]);
		String d = new String(new char[200]);
		int l1;
		int l2;
		int l3;
		int i;
		int j;
		int k = 0;
		a = new Scanner(System.in).nextLine();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			b = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		l1 = a.length();
		l2 = b.length();
		l3 = c.length();
		for (i = 0;i < l1;i++)
		{
			if (a.charAt(i - 1) == ' ' || i == 0)
			{
				for (j = 0;j < l2;j++)
				{
				if (a.charAt(i + j) != b.charAt(j))
				{
					break;
				}
				}
				if (j == l2)
				{
					for (j = 0;j < l3;j++,k++)
					{
				d = tangible.StringFunctions.changeCharacter(d, k, c.charAt(j));
					}
				i = i + l2 - 1;
				}
				else
				{
					d = tangible.StringFunctions.changeCharacter(d, k, a.charAt(i));
					k++;
				}
			}
			else
			{
				d = tangible.StringFunctions.changeCharacter(d, k, a.charAt(i));
				k++;
			}
		}
		d = tangible.StringFunctions.changeCharacter(d, k, '\0');
		System.out.printf("%s",d);
	}
}

