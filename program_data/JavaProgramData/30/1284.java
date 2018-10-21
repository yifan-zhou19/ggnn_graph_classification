package <missing>;

public class GlobalMembers
{
	/**
	 * @file    3.cpp              
	 * @author  ??? 1100013230               
	 * @date    2011-9-29         
	 * @descrption        
	 *          ????????7??????        
	*/
	public static int Main()
	{
		int n; // sum??7??????
		int m;
		int sum;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sum = 0;
		for (m = 1; m <= n; m = m + 1)
		{
			if (m % 10 == 7 || m % 7 == 0 || m / 10 == 7) // ????7?????sum??
			{
				sum = sum;
			}
			else // ????7???sum????????
			{
				sum = sum + m * m;
			}
		}
		System.out.print(sum);
		return 0;
	}
}

