package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int[] a = new int[1000];
		int[] b = new int[1000];
		int n;
		int cal = 0;
		int max = 0;
		char ch;
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				ch = tempVar2.charAt(0);
			}
			if (ch == ',')
			{
				continue;
			}
			else
			{
				n = i;
				break;
			}
		}
		for (i = 0;;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(null, 1);
			if (tempVar4 != null)
			{
				ch = tempVar4.charAt(0);
			}
			if (ch == ',')
			{
				continue;
			}
			else
			{
				break;
			}
		}
		for (i = 0;i < 1000;i++)
		{
			for (j = 0;j <= n;j++)
			{
				if (i >= a[j] != 0 && i < b[j])
				{
					cal++;
				}
			}
			if (cal > max)
			{
				max = cal;
			}
			cal = 0;
		}
		System.out.printf("%d %d",n + 1,max);
	}

}

