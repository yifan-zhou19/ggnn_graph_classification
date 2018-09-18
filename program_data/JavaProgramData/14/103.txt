public class student
{
	public int id;
public int yw;
public int sx;
}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100000);
	public static void Main()
	{
		int n;
		int i;
		int[] sum = new int[100000];
		int[] temp = new int[3];
		int max;
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
				stu[i].id = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu[i].yw = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].sx = Integer.parseInt(tempVar4);
			}
			sum[i] = stu[i].yw + stu[i].sx;
		}
		for (i = 0,max = -1,temp[0] = 0;i < n;i++)
		{
			if (sum[i] > max)
			{
				max = sum[i];
				temp[0] = i;
			}
		}
		for (i = 0,max = -1,temp[1] = 0;i < n;i++)
		{
			if (i == temp[0])
			{
				continue;
			}
			else
			{
				if (sum[i] > max)
				{
					max = sum[i];
					temp[1] = i;
				}
			}
		}
		for (i = 0,max = -1,temp[2] = 0;i < n;i++)
		{
			if (i == temp[0] || i == temp[1])
			{
				continue;
			}
			else
			{
				if (sum[i] > max)
				{
					max = sum[i];
					temp[2] = i;
				}
			}
		}
		System.out.printf("%d %d\n",stu[temp[0]].id,sum[temp[0]]);
		System.out.printf("%d %d\n",stu[temp[1]].id,sum[temp[1]]);
		System.out.printf("%d %d",stu[temp[2]].id,sum[temp[2]]);
	}
}

