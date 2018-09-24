package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		int x;
		int y;
		int i;
		int j;
		int z = 0;
		int[] a = new int[100];
		int[] b = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		a[0] = n;
		for (i = 0;a[i] != 1;)
		{
			i++;
			a[i] = (int)(a[i - 1] / 2);
		}
		x = i;
		b[0] = m;
		for (i = 0;b[i] != 1;)
		{
			i++;
			b[i] = (int)(b[i - 1] / 2);
		}
		y = i;
		for (i = 0;i <= x;i++)
		{
			for (j = 0;j <= y;j++)
			{
				if (a[i] == b[j])
				{
					z = 1;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto loop;
				}
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	loop:
	if (z == 1)
	{
			 System.out.printf("%d\n",a[i]);
	}
	}

}

