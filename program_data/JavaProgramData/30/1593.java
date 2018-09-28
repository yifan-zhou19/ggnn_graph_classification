package <missing>;

public class GlobalMembers
{
	/**
	*@file 3.cpp
	*@author ???
	*@date 2013-10-10
	*@description ?7???????
	*/

	public static int Main()
	{
		int n;
		int i;
		int sum;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		i = 1;
		sum = 0;
	 while (i <= n)
	 {
		if (i % 10 != 7 && i % 7 != 0 && i / 10 != 7)
		{
			sum += i * i;
		}
		i++;
	 }
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}

}

