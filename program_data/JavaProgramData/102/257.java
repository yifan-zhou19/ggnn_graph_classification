package <missing>;

public class GlobalMembers
{
	//****************************************
	//*   ????                           *
	//*   ??????                       *
	//*   ?????2011?10?30?           *
	//****************************************


	public static int Main()
	{
		int n;
		int i;
		int j;
		int numm;
		int numf;
		double Height;
		double[] Heightm = new double[40];
		double[] Heightf = new double[40];
		double p;
		String sex = new String(new char[7]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		numm = 0; //numm??????
		numf = 0; //numf??????
		for (i = 1; i <= n;i++)
		{
			sex = ConsoleInput.readToWhiteSpace(true).charAt(0);
			Height = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			if (sex.length() == 4)
			{
				numm++;
				Heightm[numm] = Height;
			}
			else
			{
				numf++;
				Heightf[numf] = Height;
			}
		} //??????,??????????????
		for (i = 1; i < numm;i++)
		{
			for (j = i + 1;j <= numm; j++)
			{
				if (Heightm[i] > Heightm[j])
				{
					p = Heightm[i];
					Heightm[i] = Heightm[j];
					Heightm[j] = p;
				}
			}
		} //??????,???????
		for (i = 1; i <= numm; i++)
		{
			System.out.printf("%.2f", Heightm[i]);
			System.out.printf("%.2f", " ");
		}
		for (i = 1; i < numf;i++)
		{
			for (j = i + 1;j <= numf; j++)
			{
				if (Heightf[i] < Heightf[j])
				{
					p = Heightf[i];
					Heightf[i] = Heightf[j];
					Heightf[j] = p;
				}
			}
		} //??????,???????
		for (i = 1; i <= numf; i++)
		{
			if (i < numf)
			{
				System.out.printf("%.2f", Heightf[i]);
				System.out.printf("%.2f", " ");
			}
			else
			{
				System.out.printf("%.2f", Heightf[i]);
				System.out.printf("%.2f", "\n");
			}
		}
		return 0;
	}
}

