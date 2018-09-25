public class student
{
	public int number;
	public int math;
	public int chinese;
	public int total;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		student[] a = tangible.Arrays.initializeWithDefaultstudentInstances(100000);
		int n;
		int i;
		int sf = 0;
		int ss = 0;
		int st = 0;
		int f;
		int s;
		int t;
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
				a[i].number = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i].math = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a[i].chinese = Integer.parseInt(tempVar4);
			}
			a[i].total = a[i].math + a[i].chinese;
			if (a[i].total > sf)
			{
				t = s;
				st = ss;
				s = f;
				ss = sf;
				f = i;
				sf = a[i].total;
			}
			else
			{
				if (a[i].total > ss)
				{
					t = s;
					st = ss;
					s = i;
					ss = a[i].total;
				}
				else
				{
					if (a[i].total > st)
					{
						t = i;
						st = a[i].total;
					}
				}
			}
		}
		System.out.printf("%d %d\n",f + 1,sf);
		System.out.printf("%d %d\n",s + 1,ss);
		System.out.printf("%d %d\n",t + 1,st);
		return 0;
	}

}

