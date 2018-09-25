public class student
{
	public int id;
	public char yw;
	public char sx;
	public int zf;
	public int pm;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	student[] a = tangible.Arrays.initializeWithDefaultstudentInstances(100000);
	student[] b = tangible.Arrays.initializeWithDefaultstudentInstances(2);
	int n;
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
		a[i].id = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		a[i].yw = tempVar3.charAt(0);
	}
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		a[i].sx = tempVar4.charAt(0);
	}
	}
	for (i = 0;i < n;i++)
	{
	a[i].zf = a[i].yw + a[i].sx;
	}
	j = 0;
	for (i = 0;i < n;i++)
	{
	if (a[i].zf > j)
	{
		j = a[i].zf;
		b[0] = a[i];
	}
	}
	System.out.printf("%d %d\n",b[0].id,b[0].zf);
	j = 0;
	for (i = 0;i < n;i++)
	{
	if (a[i].zf > j && a[i].id != b[0].id)
	{
		j = a[i].zf;
		b[1] = a[i];
	}
	}
	System.out.printf("%d %d\n",b[1].id,b[1].zf);
	j = 0;
	for (i = 0;i < n;i++)
	{
	if (a[i].zf > j && a[i].id != b[0].id && a[i].id != b[1].id)
	{
		j = a[i].zf;
		b[2] = a[i];
	}
	}
	System.out.printf("%d %d\n",b[2].id,b[2].zf);
	}
}

