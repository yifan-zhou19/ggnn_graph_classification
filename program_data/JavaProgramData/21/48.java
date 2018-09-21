package <missing>;

public class GlobalMembers
{
	public static float absd(float a)
	{
		if (a < 0F)
		{
			a = -a;
		}
		return (a);
	}
	public static void Main()
	{
		float ave;
		float num;
		float s;
		int m;
		int j;
		int k;
		int i;
		int[] a = new int[300];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		s = 0F;
		for (i = 0;i < m;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
		}
		for (i = 0;i < m;i++)
		{
			s = s + a[i];
		}
		ave = s / m;
		num = absd(a[0] - ave);
		k = a[0];
		j = 0;
		for (i = 1;i < m;i++)
		{
			if (absd(ave - a[i]) > num)
			{
			  num = absd(ave - a[i]);
			  k = a[i];
			}
			else
			{
			  if (absd(ave - a[i]) == num)
			  {
				j = a[i];
			  }
			}
		}
			  if (j == 0)
			  {
			System.out.printf("%d",k);
			  }
		else
		{
			if (k > j)
			{
				System.out.printf("%d,%d",j,k);
			}
			else
			{
				System.out.printf("%d,%d",k,j);
			}
		}

	}
}

