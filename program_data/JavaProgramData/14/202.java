public class stu
 {
	 public int num;
	 public int m;
	 public int c;
	 public int sum;
 }

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a = 0;
		int b = 0;
		int c = 0;
		int x = 0;
		int y = 0;
		int z = 0;
		stu[] student = tangible.Arrays.initializeWithDefaultstuInstances(65535);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				student[i].num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				student[i].c = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				student[i].m = Integer.parseInt(tempVar4);
			}
			student[i].sum = student[i].m + student[i].c;
		}
		for (int i = 0;i < n;i++)
		{
			if (student[i].sum > a)
			{
				c = b;
				z = y;
				b = a;
				y = x;
				a = student[i].sum;
				x = student[i].num;
				continue;
			}
			if (student[i].sum > b)
			{
				c = b;
				z = y;
				b = student[i].sum;
				y = student[i].num;
				continue;
			}
			if (student[i].sum > c)
			{
				c = student[i].sum;
				z = student[i].num;
			}
		}
		System.out.printf("%d %d\n%d %d\n%d %d\n",x,a,y,b,z,c);
	System.in.read();
	System.in.read();
	return 0;
	}
}

