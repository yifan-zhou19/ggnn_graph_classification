package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[10];
		int[] b = new int[10];
		int i;
		int k;
		float c;
		float gpa;
		gpa = 0F;
		k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 1;i <= n;i++)
		{
			if (b[i] >= 90)
			{
				c = 4.0F;
			}
			else if (b[i] >= 85)
			{
				c = 3.7F;
			}
			else if (b[i] >= 82)
			{
				c = 3.3F;
			}
			else if (b[i] >= 78)
			{
				c = 3.0F;
			}
			else if (b[i] >= 75)
			{
				c = 2.7F;
			}
			else if (b[i] >= 72)
			{
				c = 2.3F;
			}
			else if (b[i] >= 68)
			{
				c = 2.0F;
			}
			else if (b[i] >= 64)
			{
				c = 1.5F;
			}
			else if (b[i] >= 60)
			{
				c = 1.0F;
			}
			else
			{
				c = 0F;
			}
			gpa = gpa + c * a[i];
		}
		for (i = 1;i <= n;i++)
		{
			k = k + a[i];
		}
		gpa = gpa / k;
		System.out.printf("%.2f",gpa);
		return 0;
	}

}

