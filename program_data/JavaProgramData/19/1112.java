package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String juzi = new String(new char[100]);
	char[][] danci = new char[200][200];
	String ci1 = new String(new char[200]);
	String ci2 = new String(new char[200]);
	int i = 0;
	int j = 0;
	int k = 0;
	int f;
	int index;
	juzi = new Scanner(System.in).nextLine();
	ci1 = new Scanner(System.in).nextLine();
	ci2 = new Scanner(System.in).nextLine();
		index = 0;
		for (i = 0;;i++)
		{
			for (k = 0;;)
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
		for (f = 0;f < 100;f++)
		{
			if (strcmp(danci[f],ci1) == 0)
			{
				danci[f] = ci2;
			}
		}
	for (j = 0;j <= i;j++)
	{
	if (j == i)
	{
	System.out.printf("%s",danci[j]);
	}
	else
	{
	System.out.printf("%s ",danci[j]);
	}
	}
	return 0;
	}

}
