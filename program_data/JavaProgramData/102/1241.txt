package <missing>;

public class GlobalMembers
{
	//2013.11.17
	//zwb

	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int flag = 0;
		float t;
		float[] hm = new float[41];
		float[] hf = new float[41];
		String sex = new String(new char[7]);

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 1; i <= n; i++)
		{
			sex = ConsoleInput.readToWhiteSpace(true).charAt(0);
			if (sex.charAt(0) == 'm')
			{
				hm[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			}
			if (sex.charAt(0) == 'f')
			{
				hf[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			}
		}

		for (j = 1; j <= 40; j++)
		{
			for (k = 1; k <= 40; k++)
			{
				if (hm[k] > hm[k + 1])
				{
					t = hm[k];
					hm[k] = hm[k + 1];
					hm[k + 1] = t;
				}
			}
		}

		for (j = 0; j < 40; j++)
		{
			for (k = 0; k < 40 - j; k++)
			{
				if (hf[k] < hf[k + 1])
				{
					t = hf[k];
					hf[k] = hf[k + 1];
					hf[k + 1] = t;
				}
			}
		}

		for (j = 0; j <= 40; j++)
		{
			if (hm[j] != 0F && flag != 0)
			{
				System.out.printf("%.2f", " ");
				System.out.printf("%.2f", hm[j]);
			}
			if (hm[j] != 0F && flag == 0)
			{
				flag = 1;
				System.out.printf("%.2f", hm[j]);
			}
		}

		for (j = 0; j <= 40; j++)
		{
			if (hf[j] != 0F)
			{
				System.out.printf("%.2f", " ");
				System.out.printf("%.2f", hf[j]);
			}
		}

		System.out.printf("%.2f", "\n");

		return 0;
	}



}

