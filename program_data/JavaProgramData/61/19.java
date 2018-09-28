package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[10050];
		int i;
		int j;
		int num;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a[1] = 1;
		a[2] = 1;
		for (j = 1;j < 10000;j++)
		{
			a[j + 2] = a[j + 1] + a[j];
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				num = Integer.parseInt(tempVar2);
			}
			if (num == 0)
			{
				System.out.print("0\n");
			}
			else if (num == 1)
			{
				System.out.print("1\n");
			}
			else
			{
				System.out.printf("%d\n",a[num]);
			}
		}
	}

}

