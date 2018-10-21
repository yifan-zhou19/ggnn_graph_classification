package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int[] a = new int[300];
		int m;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{ //??
						 String tempVar2 = ConsoleInput.scanfRead();
						 if (tempVar2 != null)
						 {
							 a[i] = Integer.parseInt(tempVar2);
						 }
		}

		for (i = 0;i < n;i++)
		{
						 for (m = 0;m < i;m++)
						 {
										  if (a[i] == a[m])
										  {
										  a[i] = -100;
										  }
						 }
		}

		for (i = n - 1;i > 0;i--)
		{
						   if (a[i] != -100)
						   {
										  e = a[i];
										  break;
						   }
		}

		for (i = 0;i < n;i++)
		{
						 if (a[i] == e)
						 {
							 break;
						 }
						 if (a[i] != -100)
						 {
										System.out.printf("%d,",a[i]);
						 }
		}

		System.out.printf("%d\n",e);





	}
}

