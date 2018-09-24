public class student
{
	public int num;
	public int chinese;
	public int math;
	public int total;
}

package <missing>;

public class GlobalMembers
{
	public static student[] s = tangible.Arrays.initializeWithDefaultstudentInstances(N);

	public static int Main()
	{
		int n;
		int i;
		int j;
		int tn;
		int tt;
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
				s[i].num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s[i].chinese = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				s[i].math = Integer.parseInt(tempVar4);
			}
			s[i].total = s[i].math + s[i].chinese;
		}
		for (i = 1;i < 4;i++)
		{
			for (j = 0;j < n - i;j++)
			{
				if (s[j].total >= s[j + 1].total)
				{
					tt = s[j].total;
					tn = s[j].num;
					s[j].total = s[j + 1].total;
					s[j].num = s[j + 1].num;
					s[j + 1].total = tt;
					s[j + 1].num = tn;
				}
			}
		}
		System.out.printf("%d %d\n%d %d\n%d %d\n",s[n - 1].num,s[n - 1].total,s[n - 2].num,s[n - 2].total,s[n - 3].num,s[n - 3].total);
		return (0);
	}
}

