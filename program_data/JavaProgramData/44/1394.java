package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int b;
	int i;
	int inverse = int num;
	for (i = 0;i < 6;i++)
	{
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   a = Integer.parseInt(tempVar);
	   }
	   if (a >= 0)
	   {
	   b = inverse(a);
	   System.out.printf("%d\n",b);
	   }
		 else
		 {
			   b = inverse(a);
			   System.out.printf("-%d\n",b);
		 }
	}
	return 0;
	}

	public static int inverse(int num)
	{
		int ge;
		int shi;
		int bai;
		int qian;
		int wan;
		int num2;
		int fu;
		if (num >= 0)
		{
				  wan = (int)(num / 1e4);
				  qian = (int)((num - wan * 1e4) / 1000);
				  bai = (int)((num - wan * 1e4 - qian * 1e3) / 100);
				  shi = (int)((num - wan * 1e4 - qian * 1e3 - bai * 1e2) / 10);
				  ge = (int)(num - wan * 1e4 - qian * 1e3 - bai * 1e2 - 10 * shi);
				  if (10000 <= num != 0 && num <= 99999)
				  {
				  num2 = (int)(wan + 10 * qian + 1e2 * bai + 1e3 * shi + 1e4 * ge);
				  }
					else
					{
						  if (1000 <= num != 0 && num <= 9999)
						  {
							num2 = (int)(qian + 10 * bai + 1e2 * shi + 1e3 * ge);
						  }
							else
							{
								  if (999 >= num != 0 && 100 <= num)
								  {
									 num2 = (int)(ge * 1e2 + shi * 10 + bai);
								  }
									 else
									 {
										   if (10 <= num != 0 && num <= 99)
										   {
											 num2 = (int)(ge * 10 + shi);
										   }
											 else
											 {
												   num2 = ge;
											 }
									 }
							}
					}
		}
				  else
				  {
				  num = 0 - num;
				  wan = (int)(num / 1e4);
				  qian = (int)((num - wan * 1e4) / 1000);
				  bai = (int)((num - wan * 1e4 - qian * 1e3) / 100);
				  shi = (int)((num - wan * 1e4 - qian * 1e3 - bai * 1e2) / 10);
				  ge = (int)(num - wan * 1e4 - qian * 1e3 - bai * 1e2 - 10 * shi);
				  if (10000 <= num != 0 && num <= 99999)
				  {
				  num2 = (int)(wan + 10 * qian + 1e2 * bai + 1e3 * shi + 1e4 * ge);
				  }
					else
					{
						  if (1000 <= num != 0 && num <= 9999)
						  {
							num2 = (int)(qian + 10 * bai + 1e2 * shi + 1e3 * ge);
						  }
							else
							{
								  if (999 >= num != 0 && 100 <= num)
								  {
									 num2 = (int)(ge * 1e2 + shi * 10 + bai);
								  }
									 else
									 {
										   if (10 <= num != 0 && num <= 99)
										   {
											 num2 = (int)(ge * 10 + shi);
										   }
											 else
											 {
												   num2 = ge;
											 }
									 }
							}
					}
				  }
		return (num2);
	}

}

