public class information
{
	public String name = new String(new char[20]);
	public int score;
	public int marks;
	public char banwei;
	public char xibu;
	public int lunwen;
	public int reward;
}

package <missing>;

public class GlobalMembers
{
	public static information[] a = tangible.Arrays.initializeWithDefaultinformationInstances(101);
	public static void Main()
	{
		int n;
		int i;
		int k;
		int sum = 0;
		int max = 0;
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
				a[i].name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i].score = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a[i].marks = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				a[i].banwei = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				a[i].xibu = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				a[i].lunwen = Integer.parseInt(tempVar7);
			}
		}
		for (i = 0;i < n;i++)
		{
			a[i].reward = 0;
			if (a[i].banwei == 'Y' && a[i].marks > 80)
			{
				a[i].reward = a[i].reward + 850;
			}
			if (a[i].score > 80)
			{
				if (a[i].lunwen > 0)
				{
					a[i].reward = a[i].reward + 8000;
				}

				if (a[i].score > 85)
				{
					if (a[i].marks > 80)
					{
						a[i].reward = a[i].reward + 4000;
					}
					if (a[i].xibu == 'Y')
					{
						a[i].reward = a[i].reward + 1000;
					}
					if (a[i].score > 90)
					{
						a[i].reward = a[i].reward + 2000;
					}
				}
			}
		 if (a[i].reward > max)
		 {
			 max = a[i].reward;
			 k = i;
		 }
		  sum = sum + a[i].reward;
		}
			System.out.printf("%s\n%d\n%d\n",a[k].name,max,sum);
	}

}

