package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int total = 1;
		int i;
		int max1;
		int max2;
		int judge;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[1] = Integer.parseInt(tempVar);
		}
		while (System.in.read() != '\n')
		{
			total++;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[total] = Integer.parseInt(tempVar2);
			}
		}
		if (total == 1)
		{
			System.out.print("No\n");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			goto end;
		}
		max1 = a[1];
		for (i = 1;i <= total;i++)
		{
			if (a[i] > max1)
			{
				max1 = a[i];
			}
		}
		judge = 1;
		for (i = 1;i <= total;i++)
		{
			if (a[i] < max1)
			{
				judge = 0;
				max2 = a[i];
			}
		}
		if (judge == 1)
		{
			System.out.print("No\n");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			goto end;
		}
		for (i = 1;i <= total;i++)
		{
			if (a[i] < max1 && a[i]> max2)
			{
				max2 = a[i];
			}
		}
		System.out.printf("%d\n",max2);
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	end:
	;
	}


}

