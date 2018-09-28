package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] ax = new int[100];
	int a = 0;
	int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		i = Integer.parseInt(tempVar);
	}
	while (a <= i - 1)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			ax[a] = Integer.parseInt(tempVar2);
		}
	a++;
	}
	int b = 0;
	int c;
	int k = 1;
	while (k < i)
	{
		b = 0;
		 while (b < i - k)
		 {
			  if (ax[b] >= ax[b + 1])
			  {
				  c = ax[b];
			   ax[b] = ax[b + 1];
			   ax[b + 1] = c;
			  }
		  b++;
		 }
	k++;
	}
	System.out.printf("%d\n%d",ax[i - 1],ax[i - 2]);
	return 0;
	}
}

