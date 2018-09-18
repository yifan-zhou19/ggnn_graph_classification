package <missing>;

public class GlobalMembers
{
	//******************************
	//??????                 *
	//??????                 *
	//???2011.10.21             *
	//******************************
	public static int Main()
	{

	 int[] a = new int[20];
	 while (true)
	 {
		 a[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 if (a[0] != -1)
		 {

			 int i;
			 int k;
			 int m;
			 int num = 0;

			 for (i = 1; ; i++)

			 {

				 a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

				 if (a[i] == 0)
				 {
					 break;
				 }

			 }

			 for (k = 0;k <= i - 2;k++)
			 {
				for (m = k + 1;m <= i - 1;m++)
				{
				  if ((a[m] == (2 * a[k])) || (a[k] == (a[m] * 2)))
				  {
				  num++;
				  }
				}

			 }
			  System.out.print(num);
			  System.out.print("\n");

		 }
		 else
		 {
			break;
		 }

	 }
		 return 0;
	}

}

