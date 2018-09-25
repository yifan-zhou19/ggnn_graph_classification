package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a1 = 0;
		int a19 = 0;
		int a36 = 0;
		int a61 = 0;
		int a;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= n;i++) //???????
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a <= 18)
			{
				a1++; //??????????
			}
			else
			{
				if (a <= 35)
				{
					a19++;
				}
				else
				{
					if (a <= 60)
					{
						a36++;
					}
					else
					{
						a61++;
					}
				}
			}
		}
		System.out.printf("1-18: %.2f%%\n19-35: %.2f%%\n36-60: %.2f%%\n60??: %.2f%%\n",((float)a1) / n * 100,((float)a19) / n * 100,((float)a36) / n * 100,((float)a61) / n * 100);
		//?????
		return 0;
	}
}

