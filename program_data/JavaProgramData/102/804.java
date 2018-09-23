package <missing>;

public class GlobalMembers
{
	/*************************
	 ***??:??? 1200012776
	 ***????:????
	 ***??:2012?11?1?
	 *************************/
	public static int Main()
	{
		int i;
		int j;
		int n;
		int num_male = 0;
		int num_female = 0;
		char[][] sex = new char[41][8];
		final String man = "male";
		final String woman = "female";
		float[] h = new float[41];
		float t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			sex[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			if (!(strcmp(sex[i],man))) //??sex[i]?man???
			{
				num_male++; //???,??num_male??
				h[num_male] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			}
			else //??????
			{
				num_female++; //???????
				h[n + 1 - num_female] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 1; i <= num_male - 1; i++) //???????????
		{
			for (j = i; j <= num_male; j++)
			{
				if (h[i] > h[j])
				{
					t = h[i];
					h[i] = h[j];
					h[j] = t;
				}
			}
		}
		for (i = n; i >= num_male + 2; i--) //???????????
		{
			for (j = i - 1; j >= num_male + 1; j--)
			{
				if (h[i] > h[j])
				{
					t = h[i];
					h[i] = h[j];
					h[j] = t;
				}
			}
		}
		System.out.printf("%.2f", h[1]);
		for (i = 2; i <= n; i++)
		{
			System.out.printf("%.2f", " ");
			System.out.printf("%.2f", h[i]);
		}
		return 0;
	}
}

