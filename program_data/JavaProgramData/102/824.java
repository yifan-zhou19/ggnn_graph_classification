package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; // n????
		int i;
		int j = 0;
		int k = 0;
		int r;
		int s;
		int u;
		int v;
		double height;
		double[] girl_height = new double[40];
		double[] boy_height = new double[40];
		double temp;
		String gender = new String(new char[6]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++) // ??????j??????k?????
		{
			gender = ConsoleInput.readToWhiteSpace(true).charAt(0);
			height = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			if (gender.charAt(0) == 'm')
			{
				boy_height[j] = height;
				j++;
			}
			else
			{
				girl_height[k] = height;
				k++;
			}
		}
		for (r = 0; r < j - 1; r++)
		{
			for (u = r + 1; u < j; u++)
			{
				if (boy_height[r] > boy_height[u])
				{
					temp = boy_height[r];
					boy_height[r] = boy_height[u];
					boy_height[u] = temp;
				}
			}
		}
		for (s = 0; s < k - 1; s++)
		{
			for (v = s + 1; v < k; v++)
			{
				if (girl_height[s] < girl_height[v])
				{
					temp = girl_height[s];
					girl_height[s] = girl_height[v];
					girl_height[v] = temp;
				}
			}
		}
		for (r = 0; r < j; r++)
		{
			System.out.printf("%.2f", boy_height[r]);
			System.out.printf("%.2f", " ");
		}
		for (r = 0; r < k - 1; r++)
		{
			System.out.printf("%.2f", girl_height[r]);
			System.out.printf("%.2f", " ");
		}
		System.out.printf("%.2f", girl_height[k - 1]);
		return 0;
	}


}

