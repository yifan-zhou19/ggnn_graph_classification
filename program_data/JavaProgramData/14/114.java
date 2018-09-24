public class data
{
	public int[] num = new int[100000];
	public int[] a = new int[100000];
	public int[] b = new int[100000];
	public int[] sum = new int[100000];
}

package <missing>;

public class GlobalMembers
{
	public static data data = new data();

	public static void Main(String[] args)
	{
		int i;
		int n;
		int x = 0;
		int y = 0;
		int z = 0;
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
				data.num[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				data.a[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				data.b[i] = Integer.parseInt(tempVar4);
			}
			data.sum[i] = data.a[i] + data.b[i];
		}
		for (i = 0;i < n;i++)
		{
			if (data.sum[i] > data.sum[x])
			{
				z = y;
				y = x;
				x = i;
				continue;
			}
			if (data.sum[i] <= data.sum[x] != 0 && data.sum[i]> data.sum[y])
			{
				z = y;
				y = i;
				continue;
			}
			if (data.sum[i] <= data.sum[y] != 0 && data.sum[i]> data.sum[z])
			{
				z = i;
			}
		}
		System.out.printf("%d %d\n",data.num[x],data.sum[x]);
		System.out.printf("%d %d\n",data.num[y],data.sum[y]);
		System.out.printf("%d %d",data.num[z],data.sum[z]);
	}
}

