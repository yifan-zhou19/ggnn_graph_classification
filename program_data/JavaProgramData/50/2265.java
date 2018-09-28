package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int w;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  w = Integer.parseInt(tempVar);
		  }

		  int[] day = new int[13];

		  day[1] = 31;
		   day[2] = 28;
			day[3] = 31;
			 day[4] = 30;
			  day[5] = 31;
			   day[6] = 30;
				day[7] = 31;
				 day[8] = 31;
				  day[9] = 30;
				   day[10] = 31;
					day[11] = 30;
					 day[12] = 31;

	for (int i = 1;i <= 12;i++)
	{

			 if ((13 + w - 1) % 7 == 5)
			 {
				 System.out.printf("%d\n",i);
			 }
			 w = (w + day[i]) % 7;
	}

	}

}

