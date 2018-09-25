package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //n????a??????,ci????
		int a;
		int c1;
		int c2;
		int c3;
		int c4;
		c1 = c2 = c3 = c4 = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (int i = 0;i < n;i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a <= 18)
			{
				c1++;
			}
			else if (a <= 35)
			{
				c2++;
			}
			else if (a <= 60)
			{
				c3++;
			}
			else
			{
				c4++;
			}
		}
		float s = c1 + c2 + c3 + c4;

		System.out.printf("1-18: %.2f%c\n",c1 / s * 100,'%');
		System.out.printf("19-35: %.2f%c\n",c2 / s * 100,'%');
		System.out.printf("36-60: %.2f%c\n",c3 / s * 100,'%');
		System.out.printf("60??: %.2f%c\n",c4 / s * 100,'%');


		return 0;
	}

}

