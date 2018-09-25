package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  for (;;)
		  {
		  int n;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  if (n == 0)
		  {
		  break;
		  }
		  int[] a = new int[n]; //b???????a??????
		  int[] b = new int[n];
		  int swap;
		  for (int i = 0;i < n;i++)
		  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  b[i] = Integer.parseInt(tempVar2);
		  }
		  }
		  for (int i = 0;i < n;i++)
		  {
		  for (int j = i;j < n;j++)
		  {
				  if (b[i] > b[j])
				  {
							   swap = b[i];
							   b[i] = b[j];
							   b[j] = swap;
				  }
		  }
		  }
		  for (int i = 0;i < n;i++)
		  {
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  a[i] = Integer.parseInt(tempVar3);
		  }
		  }
		  for (int i = 0;i < n;i++)
		  {
		  for (int j = i;j < n;j++)
		  {
				  if (a[i] > a[j])
				  {
							   swap = a[i];
							   a[i] = a[j];
							   a[j] = swap;
				  }
		  }
		  }
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		  int * a1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		  int * a2;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		  int * b1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		  int * b2;
		  a1 = a[0];
		  a2 = a[n - 1];
		  b1 = b[0];
		  b2 = b[n - 1];
		  int count1 = 0;
		  int count0 = 0;
		  for (;;)
		  {

				 if (b1 == b2 + 1)

				 {
					break;
				 }
				 if (*(a1) < *(b1))
				 {

									  a1++;
									  b1++;
									  count1++;
				 }
				 else
				 {
				 if (*a1 > *b1)
				 {


								 b1++;
								 a2--;

				 }
				 else
				 {
				 if (*a1 == *b1)
				 {
						if (*a2 < *b2)
						{
								   a2--;
								   b2--;
								   count1++;


						}
						else if (*a2 > *b2)
						{
									b1++;
									a2--;

						}
						else if (*a2 == *b2)
						{
							 if (*a2 == *b1)
							 {
							 count0++;
							 }
							 a2--;
							 b1++;
						}


				 }
				 }
				 }



							/* if(*a2<*b2)
							 {
							            count1++;
							            a2--;
							            b2--;
							 }
							 if(*a2>*b2)
							 {
							        a2--;
							 }
							 if(*a2==*b2)
							 {
							             count2++;
							 }*/

		  }
		  System.out.printf("%d\n",(count1 * 200 - (n - count0 - count1) * 200));
		  }
	}

}

