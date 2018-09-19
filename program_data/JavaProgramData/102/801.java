package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] sex = new char[41][7];
		float[] height = new float[41];
		float[] b = new float[41];
		float t;
		float s;
		int n;
		int i;
		int j;
		int countM = 0;
		int countF = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			sex[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			height[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			if (sex[i][0] == 'm')
			{
				countM++;
				b[countM] = height[i];
			}
			 else
			 {
				countF++;
				b[n + 1 - countF] = height[i];
			 }
		}
		for (i = 1; i < countM; i++)
		{
			for (j = i + 1; j <= countM; j++)
			{
				if (b[i] > b[j])
				{
					s = b[i];
					b[i] = b[j];
					b[j] = s;
				}
			}
		}
		for (i = countM + 1; i < n; i++)
		{
			for (j = i + 1; j <= n; j++)
			{
				if (b[i] < b[j])
				{
					t = b[i];
					b[i] = b[j];
					b[j] = t;
				}
			}
		}
		for (i = 1; i < n; i++)
		{
			System.out.printf("%.2f", b[i]);
			System.out.printf("%.2f", " ");
		}
		System.out.printf("%.2f", b[n]);
		System.out.printf("%.2f", "\n");
	return 0;
	}
}

