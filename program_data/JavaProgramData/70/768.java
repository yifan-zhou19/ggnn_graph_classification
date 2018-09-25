package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int nInput = 0;
		int i;
		int j;
		double[] x = new double[100];
		double[] y = new double[100];
		double xDiff = 0.0;
		double yDiff = 0.0;
		double yMax = 0.0;
		int yPosition1 = 0.0;
		int yPosition2 = 0.0;
		int xMax = 0.0;
		int xPosition1 = 0.0;
		int xPosition2 = 0.0;


		nInput = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));



		for (i = 0; i < nInput; i++)
		{
			x[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			y[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}

		for (i = 0; i < nInput; i++)
		{
			for (j = 0; j < nInput; j++)
			{
					xDiff = x[i] - x[j];
					if (xDiff > xMax)
					{
						xMax = xDiff;
						xPosition1 = i;
						xPosition2 = j;

					}
			}
		}



		for (i = 0; i < nInput; i++)
		{
			for (j = 0; j < nInput; j++)
			{
					yDiff = y[i] - y[j];
					if (yDiff > yMax)
					{
						yMax = yDiff;
						yPosition1 = i;
						yPosition2 = j;

					}
			}
		}






			System.out.print("\n");


		if (yMax >= xMax)
		{
			System.out.print(Math.sqrt((y[yPosition1] - y[yPosition2]) * (y[yPosition1] - y[yPosition2]) + (x[yPosition1] - x[yPosition2]) * (x[yPosition1] - x[yPosition2])));
		}

		else
		{
			System.out.print(Math.sqrt((y[xPosition1] - y[xPosition2]) * (y[xPosition1] - y[xPosition2])) + (x[xPosition1] - x[xPosition2]) * (x[xPosition1] - x[xPosition2]));
		}



		return 0;



	}

}

