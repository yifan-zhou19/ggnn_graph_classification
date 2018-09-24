package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		int[] arr = new int[300];
		int[] arr1 = new int[300];
		int[] arr2 = new int[300];
		int i;
		int j;

		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				arr[i] = Integer.parseInt(tempVar2);
			}
			arr1[i] = arr[i];
			arr2[i] = i;
		}

		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
			if (arr1[i] == arr1[j])
			{
								  arr2[j] = -1;
			}
			}
		}

		int s = 0;
		for (i = 0;i < n;i++)
		{
			if (arr2[i] != -1)
			{
							 s++;
			}
		}

		for (i = 0;i < n;i++)
		{
			if (arr2[i] != -1)
			{
							 System.out.printf("%d",arr1[i]);
							 s--;
							 if (s > 0)
							 {
								 System.out.print(",");
							 }
			}
		}
		return 0;
	}
}

