public class student
{
	public String name = new String(new char[50]);
	public int score;
	public int pin;
	public char stu;
	public char west;
	public int num;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		student[] a = tangible.Arrays.initializeWithDefaultstudentInstances(100);
		int n;
		int i;
		int j;
		int k;
		int[] sum = new int[100];
		int total = 0;
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
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				a[i].pin = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				a[i].stu = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				a[i].west = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				a[i].num = Integer.parseInt(tempVar7);
			}
			if (a[i].score > 80 && a[i].num >= 1)
			{
				sum[i] = sum[i] + 8000;
			}
			if (a[i].score > 85 && a[i].pin > 80)
			{
				sum[i] = sum[i] + 4000;
			}
			if (a[i].score > 90)
			{
				sum[i] = sum[i] + 2000;
			}
			if (a[i].score > 85 && a[i].west == 'Y')
			{
				sum[i] = sum[i] + 1000;
			}
			if (a[i].pin > 80 && a[i].stu == 'Y')
			{
				sum[i] = sum[i] + 850;
			}
			total = total + sum[i];
		}
		k = sum[0];
		for (i = 1;i < n;i++)
		{
			if (k < sum[i])
			{
				k = sum[i];
				j = i;
			}
		}

		System.out.printf("%s\n%ld\n%ld\n",a[j].name,sum[j],total);
	}





}

