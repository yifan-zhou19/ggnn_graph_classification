package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j = 0;
		float[] a = new float[100];
		float total = 0F;
		float temp1;
		float temp2;
		float temp;
		float[] aa = new float[100];
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
				a[i] = Float.parseFloat(tempVar2);
			}
			total = total + a[i];
		}
		total = total / n;
		if (a[0] >= total)
		{
			temp2 = a[0] - total;
		}
		else
		{
			temp2 = total - a[0];
		}
		for (i = 1;i < n;i++)
		{
			if (a[i] >= total)
			{
				temp1 = a[i] - total;
			}
			else
			{
				temp1 = total - a[i];
			}
			if (temp1 >= temp2)
			{
				temp2 = temp1;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] >= total)
			{
				temp1 = a[i] - total;
			}
			else if (a[i] < total)
			{
				temp1 = total - a[i];
			}
			if (temp1 != temp2)
			{
				a[i] = 0F;
			}
			else if (temp1 == temp2)
			{
				aa[j] = a[i];
				j++;
			}
		}
		n = j - 1;
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (aa[i] > aa[j])
				{
					temp = aa[j];
					aa[j] = aa[i];
					aa[i] = temp;
				}
			}
		}
		System.out.printf("%.0f",aa[0]);
		for (i = 1;i <= n;i++)
		{
			System.out.printf(",%.0f",aa[i]);
		}
	}







}

