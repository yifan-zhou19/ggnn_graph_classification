package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int k;
	int h;
	int l;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] a = new int[10001];
	int[] b = new int[10001];
	int[] c = new int[10001];
	for (j = 0;j < 10001;j++)
	{
						 c[j] = 0;
	}
	for (i = 0;i < n;i++)
	{
					 String tempVar2 = ConsoleInput.scanfRead();
					 if (tempVar2 != null)
					 {
						 (a[i]) = Integer.parseInt(tempVar2);
					 }
					 String tempVar3 = ConsoleInput.scanfRead(" ");
					 if (tempVar3 != null)
					 {
						 (b[i]) = Integer.parseInt(tempVar3);
					 }
					 if (i > 0)
					 {
							 if (b[i] > b[i - 1])
							 {
											 k = b[i];
							 }
					 }
					 else
					 {
						 k = b[0];
					 }
		for (j = (a[i]);j < b[i];j++)
		{
								c[j] = 1;
		}
	}
		for (j = 0;j <= 10001;j++)
		{
							  if (c[j] == 1)
							  {
										 h = j;
										 for (j = j;j <= k;j++)
										 {
														  if (j == k - 1)
														  {

																  System.out.printf("%d %d",h,k);
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
																  goto x;
														  }
														  if (c[j] == 0)
														  {
																	 System.out.print("no");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
																	 goto x;
														  }
										 }
							  }
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
							   x:
										 return 0;
	}

}

