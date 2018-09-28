package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		String s1 = new String(new char[100]);
		String s2 = new String(new char[100]);
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s1 = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s2 = tempVar3.charAt(0);
			}
			int j = s1.length();
			int k = s2.length();
			int w;
			int e;
			for (w = 0;w < 100;w++)
			{
				a[w] = 0;
			}
			for (w = j,e = k;w > 0;w--,e--)
			{
				if (e > 0)
				{
					a[w - 1] = s1.charAt(w - 1) - s2.charAt(e-1);
				}
				else
				{
					a[w - 1] = s1.charAt(w - 1) - '0';
				}
				if (a[w - 1] < 0)
				{
							 s1 = tangible.StringFunctions.changeCharacter(s1, w - 2, s1.charAt(w - 2) - 1);
							 a[w - 1] += 10;
				}
			}
			for (w = 0;a[w] == 0;w++)
			{
				;
			}
			for (;w < j;w++)
			{
				System.out.printf("%d",a[w]);
			}
	System.out.print("\n");
		}
		return 0;
	}

}

