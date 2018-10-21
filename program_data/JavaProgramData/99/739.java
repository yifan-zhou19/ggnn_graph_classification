package <missing>;

public class GlobalMembers
{
	//************************
	//* 9.cpp
	//*   ?????
	//*  Created on: 2012-10-1
	//*  Author: ??   1200012934
	//*************************
	public static int Main() //???
	{

		//?????n?????i???????age????
		//????????????
		double n = 0;
		double i = 0;
		double age = 0;
		double num1_18 = 0;
		double num19_35 = 0;
		double num36_60 = 0;
		double num61_ = 0;
		n = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++) //??
		{
				age = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));

			  //?????????age???????
			if (age >= 1 && age <= 18)
			{
					num1_18 = num1_18 + 1;
			}
			else
			{
					if (age <= 35)
					{
						num19_35 = num19_35 + 1;
					}
				 else
				 {
						if (age <= 60)
						{
							num36_60 = num36_60 + 1;
						}
					else
					{
							num61_ = num61_ + 1;
					}
				 }
			}
		}
		System.out.printf("%.2f", "1-18: ");
		System.out.printf("%.2f", (double) num1_18 / n * 100);
		System.out.printf("%.2f", "%");
		System.out.printf("%.2f", "\n");
		System.out.printf("%.2f", "19-35: ");
		System.out.printf("%.2f", (double) num19_35 / n * 100);
		System.out.printf("%.2f", "%");
		System.out.printf("%.2f", "\n");
		System.out.printf("%.2f", "36-60: ");
		System.out.printf("%.2f", (double) num36_60 / n * 100);
		System.out.printf("%.2f", "%");
		System.out.printf("%.2f", "\n");
		System.out.printf("%.2f", "60??: ");
		System.out.printf("%.2f", (double) num61_ / n * 100);
		System.out.printf("%.2f", "%");
		return 0;
	} //?????
}

