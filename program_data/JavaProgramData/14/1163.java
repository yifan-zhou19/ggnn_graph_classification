public class student
{
public int name;
public int ch;
public int math;
}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100000);
	public static int Main()
	{
	int n;
	int[] sum = new int[100000];
	int[] max = new int[3];
	int i;
	int j;
	int k;
	int m;
	int o;
	int s;
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
		stu[i].name = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		stu[i].ch = Integer.parseInt(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead(" ");
	if (tempVar4 != null)
	{
		stu[i].math = Integer.parseInt(tempVar4);
	}
	}
	for (i = 0;i < n;i++)
	{
				   sum[i] = stu[i].ch + stu[i].math;
	}
	{
	//for(i=0;i<n;i++)
					max[0] = 0;
					for (j = 0,k = 0;j < n;j++)
					{
						if (sum[j] > max[0])
						{
						max[0] = sum[j];
					k = j;
						}
					}
}
{
	//for(i=0;i<n;i++)
					max[1] = 0;
					for (j = 1,m = 0;j < n;j++)
					{
						if ((sum[j] > max[1]) && (j != k))
						{
						max[1] = sum[j];
					m = j;
						}
					}
}
{
	//for(i=0;i<n;i++)
					max[2] = 0;
					for (j = 1,o = 0;j < n;j++)
					{
						if ((sum[j] > max[2]) && (j != k) && (j != m))
						{
						max[2] = sum[j];
					o = j;
						}

					}



}
	System.out.printf("%d %d\n",stu[k].name,sum[k]);
	System.out.printf("%d %d\n",stu[m].name,sum[m]);
	System.out.printf("%d %d\n",stu[o].name,sum[o]);
	return 0;
	}
}

