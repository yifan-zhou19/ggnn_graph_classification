package <missing>;

public class GlobalMembers
{
	// ????.cpp : ??????????????
	//



	public static int Main()
	{
		int n;
		int i;
		int m;
		int j;
		int[] a = new int[100];
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
		  s = 0;
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  m = Integer.parseInt(tempVar2);
		  }
		  for (j = 0;j < m;j++)
		  {
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[j] = Integer.parseInt(tempVar3);
			}
		  }
		  if (m == 0)
		  {
			  System.out.print("60");
		  }
		  else if (m == 1)
		  {
			if (a[m - 1] + 3 * m <= 60)
			{
			  s = 60 - 3 * m;
			  System.out.printf("%d",s);
			}
			else
			{
				System.out.printf("%d",a[0]);
			}
		  }
		  else
		  {
			 if (a[m - 1] + 3 * m <= 60)
			 {
			   s = 60 - 3 * m;
			   System.out.printf("%d",s);
			 }
			 else if (a[m - 1] + 3 * m > 60 && a[m - 1] + 3 * (m - 1) <= 60)
			 {
			   s = a[m - 1];
			   System.out.printf("%d",s);
			 }
			 else if (a[m - 1] + 3 * (m - 1) > 60 && a[m - 2] + 3 * (m - 1) <= 60)
			 {
				 s = 60 - 3 * (m - 1);
				 System.out.printf("%d",s);
			 }
			 else if (a[m - 2] + 3 * (m - 1) > 60 && a[m - 2] + 3 * (m - 2) <= 60)
			 {
			   System.out.printf("%d",a[m - 2]);
			 }
			 else if (a[m - 2] + 3 * (m - 2) > 60 && a[m - 3] + 3 * (m - 2) <= 60)
			 {
			   s = 60 - 3 * (m - 2);
			   System.out.printf("%d",s);
			 }
		  }
		  System.out.print("\n");
		}
		return 0;
	}


}

