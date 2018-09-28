package <missing>;

public class GlobalMembers
{
	/****************
	?????????
	???????
	****************/
	public static int Main()
	{
		int n; //??????n,i,j
		int i;
		int j;

		double[] x = new double[10000]; //???????????
		double[] y = new double[10000];
		double[] dis = new double[10000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			x[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			y[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}

		int k = 1;
		for (i = 1;i <= n;i++) //???????n???
		{
			 for (j = 1;j <= n;j++) //?????

			 {
					 dis[k] = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j])); //?????????
					 k = k + 1; //?k??1
			 }

		}





		double max = 0; //???max


		for (k = 1;k <= 10000;k++) //????
		{



				 if (max < dis[k]) //???????????
				 {
					 max = dis[k];
				 }
		}



		System.out.printf("%.4f\n",max); //??????????????????
		return 0;
	}
}

