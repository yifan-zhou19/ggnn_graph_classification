package <missing>;

public class GlobalMembers
{
	//**************************
	//?????	
	//?????
	//???2011.10.22
	//**************************
	public static int Main() //???
	{
		double[] a = new double[18]; //????
		int i; //????????
		int j;
		int k;
		int c;
		int d;
		double b; // ???????
		a[0] = 0;
		for (i = 1; ;i++)
		{
			a[1] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			if (a[1] == -1)
			{
				break; //??????
			}
			for (j = 2; ;j++) //????
			{
				a[j] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
				if (a[j] == 0)
				{
					break; //???0?????
				}
			}
			k = 0; //k????
			for (c = 1;c < j;c++) //?????
			{
				for (d = 1;d < j;d++)
				{
					b = a[c] / a[d];
					if (b == 2) //??????2
					{
						k++;
					}
				}
			}
			System.out.print(k);
			System.out.print("\n");
		}
		return 0;
	}

}

