package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[300];
		int i;
		int max;
		int mat;
		int t = 0;
		int sum = 0;
		float ave;
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
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			sum = sum + a[i];
		}
		ave = (float)sum / n;
		max = a[0];
		for (i = 1;i < n;i++)
		{
			if (Math.abs(a[i] - ave) > Math.abs(max - ave))
			{
				max = a[i];
			}
			else if (Math.abs(a[i] - ave) == Math.abs(max - ave))
			{
				t = 1;
				mat = a[i];
			}
		}
		if (t == 0)
		{
			System.out.printf("%d",max);
		}
		else
		{
			System.out.printf("%d,%d",max,mat);
		}
	}




}

