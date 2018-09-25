package <missing>;

public class GlobalMembers
{
	  public static int Main()
	  {
		  double[] high = new double[40];
		  double[] manhigh = new double[40];
		  double[] womanhigh = new double[40];
		  double sa;
		  char[][] sex = new char[40][10];
		  int n;
		  int i;
		  int j;
		  int k;
		  int a;
		  char[] man = {'m', 'a', 'l', 'e', '\0'};
		  char[] woman = {'f', 'e', 'm', 'a', 'l', 'e', '\0'};
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
				sex[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				high[i] = Double.parseDouble(tempVar3);
			}
		  }
		  j = 0;
		  k = 0;
		  for (i = 0;i < n;i++)
		  {
			if (strcmp(sex[i],man) == 0)
			{
			  manhigh[j] = high[i];
			  j++;
			}
			else
			{
			  womanhigh[k] = high[i];
			  k++;
			}
		  }
		  for (i = 0;i < j - 1;i++)
		  {
			 for (a = 0;a < j - 1 - i;a++)
			 {
				if (manhigh[a] > manhigh[a + 1])
				{
				  sa = manhigh[a];
				  manhigh[a] = manhigh[a + 1];
				  manhigh[a + 1] = sa;
				}
			 }
		  }
		  for (i = 0;i < k - 1;i++)
		  {
			 for (a = 0;a < k - 1 - i;a++)
			 {
				if (womanhigh[a] > womanhigh[a + 1])
				{
				  sa = womanhigh[a];
				  womanhigh[a] = womanhigh[a + 1];
				  womanhigh[a + 1] = sa;
				}
			 }
		  }
		  for (i = 0;i < j;i++)
		  {
			System.out.printf("%.2lf ",manhigh[i]);
		  }
		  if (k == 1)
		  {
			 System.out.printf("%.2lf",womanhigh[0]);
		  }
		  else
		  {
		   for (i = k - 1;i > 0;i--)
		   {
			 System.out.printf("%.2lf ",womanhigh[i]);
		   }
		   System.out.printf("%.2lf",womanhigh[0]);
		  }

		return 0;
	  }

}

