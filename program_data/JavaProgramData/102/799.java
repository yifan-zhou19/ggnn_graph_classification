package <missing>;

public class GlobalMembers
{
	/*************************************************************************************************************
	* @file .cpp
	* @author ????
	* @date 11.01
	* @description
	*         
	*/


	public static int Main()
	{
		int j = 0;
		int k = 0;
		int i;
		int m;
		int n;
		int l;
		String gender = new String(new char[7]);
		float temp;
		float[] female = new float[40];
		float[] male = new float[40];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 0; i < n; i++)
		{
			gender = ConsoleInput.readToWhiteSpace(true).charAt(0);
			if (gender.length() == 6)
			{
				female[j] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
				j++;
			}
			if (gender.length() == 4)
			{
				male[k] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
				k++;
			}
		}
		for (m = 0; m < k; m++)
		{
			for (l = m + 1; l < k; l++)
			{
				if (male[m] > male[l])
				{
					temp = male[m];
					male[m] = male[l];
					male[l] = temp;
				}
			}
		}
		for (m = 0; m < j; m++)
		{
			for (l = m + 1; l < j; l++)
			{
				if (female[m] < female[l])
				{
					temp = female[m];
					female[m] = female[l];
					female[l] = temp;
				}
			}
		}
		System.out.printf("%.2f",male[0]);
		for (i = 1; i < k; i++)
		{
			System.out.print(" ");
			System.out.printf("%.2f",male[i]);
		}
		for (i = 0; i < j; i++)
		{
			System.out.print(" ");
			System.out.printf("%.2f",female[i]);
		}
		return 0;
	}

}

