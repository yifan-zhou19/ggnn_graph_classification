public class data
{
	public int id;
	public int cs;
	public int ms;
	public int s;
}

package <missing>;

public class GlobalMembers
{
	public static int cmp(Object a, Object b)
	{
		return ((data)b).s - ((data)a).s;
	}
	public static int Main()
	{
		data[] a;
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = tangible.Arrays.initializeWithDefaultdataInstances(n);
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i].id = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i].cs = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				a[i].ms = Integer.parseInt(tempVar4);
			}
			a[i].s = a[i].cs + a[i].ms;
		}
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		qsort(a,n,sizeof(data),cmp);
		for (i = 0;i < 3;i++)
		{
			System.out.printf("%d %d\n",a[i].id,a[i].s);
		}
		a = null;
	}
}

