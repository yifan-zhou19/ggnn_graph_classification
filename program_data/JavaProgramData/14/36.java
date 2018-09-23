public class student
{
public int num;
public int chn;
public int math;
public int sum;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int e;
	int x;
	student[] a = tangible.Arrays.initializeWithDefaultstudentInstances(100000);
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
		a[i].num = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		a[i].chn = Integer.parseInt(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead(" ");
	if (tempVar4 != null)
	{
		a[i].math = Integer.parseInt(tempVar4);
	}
	a[i].sum = a[i].chn + a[i].math;
	}
	for (i = 1; i <= 3; i++)
	{
		for (j = n - i - 1; j >= 0; j--)
		{
		   if (a[j].sum < a[j + 1].sum)
		   {
			   x = a[j + 1].sum;
			   a[j + 1].sum = a[j].sum;
			   a[j].sum = x;
			   e = a[j + 1].num;
			   a[j + 1].num = a[j].num;
			   a[j].num = e;
		   }
		}
	}
	for (i = 0; i <= 2; i++)
	{
	 System.out.printf("%d %d\n", a[i].num, a[i].sum);
	}
	return 0;
	}

}

