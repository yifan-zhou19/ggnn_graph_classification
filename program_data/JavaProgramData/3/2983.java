package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   int[] a = new int[1001];
	   int k;
	   int n;
	   int j;
	   int i;
	   int check;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   k = Integer.parseInt(tempVar2);
	   }
	   for (i = 0;i < n;i++)
	   {
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[i] = Integer.parseInt(tempVar3);
		}
	   }
	   check = 0;
	   for (i = 0;i < n;i++)
	   {
		  for (j = 0;j < n;j++)
		  {
			  if ((a[i] + a[j] == k) && (a[i] != a[j]))
			  {
				  check = 1;
				  break;
			  }

		  }
		if (check == 1)
		{
			break;
		}
	   }
		if (check == 0)
		{
			 System.out.print("no\n");

		}
		else
		{
			System.out.print("yes\n");
		}
	}
}

