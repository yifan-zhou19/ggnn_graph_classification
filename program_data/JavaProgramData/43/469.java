package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int oushu;
		int xiao;
		int da;
		int i;
		int j;
		int panduan;
		oushu = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (xiao = 3;xiao <= oushu / 2;xiao++)
		{
											 panduan = 0;
											 da = oushu - xiao;
											 for (i = 2;i < xiao;i++)
											 {
																		 if (xiao % i == 0)
																		 {
																			 panduan++; //??????????? ??????panduan??
																		 }
											 }
											 for (j = 2;j < da;j++)
											 {
																	   if (da % j == 0)
																	   {
																		   panduan++; //?????????????????panduan??
																	   }
											 }
											 if (panduan == 0)
											 {
												 System.out.print(xiao);
												 System.out.print(" ");
												 System.out.print(da);
												 System.out.print("\n");
											 }

		}
	System.in.read();
	System.in.read();
	System.in.read();
	return 0;
	}

}

