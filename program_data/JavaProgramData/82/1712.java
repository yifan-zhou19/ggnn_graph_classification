package <missing>;

public class GlobalMembers
{
	public static int Main()

	{
	  int i;
	  int j;
	  int n;
	  int k;
	  int[] a = new int[100];
	  int shousuo;
	  int shuzhang;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  j = 0;
	  k = 0;
	  for (i = 0;i < n;i++)
	  {
		  a[i] = 0;
	  }
	  for (i = 1;i <= n;i++)
	  {
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				shousuo = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				shuzhang = Integer.parseInt(tempVar3);
			}
			if (90 <= shousuo != 0 && shousuo <= 140)
			{
			   if (60 <= shuzhang != 0 && shuzhang <= 90)
			   {
					a[j] = a[j] + 1;
			   }
			   else
			   {
					  j = j + 1;
			   }


			}

			else
			{
			j = j + 1;
			}

	  }
	  for (i = 0;i < n;i++)
	  {
		if (k < a[i])
		{
			k = a[i];
		}
	  }
	  System.out.printf("%d\n",k);
	}
}

