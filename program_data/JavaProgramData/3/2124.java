package <missing>;

public class GlobalMembers
{
	public static void Main()
	{

	  int i;
	  int j;
	  int k;
	  int n;
	  int[] a = new int[1500];
	  int flag = 0;
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
		for (i = 1;i <= n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 2;i <= n;i++)
		{
			for (j = 1;j <= i - 1;j++)
			{
				if ((a[i] + a[j]) == k)
				{
					flag = 1;
				}
			}
		}
		if (n == 1)
		{
			System.out.print("no");
		}
		else
		{
			if (flag != 0)
			{
				System.out.print("yes");
			}
			else
			{
				System.out.print("no");
			}
		}

	}
}

