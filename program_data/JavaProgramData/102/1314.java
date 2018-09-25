package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] s = new char[50][20];
		final String man = "male";
		final String wman = "female";
		double[] l = new double[50];
		double temp;
		int n;
		int i;
		int j;
		int tip;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			s[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			l[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0; i < n - 1; i++)
		{
		for (j = i + 1; j < n; j++)
		{
			if (strcmp(s[i], man) == 0 && strcmp(s[j], man) == 0 && l[i] > l[j])
			{
				temp = l[i];
				l[i] = l[j];
				l[j] = temp;
			}

		}
		}
		for (i = 0; i < n - 1; i++)
		{
		for (j = i + 1; j < n; j++)
		{
			if (strcmp(s[i], wman) == 0 && strcmp(s[j], wman) == 0 && l[i] < l[j])
			{
				temp = l[i];
				l[i] = l[j];
				l[j] = temp;
			}

		}
		}
		for (i = n - 1; i >= 0; i--)
		{
			if (strcmp(s[i], wman) == 0)
			{
				tip = i;
				break;
			}
		}
		for (i = 0; i < n; i++)
		{
			if (strcmp(s[i], man) == 0)
			{
				System.out.printf("%.2f", l[i]);
				System.out.printf("%.2f", " ");
			}
		}
		for (i = 0; i < tip; i++)
		{
			if (strcmp(s[i], wman) == 0)
			{
				System.out.printf("%.2f", l[i]);
				System.out.printf("%.2f", " ");
			}
		}
		System.out.printf("%.2f", l[tip]);
		System.out.printf("%.2f", "\n");
		return 0;
	}

}

