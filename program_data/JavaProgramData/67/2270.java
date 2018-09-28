package <missing>;

public class GlobalMembers
{
	//***************************
	//* @author ??          **
	//* @date 2012-09-26       ** 
	//* @description ?????   **
	//***************************
	public static int Main() //?????
	{
		int n; //????
		int[] x = new int[100];
		int[] y = new int[100];
		int[] c = new int[100];
		int i;
		double a; //????
		double b;
		//cout<<"???????????"<<endl; //??
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		x[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = (double) y[1] / x[1];
		for (i = 2 ; i <= n ; i++) //????
		{
			x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			y[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = (double) y[i] / x[i];
			if (b < a - 0.05) //??????
			{
				c[i] = 0;
			}

			else if (b >= a - 0.05 && b <= a + 0.05) //??????
			{
				c[i] = 1;
			}

			else //??????
			{
				c[i] = 2;
			}

		}
		for (i = 2 ; i <= n ; i++) //????
		{
			if (c[i] == 0) //??????
			{
				System.out.print("worse");
				System.out.print("\n");
			}
			else if (c[i] == 1) //??????
			{
				System.out.print("same");
				System.out.print("\n");
			}
			else //??????
			{
				System.out.print("better");
				System.out.print("\n");
			}
		}
		 return 0; //?????
	}





}

