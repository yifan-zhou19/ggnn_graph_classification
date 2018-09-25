package <missing>;

public class GlobalMembers
{
	//*************************
	//     ????
	//     ???  1300062709
	//    2013.10.28
	//**************************
	public static int Main()
	{
		int n;
		int i;
		int[] shousuo = new int[101];
		int[] shuzhang = new int[101];
		int t = 0;
		int max;
		int[] shijian = new int[101];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 1;i <= n;i++)
		{
			shousuo[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			shuzhang[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1;i <= n;i++)
		{
			if ((shousuo[i] >= 90) && (140 >= shousuo[i]) && (shuzhang[i] >= 60) && (90 >= shuzhang[i]))
			{
				t++;
				shijian[i] = t;
			}
			else
			{
				shijian[i] = t = 0;
			}
		}
		max = shijian[1];
		for (i = 1;i <= n;i++)
		{
		 if (max < shijian[i])
		 {
			max = shijian[i];
		 }
		}

		 System.out.printf("%d",max);
		return 0;
	}



}

