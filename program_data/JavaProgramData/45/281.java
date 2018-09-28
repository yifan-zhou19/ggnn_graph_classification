package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[50]);
		String b = new String(new char[50]);
		int i;
		int j;
		int k = 0;
		int l;
		int x;
		int y;
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
		x = a.length();
		y = b.length();
		for (i = 0;i <= (y - x);i++)
		{
			if (b[i] = a.charAt(0) != null)
			{
				l = 1;
				k = i;
				for (j = i + 1;l < x;j++,l++)
				{
					if (a.charAt(l) != b.charAt(j))
					{
						k = 0;
						break;
					}
				}
				if (l == x)
				{
					System.out.printf("%d",k);
					break;
				}
			}
		}
	}
}

