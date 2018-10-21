public class inform
{
	public String name = new String(new char[20]);
	public int test1;
	public int test2;
	public char c;
	public char w;
	public int a;
}

package <missing>;

public class GlobalMembers
{
	public static inform[] stu = tangible.Arrays.initializeWithDefaultinformInstances(100);
	public static inform temp1 = new inform();
	public static void Main()
	{
		int n;
		int i;
		int j;
		int temp2;
		int[] sum = new int[100];
		int sum1 = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				stu[i].name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu[i].test1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].test2 = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].c = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].w = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				stu[i].a = Integer.parseInt(tempVar7);
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			if (stu[i].test1 > 80 && stu[i].a >= 1)
			{
				sum[i] = 8000;
			}
			if (stu[i].test1 > 85 && stu[i].test2 > 80)
			{
				sum[i] = sum[i] + 4000;
			}
			if (stu[i].test1 > 90)
			{
				sum[i] = sum[i] + 2000;
			}
			if (stu[i].test1 > 85 && stu[i].w == 'Y')
			{
				sum[i] = sum[i] + 1000;
			}
			if (stu[i].test2 > 80 && stu[i].c == 'Y')
			{
				sum[i] = sum[i] + 850;
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			 for (j = 0;j <= n - 2 - i;j++)
			 {
				 if (sum[j] < sum[j + 1])
				 {
					 temp2 = sum[j];
					 sum[j] = sum[j + 1];
					 sum[j + 1] = temp2;
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp1=stu[j];
					 temp1.copyFrom(stu[j]);
					 stu[j] = stu[j + 1];
					 stu[j + 1] = temp1;
				 }
			 }
		}
		for (i = 0;i <= n - 1;i++)
		{
			sum1 = sum1 + sum[i];
		}
		System.out.printf("%s\n",stu[0].name);
		System.out.printf("%d\n",sum[0]);
		System.out.printf("%d\n",sum1);
	}

}

