package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[50]);
		String b = new String(new char[50]);
		int i;
		int j;
		int k;
		int l;
		int m = 0;
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
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			;
		}
		for (j = 0;b.charAt(j) != '\0';j++)
		{
			;
		}
		for (k = 0;k <= j - 1;k++)
		{
			if (a.charAt(0) == b.charAt(k))
			{
				for (l = 0;(l <= i - 1) && (k + l <= j - 1);l++)
				{
					if (a.charAt(l) != b.charAt(k + l))
					{
						break;
					}
				}
				if (l == i)
				{
					m = 1;
				}
			}
			if (m == 1)
			{
				break;
			}
		}
		if (k != j)
		{
			System.out.printf("%d\n",k);
		}

	}
}

