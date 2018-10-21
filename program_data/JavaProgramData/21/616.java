package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] Numbers = new double[500];
		double[] Temp = {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		double Ave = 0;
		double Sum = 0;
		double Max = 0;
		double Exchange = 0;
		int k = 0;
		int n = 0;
		int i = 0;
		int j = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			Numbers[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		 Sum += Numbers[i];
		}
		Ave = Sum / n;
		for (i = 0;i < n;i++)
		{
			if (Math.abs(Numbers[i] - Ave) > Max)
			{
			   Max = Math.abs(Numbers[i] - Ave);
			}
		}
	   for (i = 0;i < n;i++)
	   {
		   if (Math.abs(Math.abs(Numbers[i] - Ave) - Max) < 1e-5)
		   {
			 Temp[k] = Numbers[i];
		  k++;
		   }
	   }
	  if (k == 1)
	  {
			System.out.print(Temp[0]);
			System.out.print("\n");
	  }
	  else
	  {
			for (i = 0;i < k - 1;i++)
			{
			   for (j = 0;j < k - 1;j++)
			   {
				   if (Temp[j] > Temp[j + 1])
				   {
						  Exchange = Temp[j];
						 Temp[j] = Temp[j + 1];
						 Temp[j + 1] = Exchange;
				   }
			   }
			}
		 System.out.print(Temp[0]);
		 for (i = 1;i < k;i++)
		 {
			 System.out.print(",");
			 System.out.print(Temp[i]);
		 }
		 System.out.print("\n");
	  }




	return 0;
	}

}

