package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int i;
		int[] atag = new int[100];
		int[] btag = new int[100];
		int alen;
		int blen;
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
		alen = a.length();
		blen = b.length();
		for (i = 0;i < 100;i++)
		{
			atag[i] = 0;
			btag[i] = 0;
		}
		if (alen == blen)
		{
			for (i = 0;i < alen;i++)
			{
				atag[a.charAt(i) - 'A']++;
			}
			for (i = 0;i < blen;i++)
			{
				btag[b.charAt(i) - 'A']++;
			}
			for (i = 0;i < 100;i++)
			{
				if (atag[i] == btag[i])
				{
					continue;
				}
				else
				{
					break;
				}
			}
			if (i == 100)
			{
				System.out.print("YES");
			}
			else
			{
				System.out.print("NO");
			}
		}
		else
		{
			System.out.print("NO");
		}
		return 0;
	}
}

