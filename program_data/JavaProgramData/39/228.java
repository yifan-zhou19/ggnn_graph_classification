//C++ TO JAVA CONVERTER NOTE: Classes must be named in Java, so the following class has been named AnonymousClass:
public class AnonymousClass
{
	public String name = new String(new char[20]);
public int final;
public int cla;
public char gan;
public char west;
public int thesis;
public int money;
}

package <missing>;

public class GlobalMembers
{
	public static AnonymousClass[] stu = tangible.Arrays.initializeWithDefaultAnonymousClassInstances(120);
	public static void Main()
	{
		int n;
		int i;
		int j;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				stu[i].name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu[i].final = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].cla = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].gan = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].west = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				stu[i].thesis = Integer.parseInt(tempVar7);
			}
		}
		String tempVar8 = ConsoleInput.scanfRead();
		if (tempVar8 != null)
		{
			stu[n - 1].name = tempVar8.charAt(0);
		}
		String tempVar9 = ConsoleInput.scanfRead(" ");
		if (tempVar9 != null)
		{
			stu[n - 1].final = Integer.parseInt(tempVar9);
		}
		String tempVar10 = ConsoleInput.scanfRead(" ");
		if (tempVar10 != null)
		{
			stu[n - 1].cla = Integer.parseInt(tempVar10);
		}
		String tempVar11 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar11 != null)
		{
			stu[n - 1].gan = tempVar11.charAt(0);
		}
		String tempVar12 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar12 != null)
		{
			stu[n - 1].west = tempVar12.charAt(0);
		}
		String tempVar13 = ConsoleInput.scanfRead(" ");
		if (tempVar13 != null)
		{
			stu[n - 1].thesis = Integer.parseInt(tempVar13);
		}
		for (i = 0;i < n;i++)
		{
			stu[i].money = 0;
		}
		for (i = 0;i < n;i++)
		{
			if (stu[i].final > 80 && stu[i].thesis >= 1)
			{
				stu[i].money = stu[i].money + 8000;
			}
			if (stu[i].final > 85 && stu[i].cla > 80)
			{
				stu[i].money = stu[i].money + 4000;
			}
			if (stu[i].final > 90)
			{
				stu[i].money = stu[i].money + 2000;
			}
			if (stu[i].final > 85 && stu[i].west == 'Y')
			{
				stu[i].money = stu[i].money + 1000;
			}
			if (stu[i].cla > 80 && stu[i].gan == 'Y')
			{
				stu[i].money = stu[i].money + 850;
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
			if (stu[j].money < stu[j + 1].money)
			{
				stu[119] = stu[j];
				stu[j] = stu[j + 1];
				stu[j + 1] = stu[119];
			}
			}
		}
		for (i = 0;i < n;i++)
		{
			sum = sum + stu[i].money;
		}
		System.out.printf("%s\n",stu[0].name);
		System.out.printf("%d\n",stu[0].money);
		System.out.printf("%d\n",sum);
	}
}

