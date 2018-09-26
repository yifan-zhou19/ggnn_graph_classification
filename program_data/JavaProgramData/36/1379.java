package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[20]);
		String b = new String(new char[20]);
		int i;
		int j;
		int k;
		int m;
		int n;
		m = 0;
		n = 0;
		for (i = 0;i < 20;i++)
		{
			String tempVar = ConsoleInput.scanfRead(null, 1);
			if (tempVar != null)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, tempVar);
			}
			if (a.charAt(i) == ' ')
			{
				break;
			}
		}
	   for (j = 0;j < 20;j++)
	   {
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				b = tangible.StringFunctions.changeCharacter(b, j, tempVar2);
			}
			if (b.charAt(j) == '\n')
			{
				break;
			}
	   }
	for (k = 0;k < i;k++)
	{
		m = m + a.charAt(k);
	}
	for (k = 0;k < j;k++)
	{
		n = n + b.charAt(k);
	}
	if (m == n)
	{
	System.out.print("YES");
	}
	else
	{
	System.out.print("NO");
	}
	  return 0;
	}


}

