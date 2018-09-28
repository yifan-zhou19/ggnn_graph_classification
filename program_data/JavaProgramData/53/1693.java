package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int i;
		int n;
		int j;
		int[] b = new int[300];
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
			b[i] = a[i];
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	loop:
	for (i = 1;i < n - 1;i++)
	{
			for (j = i - 1;j >= 0;j--)
			{

				if (a[i] == b[j])
				{
					for (;i < n - 1;i++)
					{
						a[i] = a[i + 1];
						b[i] = a[i];

					}
					n--;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto loop;
				}
			}
	}
		 for (i = 0;i < n - 1;i++)
		 {
			 if (a[n - 1] == a[i])
			 {
				 n--;
			 }
		 }
		 if (n == 1)
		 {
			 System.out.printf("%d",a[0]);
		 }
		 else
		 {
			 System.out.printf("%d",a[0]);
			 for (i = 1;i < n;i++)
			 {
				  System.out.printf(",%d",a[i]);
			 }
		 }
		return 0;
	}
}

