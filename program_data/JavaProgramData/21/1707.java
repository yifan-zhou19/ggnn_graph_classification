package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k = 0;
		int n;
		int[] a = new int[300];
		int[] num = new int[5];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double sum = 0;
		double ave;
		for (i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sum += a[i];
		}
		ave = sum / n;
		int flag = 0;
		for (i = 0; i < n; i++)
		{
			 for (j = 0; j < n; j++)
			 {
				  if (Math.abs(ave - a[i]) < Math.abs(ave - a[j]))
				  {
					   break;
				  }
			 }
			 if (j == n)
			 {
				  num[k++] = a[i];
			 }
		}
		if (k == 1)
		{
			  System.out.print(num[0]);
			  System.out.print("\n");
		}
		if (k == 2)
		{
			if (num[0] > num[1])
			{
				System.out.print(num[1]);
				System.out.print(",");
				System.out.print(num[0]);
				System.out.print("\n");
			}
			else
			{
				System.out.print(num[0]);
				System.out.print(",");
				System.out.print(num[1]);
				System.out.print("\n");
			}
		}
		return 0;
	}




}

