public class f
{
public String id = new String(new char[10]);
public int old;
}

package <missing>;

public class GlobalMembers
{
	public static f[] st = tangible.Arrays.initializeWithDefaultfInstances(1000);
	public static f[] stu = tangible.Arrays.initializeWithDefaultfInstances(1000);
	public static f temp = new f();
	public static int Main()
	{
		int n;
		int i;
		int j;
		int a;
		int b;
		int c;
		char cc;
		char aa;
		String x = new String(new char[1000]);
		String y = new String(new char[1000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				st[i].id = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(null, 1);
			if (tempVar3 != null)
			{
				aa = tempVar3.charAt(0);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				st[i].old = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(null, 1);
			if (tempVar5 != null)
			{
				cc = tempVar5.charAt(0);
			}
		}
		a = 0;
		for (j = 1;j <= n;j++)
		{
			if (st[j].old >= 60)
			{
				a++;
				stu[a] = st[j];
			}
		}
		for (i = a - 1;i >= 0;i--)
		{
			for (j = 1;j <= i;j++)
			{
				if (stu[j].old < stu[j + 1].old)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=stu[j];
					temp.copyFrom(stu[j]);
					stu[j] = stu[j + 1];
					stu[j + 1] = temp;
				}
			}
		}
		for (i = 1;i <= a;i++)
		{
			System.out.println(stu[i].id);
		}
		for (i = 1;i <= n;i++)
		{
			if (st[i].old < 60)
			{
				System.out.println(st[i].id);
			}
		}
	}
}

