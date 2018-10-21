package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[300]);
		String b = new String(new char[300]);
		String c = new String(new char[300]);
		int i;
		int j;
		int k;
		int n1;
		int n2;
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
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			c = tempVar3.charAt(0);
		}
		n1 = a.length();
		n2 = b.length();
		for (i = 0;i <= n1 - n2;i++)
		{
			for (j = 0;j < n2;j++)
			{
				if (b.charAt(j) == a.charAt(i + j))
				{
					k++;
					if (k == n2)
					{
						break;
					}
				}
				else
				{
					k = 0;
					break;
				}
			}
				if (k == n2)
				{
					break;
				}
		}
		if (k == n2)
		{
			for (j = 0;j < n2;j++)
			{
				a = tangible.StringFunctions.changeCharacter(a, i + j, c.charAt(j));
			}
			System.out.printf("%s",a);
		}
	else
	{
		System.out.printf("%s",a);
	}
		return 0;
	}

}

