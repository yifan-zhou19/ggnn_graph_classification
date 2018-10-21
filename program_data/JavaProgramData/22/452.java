package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int i;
		int j;
		int k = 1;
		int t;
		char comma;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
		do
		{
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				comma = tempVar2.charAt(0);
			}
			if (comma != ',')
			{
				break;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[k] = Integer.parseInt(tempVar3);
			}
			k = k + 1;
		}while (k <= 300);


		for (j = 1;j < k;j++)
		{
			for (i = 0;i < k - 1;i++)
			{
				if (a[i] < a[i + 1])
				{
					t = a[i + 1];
					a[i + 1] = a[i];
					a[i] = t;
				}
			}
		}
		if (a[0] == a[k - 1])
		{
			System.out.print("No");
		}
		else
		{
			for (i = 1;i <= k - 1;i++)
			{
				if (a[i] == a[0])
				{
				a[i] = 100000;
				}
				if (a[i] < 100000)
				{
					System.out.printf("%d",a[i]);
					break;
				}
			}
		}
		return 0;
	}



}

