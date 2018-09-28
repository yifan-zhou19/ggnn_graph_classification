package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[200];
		int n;
		int[][] s = new int[200][20];
		int[] b = new int[200];
		int[] e = new int[200];
		int i;
		int[] m = new int[200];
		int t = 0;
		int j;
		int k = 0;
		int h = 0;
		String d = new String(new char[200]);
		String c = new String(new char[200]);
		char f;
		char g;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[i] = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(null, 1);
			if (tempVar5 != null)
			{
				f = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(null, 1);
			if (tempVar6 != null)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, tempVar6);
			}
			String tempVar7 = ConsoleInput.scanfRead(null, 1);
			if (tempVar7 != null)
			{
				g = tempVar7.charAt(0);
			}
			String tempVar8 = ConsoleInput.scanfRead(null, 1);
			if (tempVar8 != null)
			{
				d = tangible.StringFunctions.changeCharacter(d, i, tempVar8);
			}
			String tempVar9 = ConsoleInput.scanfRead();
			if (tempVar9 != null)
			{
				e[i] = Integer.parseInt(tempVar9);
			}
		}
	for (i = 0;i < n;i++)
	{
			m[i] = 0;
			if (a[i] > 80 && e[i] > 0)
			{
				m[i] += 8000;
			}
			if (a[i] > 85 && b[i] > 80)
			{
				m[i] += 4000;
			}
			if (a[i] > 90)
			{
				m[i] += 2000;
			}
			if (a[i] > 85 && d.charAt(i) == 'Y')
			{
				m[i] += 1000;
			}
			if (b[i] > 80 && c.charAt(i) == 'Y')
			{
				m[i] += 850;
			}
	}
	for (i = 0;i < n;i++)
	{
		h += m[i];
		if (m[i] > t)
		{
		t = m[i];
		j = i;
		}
	}

	 System.out.printf("%s\n%d\n%d\n",s[j],t,h);
	  return 0;
	}

}

