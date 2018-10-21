package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m;
		int[] a = new int[100];
		int[] b = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 1;i <= n;i++)
		{

		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   m = Integer.parseInt(tempVar2);
		   }
		   if (m == 0)
		   {
			  System.out.print("6");
		   continue;
		   }
		  else
		  {

		   for (j = 0;j < m;j++)
		   {
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  a[j] = Integer.parseInt(tempVar3);
			  }
		   }
		  }
			   for (j = m - 1;j < m;j--)
			   {
					if ((60 - a[j] - 3 * j) > 0)
					{
				  break;
					}
			   }

		   if ((60 - a[j] - 3 * j) < 4)
		   {
			  b[i - 1] = a[j];
		   }
		   else
		   {
				b[i - 1] = 57 - 3 * j;
		   }

		}
			for (i = 1;i <= n;i++)
			{
			 System.out.printf("%d\n",b[i - 1]);
			}
	return 0;
	}
}

