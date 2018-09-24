package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 0;i < n;i++)
		{
			char[] a = {'0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
			char[] b = {'0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead("\n");
			if (tempVar3 != null)
			{
				b = tempVar3.charAt(0);
			}
			int lena;
			int lenb;
			lena = a.length();
			lenb = b.length();
			int[] na = new int[101];
			int[] nb = new int[101];
			int[] nc = new int[101];
			int curr;
			for (curr = 0;curr < lena;curr++)
			{
				na[curr] = a[lena - 1 - curr] - '0';
			}
			for (curr = 0;curr < lenb;curr++)
			{
				nb[curr] = b[lenb - 1 - curr] - '0';
			}
			int r = 0;
			for (curr = 0;curr < lena;curr++)
			{
				if (na[curr] - r >= nb[curr])
				{
					nc[curr] = na[curr] - r - nb[curr];
					r = 0;
				}
				else
				{
					nc[curr] = na[curr] - r + 10 - nb[curr];
					r = 1;
				}
			}
			System.out.print("\n");
			if (nc[lena - 1] != 0)
			{
				System.out.printf("%d",nc[lena - 1]);
			}
			for (curr = lena - 2;curr >= 0;curr--)
			{
				System.out.printf("%d",nc[curr]);
			}
		}
		return 0;
	}

}

