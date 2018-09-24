package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		int i;
		int j;
		int[] a = new int[100];
		int[] b = new int[100];
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
		a[0] = x;
		b[0] = y;
		for (i = 1;;i++)
		{
			if (a[i - 1] == 1)
			{
				break;
			}
			a[i] = a[i - 1] / 2;
		}
		for (i = 1;;i++)
		{
			if (b[i - 1] == 1)
			{
				break;
			}
			b[i] = b[i - 1] / 2;
		}
		for (i = 0;;i++)
		{
			for (j = 0;j < 100;j++)
			{
				if (a[i] == b[j])
				{
					System.out.printf("%d\n",a[i]);
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto end;
				}
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	end:
		return 0;
	}


}

