package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[200];
		int[] b = new int[200];
		int[] c = new int[200];
		int[] m = new int[200];
		int s = 0;
		int max;
		int maxj;
		char[][] d = new char[200][40];
		String e = new String(new char[200]);
		String f = new String(new char[200]);
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
				d[i] = tempVar2.charAt(0);
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
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				e = tangible.StringFunctions.changeCharacter(e, i, tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				f = tangible.StringFunctions.changeCharacter(f, i, tempVar6);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				c[i] = Integer.parseInt(tempVar7);
			}
		}
		for (i = 0;i < n;i++)
		{
			m[i] = 0;
			if (a[i] > 80 && c[i] > 0)
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
			if (a[i] > 85 && f.charAt(i) == 'Y')
			{
				m[i] += 1000;
			}
			if (b[i] > 80 && e.charAt(i) == 'Y')
			{
				m[i] += 850;
			}
		}
		for (i = 0;i < n;i++)
		{
			s += m[i];
		}
		max = m[0];
		maxj = 0;
		for (i = 1;i < n;i++)
		{
			if (m[i] > max)
			{
				max = m[i];
				maxj = i;
			}
		}
		System.out.printf("%s\n%d\n%d",d[maxj],max,s);
		return 0;
	}
}

