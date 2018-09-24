package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		float[] height = new float[40];
		float[] hmale = new float[40];
		float[] hfemale = new float[40];
		char[][] sex = new char[40][7];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 0; i < n; i++)
		{
			sex[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			height[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			System.in.read();
		}
		int k = 0;
		int m = 0;
		float t;
		for (i = 0; i < n; i++)
		{
			if (sex[i][0] == 'm')
			{
				hmale[m] = height[i];
				m++;
			}
			else
			{
				hfemale[k] = height[i];
				k++;
			}
		}
		for (i = 0; i < m - 1; i++)
		{
			for (j = 0; j < m - 1 - i; j++)
			{
			if (hmale[j] > hmale[j + 1])
			{
				t = hmale[j + 1];
				hmale[j + 1] = hmale[j];
				hmale[j] = t;
			}

			}
		}
		for (i = 0; i < k - 1; i++)
		{
			for (j = 0; j < k - 1 - i; j++)
			{

			if (hfemale[j] < hfemale[j + 1])
			{
				t = hfemale[j + 1];
				hfemale[j + 1] = hfemale[j];
				hfemale[j] = t;
			}
			}
		}
		for (i = 0; i < m; i++)
		{
			System.out.printf("%.2f ", hmale[i]);
		}
		for (i = 0; i < k - 1; i++)
		{
			System.out.printf("%.2f ", hfemale[i]);
		}
		System.out.printf("%.2f", hfemale[k - 1]);
		return 0;
	}

}

