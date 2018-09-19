package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		float[] a = new float[16];
		int i;
		int j;
		int n;
		int t;
		for (i = 0;i < 100;i++)
		{
			n = 0;
			t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Float.parseFloat(tempVar);
		}
		if (a[0] == -1F)
		{
			break;
		}
		n = n + 1;
		for (j = 1;j < 16;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[j] = Float.parseFloat(tempVar2);
			}
			if (a[j] == 0F)
			{
				break;
			}
			n = n + 1;
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (a[j] == a[i] * 2 || a[j] == 0.5 * a[i])
				{
				 t++;
				}
			}
		}
		System.out.printf("%d\n",t);
		}
	return 0;
	}

}

