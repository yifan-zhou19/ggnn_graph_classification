package <missing>;

public class GlobalMembers
{
	/*????? */
	public static void Main()
	{
		int[] a = new int[300];
		int max;
		int min;
		int n;
		int sum = 0;
		int i;
		float ave;
		float sub1;
		float sub2;
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
			sum = sum + a[i];
		}
		ave = (float)sum / n;
		max = a[0];
		min = a[0];
		for (i = 1;i < n;i++)
		{
			if (a[i] > max)
			{
				max = a[i];
			}
			else if (a[i] < min)
			{
				min = a[i];
			}
		}
		sub1 = (float)max - ave;
		sub2 = ave - (float)min;
		if (sub1 == sub2)
		{
			System.out.printf("%d,%d",min,max);
		}
		else
		{
			System.out.printf("%d",(sub1 > sub2)?max:min);
		}
	}

}

