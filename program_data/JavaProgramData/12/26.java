package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int count;
		float[] a = new float[20];
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[0] = Float.parseFloat(tempVar);
			}
			if (a[0] == -1F)
			{
				break;
			}
			n = 1;
			while (true)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[n] = Float.parseFloat(tempVar2);
				}
				if (a[n] == 0F)
				{
					break;
				}
				n++;
			}
			count = 0;
			for (i = 0; i < n; i++)
			{
				for (j = i + 1; j < n; j++)
				{
					if ((a[i] / a[j] == 2.0F) || (a[j] / a[i] == 2.0F))
					{
						count++;
					}
				}
			}
			System.out.printf("%d\n", count);
		}

		return 0;
	}
}

