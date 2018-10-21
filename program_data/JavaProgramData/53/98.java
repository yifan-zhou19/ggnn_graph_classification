package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int i;
		int n;
		int j;
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 1;j < n;j++)
			{
				if (a[j] == a[i] && j != i)
				{
				a[j] = 0;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] != 0)
			{
				System.out.printf("%d",a[i]);
				x = i;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto loop;
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		loop:
		for (i = x + 1;i < n;i++)
		{
				 if (a[i] != 0)
				 {
				 System.out.printf(",%d",a[i]);
				 }
		}
			 System.out.print("\n");
	}

}

