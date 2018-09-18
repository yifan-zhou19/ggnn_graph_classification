public class stu
{
	public int num;
	public int chi;
	public int mat;
	public int tot;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int comp(Object a, Object b)
	{
		return ((stu)b).tot - ((stu)a).tot;
	}
	public static stu[] a = tangible.Arrays.initializeWithDefaultstuInstances(100000);
	public static stu b = new stu();
	public static int Main()
	{
		int i;
		int j;
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
				a[i].num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i].chi = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a[i].mat = Integer.parseInt(tempVar4);
			}
			a[i].tot = a[i].chi + a[i].mat;
		}
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		qsort(a,n,sizeof(stu),comp);
		for (i = 0;i < 3;i++)
		{
		System.out.printf("%d %d\n",a[i].num,a[i].tot);
		}
		return 0;
	}
}

