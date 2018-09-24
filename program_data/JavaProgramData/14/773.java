public class stu
{
	public int[] num = new int[100000];
	public int[] y = new int[100000];
	public int[] m = new int[100000];
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int temp = 0;
		int[] sum = new int[100000];
		stu p = new stu();
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
				p.num[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p.y[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p.m[i] = Integer.parseInt(tempVar4);
			}
			sum[i] = p.m[i] + p.y[i];
		}
		for (i = 0;i < n - 1;i++)
		{
			if (sum[i] >= sum[i + 1])
			{
				temp = sum[i + 1];
				sum[i + 1] = sum[i];
				sum[i] = temp;
				temp = p.num[i + 1];
				p.num[i + 1] = p.num[i];
				p.num[i] = temp;
			}
		}
		System.out.printf("%ld %d\n",p.num[n - 1],sum[n - 1]);
		for (i = 0;i < n - 2;i++)
		{
			if (sum[i] >= sum[i + 1])
			{
				temp = sum[i + 1];
				sum[i + 1] = sum[i];
				sum[i] = temp;
				temp = p.num[i + 1];
				p.num[i + 1] = p.num[i];
				p.num[i] = temp;
			}
		}
		System.out.printf("%ld %d\n",p.num[n - 2],sum[n - 2]);
		for (i = 0;i < n - 3;i++)
		{
			if (sum[i] >= sum[i + 1])
			{
				temp = sum[i + 1];
				sum[i + 1] = sum[i];
				sum[i] = temp;
				temp = p.num[i + 1];
				p.num[i + 1] = p.num[i];
				p.num[i] = temp;
			}
		}
		System.out.printf("%ld %d\n",p.num[n - 3],sum[n - 3]);
		return 0;
	}

}

