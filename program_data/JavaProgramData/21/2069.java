package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[302];
		int[] r = new int[301];
		int i;
		int j;
		int count = 0;
		int tag = 0;
		int temp;
		float aver;
		float max = 0F;
		float sum = 0F;
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
		}
		for (i = 0;i < n;i++)
		{
			sum += a[i];
		}
		aver = sum / n;

		for (i = 0;i < n;i++)
		{
			if (Math.abs(a[i] - aver) > max)
			{
			  max = Math.abs(a[i] - aver);
			}
		}

		for (i = 0;i < n;i++)
		{
			t = Math.abs(a[i] - aver);
			if (t == max)
			{

				r[count] = a[i];
				count++;
			}
		}

		for (i = 0;i < count;i++)
		{
			tag = r[i];
			for (j = i;j < count;j++)
			{
				if (r[j] < tag)
				{
					tag = r[j];
				}
			}
			if (tag != r[j])
			{
				temp = r[i];
				r[i] = r[j];
				r[j] = temp;
			}
		}
		if (count == 1)
		{
			System.out.printf("%d",r[1]);
		}
	else
	{
		for (i = 1;i < count;i++)
		{
			System.out.printf("%d,",r[i]);
		}
		System.out.printf("%d\n",r[i]);
	}
	}



}

