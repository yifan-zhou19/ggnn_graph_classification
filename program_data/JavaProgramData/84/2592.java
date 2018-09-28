package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] ch = new int[100];
		int i;
		int max;
		int max1;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n - 1;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			ch[i] = Integer.parseInt(tempVar2);
		}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			ch[n - 1] = Integer.parseInt(tempVar3);
		}
		max = ch[0];
		max1 = ch[0];
		for (i = 0;i < n;i++)
		{
			if (max < ch[i])
			{
			max = ch[i];
			}
		}
		System.out.printf("%d\n",max);
		for (i = 0;i < n;i++)
		{
			if (max1 < ch[i] && ch[i] != max)
			{
				max1 = ch[i];
			}
		}
		System.out.printf("%d",max1);
	}





}

