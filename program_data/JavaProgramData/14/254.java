public class Student
{
	public int num;
 public int yuwen;
 public int shuxue;
}

package <missing>;

public class GlobalMembers
{
	public static void fun(tangible.RefObject<Integer> a, tangible.RefObject<Integer> b)
	{
		int k;
		k = a.argValue;
		a.argValue = b.argValue;
		b.argValue = k;
	}
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] sum = new int[100000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		Student[] stu = tangible.Arrays.initializeWithDefaultStudentInstances(100000);
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				stu[i].num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				stu[i].yuwen = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				stu[i].shuxue = Integer.parseInt(tempVar4);
			}
			sum[i] = stu[i].yuwen + stu[i].shuxue;
		}
		for (i = 0;i < 3;i++)
		{
			for (j = n - 1;j > i;j--)
			{
				if (sum[j] > sum[j - 1])
				{
					fun(sum[j], sum[j - 1]);
					fun(stu[j - 1].num, stu[j].num);
						fun(stu[j - 1].yuwen, stu[j].yuwen);
						fun(stu[j - 1].shuxue, stu[j].shuxue);
				}
			}
		}
		for (i = 0;i < 3;i++)
		{
			System.out.printf("%d %d\n",stu[i].num,sum[i]);
		}
		return 0;
	}
}

