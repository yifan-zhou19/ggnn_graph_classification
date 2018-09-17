public class area
{
	public String sex = new String(new char[8]);
	public float hight;
}

package <missing>;

public class GlobalMembers
{
	public static area[] a = tangible.Arrays.initializeWithDefaultareaInstances(100);

	public static int cmp(Object a, Object b)
	{
		area aa = (area)a;
		area bb = (area)b;
		if (aa.sex.charAt(0) == 'm' && bb.sex.charAt(0) == 'f')
		{
			return -1;
		}
		else if (aa.sex.charAt(0) == 'f' && bb.sex.charAt(0) == 'm')
		{
			return 1;
		}
		else if (aa.sex.charAt(0) == 'm')
		{
			return aa.hight < bb.hight != 0 ? -1 : 1;
		}
		else
		{
			return aa.hight < bb.hight != 0 ? 1 : -1;
		}
	}

	public static int Main()
	{
		int n;
		int i;
		//freopen("in.txt", "r", stdin);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i].sex = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i].hight = Float.parseFloat(tempVar3);
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		qsort(a, n, sizeof(area), cmp);
		for (i = 0; i < n; i++)
		{
			System.out.printf("%.2f", a[i].hight);
	if (i < n - 1)
	{
	System.out.print(" ");
	}
		}
		return 0;
	}
}

