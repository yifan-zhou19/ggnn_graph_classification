package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m = 0;
		int i;
		int j;
		int k;
		final String sex = "";
		float[] h = new float[40];
		float temp;
		String tsex = new String(new char[40]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sex = tangible.StringFunctions.changeCharacter(sex, i, tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				h[i] = Float.parseFloat(tempVar3);
			}
			if (sex.charAt(i)[0] == 'm')
			{
				m = m + 1;
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i;j < n - i;j++)
			{
				if (sex.charAt(j)[0] == 'm')
				{
					if (sex.charAt(j + 1)[0] == 'm' && h[j] > h[j + 1])
					{
						temp = h[j];
						h[j] = h[j + 1];
						h[j + 1] = temp;
					}
				}
				else if (sex.charAt(j)[0] == 'f')
				{
					if (sex.charAt(j + 1)[0] == 'm')
					{
						temp = h[j];
						h[j] = h[j + 1];
						h[j + 1] = temp;
						tsex = sex.charAt(j + 1);
						sex = tangible.StringFunctions.changeCharacter(sex, j + 1, sex.charAt(j));
						sex = tangible.StringFunctions.changeCharacter(sex, j, tsex);
					}
					else if (sex.charAt(j + 1)[0] == 'f' && h[j] < h[j + 1])
					{
						temp = h[j];
						h[j] = h[j + 1];
						h[j + 1] = temp;
					}

				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n - i;j++)
			{
				if (sex.charAt(j)[0] == 'm')
				{
					if (sex.charAt(j + 1)[0] == 'm' && h[j] > h[j + 1])
					{
						temp = h[j];
						h[j] = h[j + 1];
						h[j + 1] = temp;
					}
				}
				else if (sex.charAt(j)[0] == 'f')
				{
					if (sex.charAt(j + 1)[0] == 'm')
					{
						temp = h[j];
						h[j] = h[j + 1];
						h[j + 1] = temp;
						tsex = sex.charAt(j + 1);
						sex = tangible.StringFunctions.changeCharacter(sex, j + 1, sex.charAt(j));
						sex = tangible.StringFunctions.changeCharacter(sex, j, tsex);
					}
					else if (sex.charAt(j + 1)[0] == 'f' && h[j] < h[j + 1])
					{
						temp = h[j];
						h[j] = h[j + 1];
						h[j + 1] = temp;
					}

				}
			}
		}
		for (k = 0,i = 0;i < 40;i++)
		{
			if (h[i] != 0F && k != 0)
			{
			System.out.printf(" %.2f", h[i]);
			k++;
			}
			else if (h[i] != 0F && k == 0)
			{
				System.out.printf("%.2f",h[i]);
				k++;
			}

		}
		return 0;
	}
}

