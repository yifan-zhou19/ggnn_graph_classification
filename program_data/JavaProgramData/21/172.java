package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[100];
		int n;
		int i;
		int min = 0;
		int max = 0;
		float sum = 0F;
		float aver;
		float s;
		float t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			sum += a[i];
		}
		aver = sum / n;
		for (i = 0;i <= n - 1;i++)
		{
			if (a[i] < a[min])
			{
				min = i;
			}
			if (a[i] > a[max])
			{
				max = i;
			}
		}
		s = aver - a[min];
		t = a[max] - aver;
		if (s > t)
		{
			System.out.printf("%d\n",a[min]);
		}
		else if (s < t)
		{
			System.out.printf("%d\n",a[max]);
		}
		else if (s == t)
		{
			System.out.printf("%d,%d\n",a[min],a[max]);
		}
	}
}

