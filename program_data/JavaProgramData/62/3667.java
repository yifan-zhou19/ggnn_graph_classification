package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String juzi = new String(new char[201]);
		juzi = new Scanner(System.in).nextLine();
		char[][] danci = new char[201][201];
		int sum;
		sum = juzi.length();
		int[] ks = new int[201];
		int[] zz = new int[201];
		int k;
		int z;
		int i;
		k = 0;
		z = 0;
		for (i = 0;i < sum;i++)
		{
			if (i == 0 || (juzi.charAt(i - 1) == ' ' && juzi.charAt(i) != ' '))
			{
				ks[k] = i;
				k++;
			}
				if (i == sum - 1 || (juzi.charAt(i) != ' ' && juzi.charAt(i + 1) == ' '))
				{
				  zz[z] = i;
				  z++;
				}
		}
			 int n;
			 int g;
			 for (g = 0,i = 0;g < k;g++,i++)
			 {
			 for (n = 0;n <= zz[i] - ks[i];n++)
			 {
				 danci[g][n] = juzi.charAt(n + ks[i]);
			 }
			 }
			for (i = 0;i < k;i++)
			{
				if (i == 0)
				{
					System.out.printf("%s",danci[i]);
				}
				else
				{
					System.out.printf(" %s",danci[i]);
				}
			}

		return 0;
	}



}
