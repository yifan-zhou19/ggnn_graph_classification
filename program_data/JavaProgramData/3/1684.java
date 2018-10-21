package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] array = new int[1000];
		int n;
		int k;
		int i;
		int j;
		int flag = 0;
		int m;
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
				array[i] = Integer.parseInt(tempVar3);
			}
		}

		for (i = 0;i < n - 1;i++)
		{
				m = i;
				for (j = i + 1;j < n;j++)
				{
					if (array[j] < array[m])
					{
						m = j;
					}
				}
				int temp = array[i];
				array[i] = array[m];
				array[m] = temp;
		}

		for (i = 0,j = n - 1;i < j;)
		{
			int temp = array[i] + array[j];
			if (temp == k)
			{
				flag = 1;
				break;
			}
			else if (temp > k)
			{
				j--;
			}
			else
			{
				i++;
			}
		}
		if (flag != 0)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}
		return 0;
	}
}

