package <missing>;

public class GlobalMembers
{
	public static float average(int[] a, int n)
	{
		int sum = 0;
		int i;
		float avr;
		for (i = 0;i < n;i++)
		{
			sum = sum + a[i];
		}
		avr = (float)sum / n;
		return (avr);
	}

	public static void Main()
	{
		int n;
		int[] a = new int[300];
		int i;
		int num;
		float avr;
		float[] b = new float[300];
		float t = 0F;
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
		avr = average(a, n);
		for (i = 0;i < n;i++)
		{
			if (a[i] > avr)
			{
				b[i] = (float)a[i] - avr;
			}
			else
			{
				b[i] = (float)avr - a[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] > t)
			{
				t = b[i];
				num = i;
			}
		}
		System.out.printf("%d",a[num]);
		for (i = num + 1;i < n;i++)
		{
			if (b[i] == t)
			{
				System.out.printf(",%d",a[i]);
			}
		}
		System.out.print("\n");
	}
}

