public class student
{
	public int num;
	public int Chinese;
	public int math;
	public int sum;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int p;
		int q;
		int r;
		int b = 0;
		int c = 0;
		int d = 0;
		student[] a = tangible.Arrays.initializeWithDefaultstudentInstances(100000);
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
				a[i].Chinese = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a[i].math = Integer.parseInt(tempVar4);
			}
			a[i].sum = a[i].Chinese + a[i].math;
			if (i == 0)
			{
				p = q = r = a[i].sum;
			}
			else
			{
				if (a[i].sum > p)
				{
					r = q;
					q = p;
					p = a[i].sum;
					d = c;
					c = b;
					b = i;
				}
				else if (a[i].sum > q)
				{
					r = q;
					q = a[i].sum;
					d = c;
					c = i;
				}
				else if (a[i].sum > r)
				{
					r = a[i].sum;
					d = i;
				}
			}
		}
		System.out.printf("%d %d\n%d %d\n%d %d\n",a[b].num,a[b].sum,a[c].num,a[c].sum,a[d].num,a[d].sum);
	}
}

