public class node
{
	public String name = new String(new char[20]);
	public int fin;
	public int bj;
	public char gb;
	public char west;
	public int essay;
}

package <missing>;

public class GlobalMembers
{
	public static node[] stu = tangible.Arrays.initializeWithDefaultnodeInstances(100);
	public static void Main()
	{
		int n;
		int sum = 0;
		int max = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				stu[i].name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu[i].fin = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].bj = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].gb = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].west = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				stu[i].essay = Integer.parseInt(tempVar7);
			}
		}
		int[] a = new int[100];
		for (i = 0;i < n;i++)
		{
			a[i] = 0;
			if ((stu[i].fin > 80) && (stu[i].essay >= 1))
			{
				a[i] = a[i] + 8000;
			}
			if ((stu[i].fin > 85) && (stu[i].bj > 80))
			{
				a[i] = a[i] + 4000;
			}
			if (stu[i].fin > 90)
			{
				a[i] = a[i] + 2000;
			}
			if ((stu[i].fin > 85) && (stu[i].west == 'Y'))
			{
				a[i] = a[i] + 1000;
			}
			if ((stu[i].gb == 'Y') && (stu[i].bj > 80))
			{
				a[i] = a[i] + 850;
			}
		}
		for (i = 0;i < n;i++)
		{
			sum = sum + a[i];
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] > max)
			{
				max = a[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] == max)
			{
				System.out.printf("%s\n%d\n",stu[i].name,a[i]);
				break;
			}
		}
		System.out.printf("%d",sum);
	}

}

