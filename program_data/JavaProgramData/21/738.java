package <missing>;

public class GlobalMembers
{
	public static float abs(float a,int b)
	{
		if (a > b)
		{
			return (a - b);
		}
		else
		{
			return (b - a);
		}
	}
	public static void bubble(int[] a, int n)
	{
		int i;
		int j;
		int temp;
		for (i = 1;i < n;i++)
		{
			for (j = 0;j < n - i;j++)
			{
				if (a[j] > a[j + 1])
				{
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}

	public static void Main()
	{
		int n;
		int[] a = new int[310];
		int i;
		int flag = 0;
		float s = 0F;
		float p = 0F;
		float max = -1.0F;
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
			s = s + a[i];
		}
		bubble(a, n);
		p = s / n;
		for (i = 0;i < n;i++)
		{
			if (abs(p, a[i]) > max)
			{
				max = abs(p, a[i]);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (abs(p, a[i]) == max && flag == 0)
			{
				System.out.printf("%d",a[i]);
				flag = 1;
			}
			else
			{
				if (abs(p, a[i]) == max && flag == 1)
				{
					System.out.printf(",%d",a[i]);
				}
			}
		}
	}



}

