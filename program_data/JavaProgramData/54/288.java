package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int j = 1;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (i = 1;;i++)
		{
			j = 1;
			t = i * n + k;
		   while (j < n)
		   {
		   if (t % (n - 1) != 0 && t >= (n - 1))
		   {
			   break;
		   }
		   else if (t % (n - 1) == 0 && t < (n - 1))
		   {
			   break;
		   }
		   else
		   {
			   t = t / (n - 1) * n + k;
		   }
		   j++;
		   }
		   if (j >= n)
		   {
			   break;
		   }
		}
		System.out.printf("%d\n",t);
	}

}

