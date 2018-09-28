public class student
{
	public String name = new String(new char[21]);
	public int qimo;
	public int pingyi;
	public char ganbu;
	public char xibu;
	public int paper;
	public int money;
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
		int moneyzong = 0;
		String name1 = new String(new char[21]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		student[] a = tangible.Arrays.initializeWithDefaultstudentInstances(n);
		for (i = 0;i < n;i++)
		{
			a[i].money = 0;
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i].name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i].qimo = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				a[i].pingyi = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				a[i].ganbu = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				a[i].xibu = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				a[i].paper = Integer.parseInt(tempVar7);
			}
			if (a[i].qimo > 80 && a[i].paper >= 1)
			{
				a[i].money += 8000;
			}
			if (a[i].qimo > 85 && a[i].pingyi > 80)
			{
				a[i].money += 4000;
			}
			if (a[i].qimo > 90)
			{
				a[i].money += 2000;
			}
			if (a[i].qimo > 85 && a[i].xibu == 'Y')
			{
				a[i].money += 1000;
			}
			if (a[i].pingyi > 80 && a[i].ganbu == 'Y')
			{
				a[i].money += 850;
			}
		}
		for (i = 0;i < n;i++)
		{
			moneyzong += a[i].money;
		}

		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - 1;j++)
			{
				if (a[i].money >= a[i + 1].money)
				{
					e = a[i].money;
					a[i].money = a[i + 1].money;
					a[i + 1].money = e;
					name1 = a[i].name;
					a[i].name = a[i + 1].name;
					a[i + 1].name = name1;
				}

			}
		}


		System.out.printf("%s\n%d\n%d\n",a[n - 1].name,a[n - 1].money,moneyzong);
		return 0;
	}


}

