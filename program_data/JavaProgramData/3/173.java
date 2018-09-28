package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int k;
		int[] a = new int[1000];
		int b = 0;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0; i < n; i++)
		{
			for (int j = i + 1; j < n; j++)
			{
				if (a[i] + a[j] == k)
				{
					b = 1;
					System.out.print("yes\n");
					break;
				}
			}
			if (b == 1)
			{
				break;
			}
		}
		if (b == 0)
		{
			System.out.print("no\n");
		}





	}

}

