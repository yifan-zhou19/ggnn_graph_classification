package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//int sort(int[] arr, int n);
	public static int bubblesort(int[] arr, int n)
	{
		int sorted = 0;

		while (sorted < n - 1)
		{
			int changed = 0;
			int i;
			for (i = 0;i < n - sorted - 1;i++)
			{
				if (arr[i] > arr[i + 1])
				{
					int t = arr[i + 1];
					arr[i + 1] = arr[i];
					arr[i] = t;
					changed = 1;
				}
			}

			if (changed == 0)
			{
				break;
			}

			sorted++;
		}

		return arr[n - 1];
	}

	public static int Main()
	{
		int n;
		int[] arr = new int[100000];
		int k;
		int i = 0;
		int index = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				arr[i] = Integer.parseInt(tempVar3);
			}
		}

		bubblesort(arr, n);

		if (arr[0] + arr[1] > k || arr[n - 1] + arr[n - 2] < k)
		{
			System.out.print("no");
			return 0;
		}

		int flag = 0;

		int n1 = 0;
		int n2 = n - 1;
		while (n1 < n2)
		{
			if (arr[n1] + arr[n2] == k)
			{
				System.out.print("yes");
				return 0;
			}
			if (arr[n1] + arr[n2] > k)
			{
				n2--;
			}
			else
			{
				n1++;
			}
		}
		System.out.print("no");

		return 0;
	}
}

