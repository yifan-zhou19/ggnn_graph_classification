package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[5];
		int[] b = new int[5];
		int i;
		int j;
		int k;
		int l;
		int m;
		int n;
		int s;
		for (i = 1;i < 6;i++)
		{
		  a[0] = i;
		for (j = 1;j < 6;j++)
		{
						a[1] = j;
						if (i != j)
						{
									   for (k = 1;k < 6;k++)
									   {
													   a[2] = k;
													   if (k != i && k != j)
													   {
																	 for (l = 1;l < 6;l++)
																	 {
																					 a[3] = l;
																					 if (l != i && l != j && l != k)
																					 {
																										 for (m = 1;m < 6;m++)
																										 {
																														 a[4] = m;
																														 if (m != i && m != j && m != k && m != l)
																														 {
																																				   s = 0;
																																				   if (a[4] != 2 && a[4] != 3)
																																				   {
																																				   b[0] = (a[4] == 1);
																																				   b[1] = (a[1] == 2);
																																				   b[2] = (a[0] == 5);
																																				   b[3] = (a[2] != 1);
																																				   b[4] = (a[3] == 1);
																																				   for (n = 0;n < 5;n++)
																																				   {
																																				   if (a[n] == 1 || a[n] == 2)
																																				   {
																																						 if (b[n] == 1)
																																						 {
																																				   s++;
																																						 }
																																				   }
																														 else
																														 {
																															 if (b[n] == 0)
																															 {
																																 s++;
																															 }
																														 }
																																				   }
																										 if (s == 5)
																										 {
																											 for (i = 0;i < 5;i++)
																											 {
																												  if (i < 4)
																												  {
																													  System.out.print(a[i]);
																													  System.out.print(" ");
																												  }
																												  if (i == 4)
																												  {
																													  System.out.print(a[i]);
																												  }
																											 }
																										 }
																																				   }
																														 }
																										 }
																					 }
																	 }
													   }
									   }
						}
		}
		}


		return 0;
	}

}
