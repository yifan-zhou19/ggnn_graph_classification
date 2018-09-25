package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int a1;
		int b1;
		int n;
		int[] a = new int[5000];
		int[] b = new int[5000];
		int k;
		double m;
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
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		a1 = a[0];
		b1 = b[0];
		for (i = 0;i < n;i++)
		{
		   if (a1 > a[i])
		   {
			   a1 = a[i];
		   }
		   if (b1 < b[i])
		   {
			   b1 = b[i];
		   }
		}
		for (m = a1;m <= b1;m = m + 0.5)
		{
		  for (k = 0;k < n;k++)
		  {
			  if (a[k] <= m != 0 && m <= b[k])
			  {
				 break;
			  }
		  }
		  if (a[k] <= m != 0 && m <= b[k])
		  {
			  if (m != b1)
			  {
			  continue;
			  }
		  }
		  else
		  {
			  System.out.print("no");
			  break;
		  }
		  System.out.printf("%d %d",a1,b1);
		}
		return 0;
	}

}

