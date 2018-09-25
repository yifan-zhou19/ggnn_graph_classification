package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[256]);
		String b = new String(new char[256]);
		String c = new String(new char[256]);
		int i;
		int j;
		int k;
		int l;
		int m;
		int n;
		int sum = 0;
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
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = tempVar3.charAt(0);
		}
		m = a.length();
		n = b.length();
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (b.charAt(j) == a.charAt(i + j))
				{
					sum += 1;
				}
			}
			if (sum == n)
			{
				break;
			}
			else
			{
				sum = 0;
			}
		}
		if (sum == n)
		{
		for (k = i;k < n + i;k++)
		{
			a = tangible.StringFunctions.changeCharacter(a, k, c.charAt(k - i));
		}
		}
		for (l = 0;l < m;l++)
		{
			System.out.printf("%c",a.charAt(l));
		}
		System.out.print("\n");


	}


}

