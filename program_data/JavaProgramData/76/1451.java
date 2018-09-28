package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int e;
		int q;
		int[] a = new int[w];
		int[] b = new int[w];
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (k = 1;k < n;k++)
		{
			for (i = 0;i < n - k;i++)
			{
			 if (a[i] > a[i + 1])
			 {
			 e = a[i];
			 a[i] = a[i + 1];
			 a[i + 1] = e;
			 e = b[i];
			b[i] = b[i + 1];
			b[i + 1] = e;
			 }
			}
		}
		q = 0;
		for (i = 0;i < n - 1;i++)
		{
		 if (b[i] < a[i + 1])
		 {
		 q = 1;
		 break;
		 }
		 else
		 {
		 if (b[i] > b[i + 1] && (i != n - 1))
		 {
			 e = b[i];
			 b[i] = b[i + 1];
			 b[i + 1] = e;
		 }
		 }
		}



	   if (q == 1)
	   {
		   System.out.print("no");
	   }
	   else
	   {
		   System.out.printf("%d %d",a[0],b[n - 1]);
	   }
	return 0;
	}




}

