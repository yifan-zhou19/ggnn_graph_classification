package <missing>;

public class GlobalMembers
{
	/*****************?????***************
	?????
	*****************************************/
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int age; //??????
		int[] a = new int[5]; //??????
		a[1] = a[2] = a[3] = a[4] = 0;
		for (int i = 0;i < n;i++)
		{
			age = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (age <= 18)
			{
				a[1]++;
			}
			else
			{
				 if (age <= 35)
				 {
					 a[2]++;
				 }
				 else
				 {
					  if (age <= 60)
					  {
						  a[3]++;
					  }
					  else
					  {
						  a[4]++;
					  }
				 }
			}
			//cout<<a[1]<<a[2]<<a[3]<<a[4]<<endl;???? 
		}
		double[] per = new double[5];
		for (int i = 1;i < 5;i++)
		{
			per[i] = (double)a[i] / n * 100;
		}
		System.out.print("1-18: ");
		System.out.printf("%.2f",per[1]);
		System.out.print("%");
		System.out.print("\n");
		System.out.print("19-35: ");
		System.out.printf("%.2f",per[2]);
		System.out.print("%");
		System.out.print("\n");
		System.out.print("36-60: ");
		System.out.printf("%.2f",per[3]);
		System.out.print("%");
		System.out.print("\n");
		System.out.print("60??: ");
		System.out.printf("%.2f",per[4]);
		System.out.print("%");
		System.out.print("\n");
		return 0;
	}

}

