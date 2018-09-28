public class stu
{
	public String name = new String(new char[20]);
	public int qc;
	public int bc;
	public char gb;
	public char xb;
	public int lw;
	public int m;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		stu[] s = tangible.Arrays.initializeWithDefaultstuInstances(100);
		int n;
		int i;
		int k = 0;
		int u = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			s[i].m = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i].name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s[i].qc = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				s[i].bc = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				s[i].gb = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				s[i].xb = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				s[i].lw = Integer.parseInt(tempVar7);
			}
			if (s[i].qc > 80 && s[i].lw >= 1)
			{
				s[i].m = s[i].m + 8000;
			}
			if (s[i].qc > 85 && s[i].bc > 80)
			{
				s[i].m = s[i].m + 4000;
			}
			if (s[i].qc > 90)
			{
				s[i].m = s[i].m + 2000;
			}
			if (s[i].qc > 85 && s[i].xb == 'Y')
			{
				s[i].m = s[i].m + 1000;
			}
			if (s[i].bc > 80 && s[i].gb == 'Y')
			{
				s[i].m = s[i].m + 850;
			}
			u = s[i].m + u;
			if (s[i].m > s[k].m)
			{
				k = i;
			}
		}
		System.out.printf("%s\n%d\n%d",s[k].name,s[k].m,u);
		return 0;
	}
}

