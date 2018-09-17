package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		float h;
		String str = new String(new char[10]);
		int k = 0;
		int j = 0;
		float[] male = new float[40];
		float[] famale = new float[40];
		male[0] = 0F;
		famale[0] = 0F;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int len;
		for (i = 1;i <= n;i++)
		{
			str = ConsoleInput.readToWhiteSpace(true).charAt(0);
			h = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			len = str.length();
			if (len == 4)
			{
						  k++;
						  male[k] = h;
			}
			else
			{
						  j++;
						  famale[j] = h;
			}
		}
			int p;
			int q;
			float temp;
			for (p = 1;p <= k - 1;p++)
			{
				for (q = 1;q <= k - p;q++)
				{
					if (male[q] > male[q + 1])
					{
										  temp = male[q + 1];
										  male[q + 1] = male[q];
										  male[q] = temp;
					}
				}
			}
			for (p = 1;p <= j - 1;p++)
			{
				for (q = 1;q <= j - p;q++)
				{
					if (famale[q] > famale[q + 1])
					{
										  temp = famale[q + 1];
										  famale[q + 1] = famale[q];
										  famale[q] = temp;
					}
				}
			}
			System.out.printf("%.2f",male[1]);
			for (p = 2;p <= k;p++)
			{
				System.out.print(" ");
				System.out.printf("%.2f",male[p]);

			}
			for (q = j;q >= 1;q--)
			{
				System.out.print(" ");
				System.out.printf("%.2f",famale[q]);
			}


			return 0;
	}
}

