package <missing>;

public class GlobalMembers
{
	//***********************
	// ?????????  ** 
	// ?  ?: ???      ** 
	// ?  ?: 2012/11/18  ** 
	//*********************** 
	public static int Main()
	{
		int a;
		int[] month = {0, 13, 44, 72, 103, 133, 164, 194, 225, 256, 286, 317, 347};
		int w;
		int i;
		w = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= 12; i++)
		{
			if ((month[i] + w - 1) % 7 == 5)
			{
			   System.out.print(i);
			   System.out.print("\n");
			}
		}
		return 0;
	}
}

