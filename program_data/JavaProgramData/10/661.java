package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int k;
		int j;
		int i;
		int[] a = new int[26];
		int[] length = new int[26];
		int max = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		length[0] = 1;

		for (i = 1;i < k;i++)
		{
			length[i] = 1;
			for (j = 0;j < i;j++)
			{

				if (a[i] <= a[j] != 0 && length[i] < length[j] + 1)
				{
					length[i] = length[j] + 1;
				}
			}
		}


		for (i = 0;i < k;i++)
		{


			if (length[i] > max)
			{
				max = length[i];
			}
		}

		System.out.printf("%d",max);

		return 0;
	}





}

