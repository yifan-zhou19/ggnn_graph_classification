package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

			  int j;
			  int k;
			  int n;
			  int l;
			  int sum;
			  float GPA;
			  float bb;
			  int[] b = new int[10];
			  int[] a = new int[10];
			  float[] c = new float[10];


			  String tempVar = ConsoleInput.scanfRead();
			  if (tempVar != null)
			  {
				  n = Integer.parseInt(tempVar);
			  }

			   for (j = 0;j < n;j++)
			   {
				   String tempVar2 = ConsoleInput.scanfRead();
				   if (tempVar2 != null)
				   {
					   b[j] = Integer.parseInt(tempVar2);
				   }
			   }

					sum = 0;
					for (l = 0;l < n;l++)
					{

				   sum += b[l];
				   //printf("%d\n",sum);
					}



				for (k = 0;k < n;k++)
				{
				   String tempVar3 = ConsoleInput.scanfRead();
				   if (tempVar3 != null)
				   {
					   a[k] = Integer.parseInt(tempVar3);
				   }
				   if (a[k] < 60)
				   {
					   c[k] = 0F;
				   }
				   else if (a[k] <= 63)
				   {
				   c[k] = 1.0F;
				   }
				   else if (a[k] <= 67)
				   {
				   c[k] = 1.5F;
				   }
				   else if (a[k] <= 71)
				   {
				   c[k] = 2.0F;
				   }
				   else if (a[k] <= 74)
				   {
				   c[k] = 2.3F;
				   }
				   else if (a[k] <= 77)
				   {
				   c[k] = 2.7F;
				   }
				   else if (a[k] <= 81)
				   {
					c[k] = 3.0F;
				   }
					else if (a[k] <= 84)
					{
					c[k] = 3.3F;
					}
				   else if (a[k] <= 89)
				   {
				   c[k] = 3.7F;
				   }
					else if (a[k] <= 100)
					{
				   c[k] = 4.0F;
					}
				}

				   for (l = 0;l < n;l++)
				   {
				   bb = b[l] * c[l] + bb;
				   }

				   //printf("%d\n",sum);
				   //printf("%f\n",bb);

				   GPA = bb / sum;
					  System.out.printf("%.2f",GPA);
					  //scanf("%d",&n);     


				  return 0;

	}
}

