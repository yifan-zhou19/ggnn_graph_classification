package <missing>;

public class GlobalMembers
{
	//********************************
	//*??  ?????          *****
	//*????? 1300012753     ***** 
	//*???2013.10.30          *****   
	//********************************
	public static int Main()
	{
		int[] a = new int[1001]; // a?????????b??????i????sum????????max??????
		int[] b = new int[1001];
		int i = 1;
		int sum = 0;
		int max = 0;
		char c; // c?????
		while ((a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			c = System.in.read();
			if (c != ',')
			{
			break;
			}
			i++;
		}
		b[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int j = 2; j <= i; j++)
		{
			c = System.in.read();
			b[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}

		// ?????????k????????? 
		for (int k = 1; k <= i; k++)
		{
			for (int t = 1; t <= i; t++)
			{
				if (a[k] >= a[t] != 0 && a[k] < b[t])
				{
				sum++;
				}
			}

			// ???k?????sum????????????? 
			if (max < sum)
			{
			max = sum;
			}
			sum = 0; //  sum????0
		}
		System.out.print(i);
		System.out.print(' ');
		System.out.print(max);
		return 0;
	}
}

