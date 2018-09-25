package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int[] a = new int[100];
		int n;
		int s = 0;
		float sum = 0F;
		float aver;
		float[] b = new float[100];
		float t;
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
		aver = sum / n;
		for (i = 0;i < n;i++)
		{
			if (a[i] > aver)
			{
				b[i] = a[i] - aver;
			}
			else
			{
				b[i] = aver - a[i];
			}
			t = (t >= b[i])?t:b[i];
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] == t)
			{
				s++;
			if (a[i] < aver)
			{
				System.out.printf("%d",a[i]);
			}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] > aver && b[i] == t)
			{
				if (s == 2)
				{
					System.out.printf(",%d",a[i]);
				}
				if (s == 1)
				{
					System.out.printf("%d",a[i]);
				}
			}
		}
	}






}

