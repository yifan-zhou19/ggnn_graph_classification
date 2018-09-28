package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
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
		int i;
		int j;
		int p = 0;
		int q;
		int[] num = new int[1000];
		for (i = 0;i < n;i++)
		{
			 int num1;
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 num1 = Integer.parseInt(tempVar3);
			 }
			 num[i] = num1;
		}
		for (q = 0;q < n;q++)
		{
			for (j = q + 1;j < n;j++)
			{
				if ((num[q] + num[j]) == k)
				{
					p++;
					break;
				}
			}
		if (p > 0)
		{
			break;
		}
		}

		if (p == 0)
		{
			System.out.print("no");
		}
		else
		{
		System.out.print("yes");
		}
	return 0;
	}

}

