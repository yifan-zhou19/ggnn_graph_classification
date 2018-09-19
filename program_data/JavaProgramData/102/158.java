package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num;
		int b = 0;
		int g = 0;
		double temp;
		char[][] sex =
		{
			{null, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		double[] h = {0.0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		double[] boy = {0.0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		double[] girl = {0.0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int i;
		int j;
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < num;i++)
		{
			sex[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			h[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < num;i++)
		{
			if (!strcmp(sex[i],"male"))
			{
				boy[b] = h[i];
				b++;
			}
			if (!strcmp(sex[i],"female"))
			{
				girl[g] = h[i];
				g++;
			}

		}
		for (i = 0;i < b - 1;i++)
		{
			for (j = i;j < b;j++)
			{
				if (boy[i] > boy[j])
				{
					temp = boy[j];
					boy[j] = boy[i];
					boy[i] = temp;
				}
			}
		}
		for (i = 0;i < g - 1;i++)
		{
			for (j = i;j < g;j++)
			{
				if (girl[i] < girl[j])
				{
					temp = girl[j];
					girl[j] = girl[i];
					girl[i] = temp;
				}
			}
		}
		for (i = 0;i < b;i++)
		{
			System.out.printf("%.2f ",boy[i]);
		}
		for (i = 0;i < g;i++)
		{
			System.out.printf("%.2f",girl[i]);
			if (i < g - 1)
			{
				System.out.print(" ");
			}
		}

		return 0;
	}
}

