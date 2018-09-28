package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int j;
		int k;
		int[] reach = new int[10000];
		int[] leave = new int[10000];
		int num = 0;
		int max = 0;
		char a;
		do
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				reach[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			i++;
		} while (a != '\n');
		System.out.printf("%d ",i);
		for (j = 0;j < i;j++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				leave[j] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(null, 1);
			if (tempVar4 != null)
			{
				a = tempVar4.charAt(0);
			}
		}
		for (j = 0;j < 1000;j++)
		{
			for (k = 0;k <= i;k++)
			{
				if (reach[k] <= j != 0 && leave[k]> j)
				{
					num++;
				}
			}
			if (num > max)
			{
				max = num;
			}
			num = 0;
		}
		System.out.printf("%d",max);
	}




}

