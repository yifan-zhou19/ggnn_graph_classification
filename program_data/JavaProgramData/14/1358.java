public class student
{
	public int id;
	public int c;
	public int m;
	public int t;
}

package <missing>;

public class GlobalMembers
{
		public static student[] a = tangible.Arrays.initializeWithDefaultstudentInstances(SIZE);
	public static int cmp(Object p1, Object p2)
	{
		student p3 = (student)p1;
		student p4 = (student)p2;
		return -p3.t + p4.t;
	}
	public static int Main()
	{
		int n;
		int i;
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
				a[i].id = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i].c = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a[i].m = Integer.parseInt(tempVar4);
			}
			a[i].t = a[i].m + a[i].c;
		}
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		qsort(a,n,sizeof(a[0]),cmp);
		for (i = 0;i < 3;i++)
		{
		System.out.printf("%d %d\n", a[i].id, a[i].c + a[i].m);
		}
		return 0;
	}

}

