package <missing>;

public class GlobalMembers
{
	 //**********************************//
	 //*     ?????					*//
	 //*     ???1000012711			*//
	 //*     ????????			*//
	 //*     ???2010.10.28			*//
	 //**********************************// 
	public static int Main()
	{
		int n; //n?n? i????
		int i;
		double a; //a,b?????????? per???????????? per0???????
		double b;
		double per;
		double per0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			if (i == 1) //?i?1? ???????? ???????????
			{
				per = b / a;
			}
			else //?????????????
			{
				per0 = b / a;
			}
			if (i >= 2) //i?1?  ????????
			{
				if (per - per0 > 0.05) //????????????0.05? ???worse
				{
					System.out.print("worse");
					System.out.print("\n");
				}
				else
				{
					if (per - per0 < -0.05.getValue() != 0) //??
					{
						System.out.print("better");
						System.out.print("\n");
					}
					else
					{
						System.out.print("same");
						System.out.print("\n");
					}
				}
			}
		}
		return 0;
	}

}

