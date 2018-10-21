public class student
{
	public String name = new String(new char[20]);
	public int qm;
	public int bj;
	public char x;
	public char xi;
	public int lun;
	public int award;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		student[] s = tangible.Arrays.initializeWithDefaultstudentInstances(100);
		int i;
		int N;
		int k = 0;
		int p;
		int q = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (i = 0;i < N;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i].name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				s[i].qm = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				s[i].bj = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				s[i].x = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				s[i].xi = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				s[i].lun = Integer.parseInt(tempVar7);
			}
			s[i].award = 0;
		//	printf("%s %d %d %c %c %d\n",s[i].name,s[i].qm,s[i].bj,s[i].x,s[i].xi,s[i].lun);
		}
		for (i = 0;i < N;i++)
		{
			if (s[i].qm > 80 && s[i].lun > 0)
			{
				s[i].award = s[i].award + 8000;
			}
			if (s[i].qm > 85 && s[i].bj > 80)
			{
				s[i].award = s[i].award + 4000;
			}
			if (s[i].qm > 90)
			{
				s[i].award = s[i].award + 2000;
			}
			if (s[i].qm > 85 && s[i].xi == 'Y')
			{
				s[i].award = s[i].award + 1000;
			}
			if (s[i].bj > 80 && s[i].x == 'Y')
			{
				s[i].award = s[i].award + 850;
			}
		}
		p = s[0].award;
		for (i = 0;i < N;i++)
		{
			if (s[i].award > p)
			{
				p = s[i].award;
			}
		}
		q = 0;
		for (i = 0;i < N;i++)
		{
			if (s[i].award == p)
			{
				if (k == 0)
				{
					k = k + 1;
					System.out.printf("%s\n",s[i].name);
					System.out.printf("%d\n",p);
				}
			}
			q = q + s[i].award;
		}
		System.out.printf("%d",q);
	}


}

