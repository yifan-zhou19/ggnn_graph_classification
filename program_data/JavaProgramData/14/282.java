public class student
{
	public int xuehao;
	public int yuwen;
	public int shuxue;
}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100000);
	public static int Main()
	{
		int[] sum = new int[100000];
		int i;
		int j;
		int n;
		int t;
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
				stu[i].xuehao = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu[i].yuwen = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].shuxue = Integer.parseInt(tempVar4);
			}
			sum[i] = stu[i].yuwen + stu[i].shuxue;
		}

		for (i = 0;i < 3;i++)
		{
			t = 0;
			for (j = 0;j < n - 1;j++)
			{
				if (sum[j + 1] > sum[t])
				{
				t = j + 1;
				}
			}
			System.out.printf("%d %d\n",stu[t].xuehao,sum[t]);
			sum[t] = 0;
		}
		System.in.read();
		System.in.read();
		System.in.read();
	}



}

