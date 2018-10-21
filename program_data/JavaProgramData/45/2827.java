package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[50]);
		String b = new String(new char[50]);
		int i;
		int j = 0;
		int la;
		int lb;
		int p;
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
		la = a.length();
		lb = b.length();
		for (i = 0;i < lb;i++)
		{
			if (a.charAt(j) == b.charAt(i))
			{
				if (j == la - 1)
				{
					break;
				}
				j++;
			}
			else
			{
				j = 0;
			}
		}
		p = i - la + 1;
		System.out.printf("%d", p);
	}
}

