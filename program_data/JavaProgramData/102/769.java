package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String sex = new String(new char[10]);
		int n = 0;
		int count = 0;
		int count1 = 0;
		int count2 = 0;
		int boy_num = 0;
		int girl_num = 0;
		double temp;
		double height;
		double[] boy = new double[40];
		double[] girl = new double[40];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (count = 0;count < n;++count)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sex = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				height = Double.parseDouble(tempVar3);
			}
			if (!strcmp(sex,"male"))
			{
				boy[boy_num] = height;
				boy_num++;
			}
			else
			{
				girl[girl_num] = height;
				girl_num++;
			}
		}
		//????  ?? 
		for (count1 = 0;count1 < boy_num;++count1)
		{
			for (count2 = 0;count2 < boy_num - count1 - 1;++count2)
			{
				if (boy[count2] > boy[count2 + 1])
				{
					temp = boy[count2];
					boy[count2] = boy[count2 + 1];
					boy[count2 + 1] = temp;
				}
			}
		}
		 //????  ??  
		for (count1 = 0;count1 < girl_num;++count1)
		{
			for (count2 = 0;count2 < girl_num - count1 - 1;++count2)
			{
				if (girl[count2] < girl[count2 + 1])
				{
					temp = girl[count2];
					girl[count2] = girl[count2 + 1];
					girl[count2 + 1] = temp;
				}
			}
		}
		for (count = 0;count < boy_num;++count)
		{
			System.out.printf("%.2f ",boy[count]);
		}
		for (count = 0;count < girl_num - 1;++count)
		{
			System.out.printf("%.2f ",girl[count]);
		}
		System.out.printf("%.2f",girl[count]);
	}

}

