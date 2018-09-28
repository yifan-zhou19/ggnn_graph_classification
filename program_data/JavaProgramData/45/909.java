package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int i;
		int p;
		int q;
		int m;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead("" "");
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		p = b.length();
		q = a.length();
		for (i = 0;i <= p - 1;i++)
		{
			if (b.charAt(i) == a.charAt(0))
			{
				for (j = i + 1,k = 1;k <= q - 1;j++,k++)
				{
					if (b.charAt(j) != a.charAt(k))
					{
						break;
					}
				}
			}
				if (k == q)
				{
					System.out.printf("%d",i);
					break;
				}
		}
	}
}

