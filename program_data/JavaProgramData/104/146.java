package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		int i;
		int j;
		int p = 0;
		int[] a = new int[1000];
		int[] b = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		a[0] = x,b[0] = y;
		for (i = 1;i < 1000;i++)
		{
			if (a[i - 1] > 1)
			{
			a[i] = a[i - 1] / 2;
			}
			if (a[i - 1] == 1)
			{
			break;
			}
		}
		for (i = 1;i < 1000;i++)
		{
			if (b[i - 1] > 1)
			{
			b[i] = b[i - 1] / 2;
			}
			if (b[i - 1] == 1)
			{
			break;
			}
		}
		for (i = 0;i < 1000;i++)
		{
			for (j = 0;j < 1000;j++)
			{

				if (a[i] == b[j])
				{
					System.out.printf("%d\n",a[i]);
					p = 1;
					break;
				}
				if (j == 1000)
				{
				break;
				}
			   /* if(a[i]==b[i])
			{
			    printf("%d\n",a[i]);
			    break;*/
			}
			if (p == 1)
			{
			break;
			}
		}
		return 0;
	}

}

