package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int[] a = new int[20005];
		int[] mark = new int[100];
		int print = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a + i = tempVar2;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (mark[a[i]] == 1)
			{
				continue;
			}
			else
			{
				if (print != 0)
				{
					System.out.print(" ");
				}
				System.out.printf("%d",a[i]);
				print = 1;
				mark[a[i]]++;
			}
		}
		System.out.print(10);
	}

}

