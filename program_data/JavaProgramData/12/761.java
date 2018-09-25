package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		float[] a = new float[100];
		int i;
		int j;
		int t;
		do
		{
			t = 0;
		for (i = 0;i <= 99;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Float.parseFloat(tempVar);
			}
			if (i >= 1)
			{
				if (a[i] == 0F)
				{
					break;
				}

			for (j = 0;j <= i - 1;j++)
			{
				if ((a[i] == 2 * a[j]) || (a[i] == a[j] / 2))
				{
					t = t + 1;
				}
			}
			}

		}
		if (a[0] != -1F)
		{
		System.out.printf("%d\n",t);
		}
		}while (a[0] != -1F);
		return 0;
	}

}

