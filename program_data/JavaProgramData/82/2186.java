package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int[] a = new int[100];
	   int[] b = new int[100];
	   int[] c = new int[100];
	   int i;
	   int e1;
	   int e2;
	   int s2 = 0;
	   int y = 0;
	   int s1 = 0;
	   int w = 0;
	   int s = 0;
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
		   (a[i]) = Integer.parseInt(tempVar2);
	   }
	   String tempVar3 = ConsoleInput.scanfRead(" ");
	   if (tempVar3 != null)
	   {
		   (b[i]) = Integer.parseInt(tempVar3);
	   }
	   }


	   for (i = 0;i < n;i++)
	   {
		   if (a[i] >= 90 && a[i] <= 140 && b[i] >= 60 && b[i] <= 90)
		   {
		   c[i] = 1;
		   }
		   else
		   {
			   c[i] = 0;
		   }
	   }


	   for (i = 0;i < n;i++)
	   {
		   if ((c[0] == 1 && i == 0) || (c[i - 1] == 0 && c[i] == 1))
		   {
			   e1 = i;

			   {

			for (i = e1;i < n;i++)
			{

				if ((c[n - 1] == 1 && i == n - 1) || (c[i] == 1 && c[i + 1] == 0))
				{
					e2 = i;
					break;
				}
			}
			y = e2 - e1 + 1;
			if (y > s2)
			{
				s2 = y;
			}
			y = 0;
			   }


		   }
		   else
		   {
			   continue;
		   }
	   }




		System.out.printf("%d",s2);



		return 0;
	}

}

