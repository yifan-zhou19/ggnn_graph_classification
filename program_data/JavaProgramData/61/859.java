package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int j;
		int[] a = new int[20];
		int[] s = new int[20];
		int[] f = new int[20];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   a[j] = Integer.parseInt(tempVar2);
	   }
		}
	   for (i = 3;i <= 20;i++)
	   {
		  f[1] = 1;
		  f[2] = 1;
		 f[i] = f[i - 2] + f[i - 1];
	   }
		  for (i = 1;i <= 20;i++)
		  {
			 for (j = 0;j < n;j++)
			 {
			 if (a[j] == i)
			 {
			 s[j] = f[i];
			 }
			 }
		  }
			 for (j = 0;j < n;j++)
			 {
			 System.out.printf("%d\n",s[j]);
			 }
			 System.in.read();
			 System.in.read();
			 return 0;
	}

}

