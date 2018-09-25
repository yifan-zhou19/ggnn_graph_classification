public class score
{
	public int num;
	public int yuwen;
	public int shuxue;
}

package <missing>;

public class GlobalMembers
{
	public static score[] student = tangible.Arrays.initializeWithDefaultscoreInstances(100000);
	public static int max(int a,int b)
	{
		return (a > b)?a:b;
	}
	public static int min(int a,int b)
	{
		return (a < b)?a:b;
	}
	public static int Main()
	{
		int max = new int(int a,int b);
		int[] total = new int[100000];
		int n;
		int i;
		int max1 = 0;
		int max2 = 0;
		int max3 = 0;
		int maxnum1 = 0;
		int maxnum2 = 0;
		int maxnum3 = 0;
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
				student[i].num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				student[i].yuwen = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				student[i].shuxue = Integer.parseInt(tempVar4);
			}
			total[i] = student[i].yuwen + student[i].shuxue;
			if (total[i] >= max1)
			{
				if (total[i] == max1)
				{
					max3 = max2;
					max2 = max1;
					max1 = total[i];
					maxnum3 = maxnum2;
					maxnum2 = max(maxnum1, i + 1);
					maxnum1 = min(maxnum1, i + 1);
				}
				else
				{
					max3 = max2;
					max2 = max1;
					max1 = total[i];
					maxnum3 = maxnum2;
					maxnum2 = maxnum1;
					maxnum1 = i + 1;
				}
			}
			else if (total[i] < max1 && total[i] >= max2)
			{

				if (total[i] == max2)
				{
					max3 = max2;
					max2 = total[i];
					maxnum3 = max(maxnum2, i + 1);
					maxnum2 = min(maxnum2, i + 1);
				}
				else
				{
					max3 = max2;
					max2 = total[i];
					maxnum3 = maxnum2;
					maxnum2 = i + 1;
				}
			}
			else if (total[i] < max2 && total[i] >= max3)
			{
				if (total[i] == max3)
				{
					max3 = total[i];
					maxnum3 = min(i + 1, maxnum3);
				}
				else
				{
					max3 = total[i];
					maxnum3 = i + 1;
				}
			}
		}
		System.out.printf("%d %d\n",maxnum1,max1);
		System.out.printf("%d %d\n",maxnum2,max2);
		System.out.printf("%d %d",maxnum3,max3);
		return 0;
	}
}

