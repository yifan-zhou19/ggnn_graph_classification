package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		float[] girl = new float[40];
		float[] boy = new float[40];
		int g = 0; //??????
		int b = 0;
		String tender = new String(new char[8]); //??
		for (i = 0;i < n;i++)
		{

			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				tender = tempVar2.charAt(0);
			}

			if (tender.charAt(0) == 'm') //???????????????
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					boy[b] = Float.parseFloat(tempVar3);
				}
				b++;
			}

			else //??????????
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					girl[g] = Float.parseFloat(tempVar4);
				}
				g++;
			}
		}
		for (i = g - 1;i > 0;i--) //??????????????
		{
			for (j = 0;j < i;j++)
			{

				 if (girl[j] < girl[j + 1])
				 {
				float temp;
				temp = girl[j];
				girl[j] = girl[j + 1];
				girl[j + 1] = temp;

				 }
			}
		}
		for (i = b - 1;i > 0;i--) //??????????????
		{
			for (j = 0;j < i;j++)
			{

				 if (boy[j] > boy[j + 1])
				 {
				float temp;
				temp = boy[j];
				boy[j] = boy[j + 1];
				boy[j + 1] = temp;

				 }
			}
		}


		for (i = 0;i < b;i++) //?????????
		{
			System.out.printf("%.2f ",boy[i]);
		}

		for (i = 0;i < g;i++) //?????????
		{
			System.out.printf("%.2f",girl[i]);
			if (i < g - 1)
			{
				System.out.print(" ");
			}
		}

	}

}

