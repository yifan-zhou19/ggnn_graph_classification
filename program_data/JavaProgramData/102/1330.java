package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int num1 = 1;
		int num2 = 1;
		float t = 0F;
		char[] gender = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		float[][] h = new float[3][50];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			gender = ConsoleInput.readToWhiteSpace(true).charAt(0);
			if (gender.length() == 4)
			{
				h[1][num1], num1++ = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			else
			{
				h[2][num2], num2++ = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 1; i <= num1 - 2; i++)
		{
			for (j = 1; j <= num1 - 1 - i; j++)
			{
				if (h[1][j] > h[1][j + 1])
				{
					t = h[1][j], h[1][j] = h[1][j + 1], h[1][j + 1] = t;
				}
			}
		}
		for (i = 1; i <= num2 - 2; i++)
		{
			for (j = 1; j <= num2 - 1 - i; j++)
			{
				if (h[2][j] < h[2][j + 1])
				{
					t = h[2][j], h[2][j] = h[2][j + 1], h[2][j + 1] = t;
				}
			}
		}
		for (i = 1; i <= num1 - 1; i++)
		{
			System.out.printf("%.2f", h[1][i]);
			System.out.printf("%.2f", " ");
		}
		for (i = 1; i <= num2 - 2; i++)
		{
			System.out.printf("%.2f", h[2][i]);
			System.out.printf("%.2f", " ");
		}
		System.out.printf("%.2f", h[2][num2 - 1]);
		System.out.printf("%.2f", "\n");
		return 0;
	}
}

