package <missing>;

public class GlobalMembers
{
	public static int compare(Object elem1, Object elem2)
	{
		return (((int)elem2) - ((int)elem1));

	}



	public static int Main()
	{
		  int i;
		  int j;
		  int k;
		  int m;
		  int n;
		  int[] a = new int[100000];
		  int[] b = new int[100000];

		  int ab;
		  int bb;
		  int ae;
		  int be;
		  int w;
		  int f;
		  n = 1;
		   while (n != 0)

		   {
			 String tempVar = ConsoleInput.scanfRead();
			 if (tempVar != null)
			 {
				 n = Integer.parseInt(tempVar);
			 }
			 if (n == 0)
			 {
			 break;
			 }

			 for (i = 0;i < n;i++) //????
			 {
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 a[i] = Integer.parseInt(tempVar2);
			 }
			 }

			 for (i = 0;i < n;i++)
			 {
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  b[i] = Integer.parseInt(tempVar3);
			  }
			 }

			qsort(a,n,(Integer.SIZE / Byte.SIZE),compare); //??
			qsort(b,n,(Integer.SIZE / Byte.SIZE),compare);



			ab = 0;
			bb = 0; //?????
			ae = n - 1;
			be = n - 1;
			w = 0;
			f = 0;

				while (ab <= ae)
				{
				if (a[ae] < b[be])
				{
					  f++;
						ae--;
						bb++;
				}
				  else
				  {
						 if (a[ae] > b[be])
						 {
								  w++;
								  ae--;
								  be--;
						 }
						 else
						 {
							  if (a[ab] > b[bb])
							  {
								w++;
								ab++;
								bb++;

							  }
							  else
							  {
								  if (a[ab] < b[bb])
								  {
									  f++;
									  ae--;
									  bb++;



								  }
								  else
								  {
									  if (a[ae] < b[bb])
									  {
										  f++;
									  ae--;
									  bb++;
									  }
									  else
									  {
										ae--;
										bb++;
									  }



								  }




							  }




						 }





				  }













				}




		/* for(i=0;i<n;i++)
		 printf("%d ",a[i]);
		 printf("\n");
		  for(i=0;i<n;i++)
		 printf("%d ",b[i]);*/

		 System.out.printf("%d\n",200 * (w - f));








		   }












		return 0;

	}

}

