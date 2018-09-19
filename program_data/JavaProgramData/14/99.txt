public class stu
{
	public int num;
	public int ch;
	public int math;
	public int total;
}
public class str
{
	public int num;
	public int total;
}

package <missing>;

public class GlobalMembers
{
	public static stu[] a = tangible.Arrays.initializeWithDefaultstuInstances(100000);
	public static str[] b = tangible.Arrays.initializeWithDefaultstrInstances(100000);

	public static int Main()
	{
		int i;
		int n;
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
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i].ch = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				a[i].math = Integer.parseInt(tempVar4);
			}
		b[i].num = a[i].num;
		b[i].total = a[i].ch + a[i].math;
		}
		for (i = 0; i < 3; i++)
		{
			for (j = i + 1;j < n;j++)
			{
			if (b[i].total < b[j].total)
			{
				b[n] = b[i];
				b[i] = b[j];
				b[j] = b[n];
			}
			}
		}
		for (i = 0;i < 3;i++)
		{
		System.out.printf("%d %d\n",b[i].num,b[i].total);
		}
	}


}

