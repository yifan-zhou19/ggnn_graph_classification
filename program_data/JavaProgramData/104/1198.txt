package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int x1;
	   int x2;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   x1 = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead(" ");
	   if (tempVar2 != null)
	   {
		   x2 = Integer.parseInt(tempVar2);
	   }
	   int i = 1;
	   int j = 1;
	   int m = 1;
	   int k;
	   int l;
	   int t;
	   int[] a1 = new int[1000];
	   int[] a2 = new int[1000];
	   if (x1 == x2)
	   {
		 System.out.printf("%d\n",x1);
	   }
	   else if (x1 == 1 || x2 == 1)
	   {
		   System.out.printf("%d\n",m);
	   }
	   else
	   {
	   a1[0] = x1;
	   a2[0] = x2;
	   do
	   {
		   a1[i] = a1[i - 1] / 2;
		   i++;
	   }while (a1[i - 1] != 1);
	   do
	   {
		   a2[j] = a2[j - 1] / 2;
		   j++;
	   }while (a2[j - 1] != 1);
	   for (k = 0;k < i;k++)
	   {
		 for (l = 0;l < j;l++)
		 {
			if (a1[k] == a2[l])
			{
				System.out.printf("%d\n",a1[k]);
				return 0;
			}
		 }
	   }
	   }

	}



}

