package <missing>;

public class GlobalMembers
{
	//************************************
	//***????????**
	//***??????**
	//***???2012.10.4**
	//************************************
	public static int Main()
	{
		int n; //??n?????
		int i;
		double[] M = new double[4]; //??M[]????????,y[]??????,m[]???????,??m[]????0
		double[] y = new double[100];
		double[] m = {0, 0, 0, 0};
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0 ; i < n ; i++)
		{
			y[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			if (y[i] <= 18) //?y[i]???18
			{
				m[0]++; //m[0]????1
			}
			else if (y[i] <= 35) //?y[i]?[19,35]?
			{
				m[1]++; //m[1]????1
			}
			else if (y[i] <= 60) //?y[i]?[36,60]?
			{
				m[2]++; //m[2]????1
			}
			else //???y[i]??60
			{
				m[3]++; //m[3]????1
			}
		}
		for (i = 0 ; i < 4 ; i++)
		{
			M[i] = (m[i] * 100) / n; //???????????
		}
		System.out.printf("%.2f", "1-18: ");
		System.out.printf("%.2f", M[0]);
		System.out.printf("%.2f", "%");
		System.out.printf("%.2f", "\n");
		System.out.printf("%.2f", "19-35: ");
		System.out.printf("%.2f", M[1]);
		System.out.printf("%.2f", "%");
		System.out.printf("%.2f", "\n");
		System.out.printf("%.2f", "36-60: ");
		System.out.printf("%.2f", M[2]);
		System.out.printf("%.2f", "%");
		System.out.printf("%.2f", "\n");
		System.out.printf("%.2f", "60??: ");
		System.out.printf("%.2f", M[3]);
		System.out.printf("%.2f", "%");
		System.out.printf("%.2f", "\n");
		return 0;
	}

}

