package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String juzi = new String(new char[NUM * LEN]);
		char[][] danci = new char[NUM][LEN];
		int i;
		int k;
		int index;
		int maxLenDanCiIndex = 0;
		int minLenDanCiIndex = 0;
		juzi = new Scanner(System.in).nextLine();
	index = 0;
	for (i = 0; ; i++)
	{
		for (k = 0; ;)
		{
			if (juzi.charAt(index) != ' ' && juzi.charAt(index) != 0)
			{
				danci[i][k] = juzi.charAt(index);
				index++;
				k++;
			}
			else
			{
				danci[i][k] = 0;
				index++;
				k++;
				break;
			}
		}
		if (juzi.charAt(index - 1) == 0)
		{
			break;
		}
	}

	for (k = 1; k <= i; k++)
	{
		if (String.valueOf(danci[k]).length() > String.valueOf(danci[maxLenDanCiIndex]).length())
		{
			maxLenDanCiIndex = k;
		}

		if (String.valueOf(danci[k]).length() < String.valueOf(danci[minLenDanCiIndex]).length())
		{
			minLenDanCiIndex = k;
		}
	}
	System.out.printf("%s\n", danci[maxLenDanCiIndex]);
	System.out.printf("%s\n", danci[minLenDanCiIndex]);

		return 0;
	}

}
