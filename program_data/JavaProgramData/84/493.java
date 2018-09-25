package <missing>;

public class GlobalMembers
{
	//******************************
	//*????jmyhhx.cpp*
	//*??????*
	//*?????2010?10?9?*
	//*?????????????*
	//****************************

	public static int Main()
	{
		int k = 0;
		int i = 0;
		int j = 0;
		int max = 0;
		int imax = 0;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		j = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		max = j;
		imax = j;
		for (i = 2;i <= k;i++)
		{
			j = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (j >= max)
			{
				max = j;
			}
			else
			{
			if (j >= imax)
			{
				imax = j;
			}
			}
		}
		System.out.print(max);
		System.out.print("\n");
		System.out.print(imax);
		System.out.print("\n");
		return 0;


	}
}

