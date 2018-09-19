package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int end;
		int k;
		float[] a = new float[1000];
		int[] n = new int[100];
		int[] num = new int[100];
		for (i = 0; i < 100; i++)
		{
			num[i] = -1;
		}
		i = 0;
		j = 1;
		n[0] = -1;
		for (i = 1; i < 100; i++)
		{
			n[i] = 0;
		}
		end = 0;
		for (i = 0; i < 1000; i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Float.parseFloat(tempVar);
			}
			if (a[i] == -1F)
			{
				end = i;
				break;
			}
		}

		for (i = 0; i < end; i++)
		{
			 if (a[i] == 0F)
			 {
				 n[j] = i;
				 j++;
			 }
		}



		k = 1;
		while (n[k] != 0)
		{
			num[k] = 0;
			for (i = n[k - 1] + 1; i < n[k]; i++)
			{
				for (j = n[k - 1] + 1; j < n[k]; j++)
				{
					if (a[i] / a[j] == 2F)
					{
						num[k]++;
					}
				}
			}
			k++;
		}

		k = 1;
		while (num[k] != -1)
		{

			System.out.printf("%d\n", num[k]);
			k++;
		}


		return 0;
	}
}

