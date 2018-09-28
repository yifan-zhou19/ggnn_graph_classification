package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[10000]);
		char[][] b = new char[50][50];
		String lo = new String(new char[50]);
		String sh = new String(new char[50]);
		int n;
		int i;
		int j;
		int k = 0;
		int[] p = new int[51];
		int max = 0;
		int min = 100;
		a = new Scanner(System.in).nextLine();
		n = a.length();

		j = 0;
		for (i = 0;i < n;i++)
		{
			if (a.charAt(i) != ' ' && a.charAt(i) != '.')
			{
				  b[j][k] = a.charAt(i);
			   k++;
			}
			   else if (a.charAt(i) == ' ')
			   {
				   k = 0;
			   j++;
			   }

		}


		while (j >= 0)
		{
		p[j] = String.valueOf(b[j]).length();

		if (p[j] <= min)
		{
			sh = b[j];
		min = p[j];
		}
		if (p[j] >= max)
		{
			lo = b[j];
		max = p[j];
		}
		j--;
		}

		 System.out.printf("%s\n",lo);
		 System.out.printf("%s",sh);
		 return 0;

	}

}
