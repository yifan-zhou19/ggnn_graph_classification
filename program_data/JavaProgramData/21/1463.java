package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int num[300],ttl=0;
		int[] num = new int[300];
		int ttl = 0;
		float[] dlt = new float[300];
		int[] rmb = new int[300];
		float avrg;
		float t1;
		int i;
		int j;
		int t;
		int t2;

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
				num[i] = Integer.parseInt(tempVar2);
			}
			ttl += num[i];
		}

		avrg = (double)ttl / n;

		for (i = 0;i < n;i++)
		{
			if ((double)num[i] >= avrg)
			{
				dlt[i] = (double)num[i] - avrg;
			}
			else
			{
				dlt[i] = avrg - (double)num[i];
			}
		}

		t1 = dlt[0];
		for (i = 1;i < n;i++)
		{
			if (t1 <= dlt[i])
			{
				t1 = dlt[i];
			}
		}

		j = 0;
		for (i = 0;i < n;i++)
		{
			if (dlt[i] == t1)
			{
				rmb[j] = num[i];
				j++;
			}
		}

		t = j;
		for (i = 0;i < t - 1;i++)
		{
			for (j = i + 1;j < t;j++)
			{
				if (rmb[i] > rmb[j])
				{
					t2 = rmb[i];
					rmb[i] = rmb[j];
					rmb[j] = t2;
				}
			}
		}

		System.out.printf("%d",rmb[0]);
		for (i = 1;i < t;i++)
		{
			System.out.printf(",%d",rmb[i]);
		}
	}
}

