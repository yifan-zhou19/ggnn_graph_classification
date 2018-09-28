package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[200]);
		char[][] a = new char[50][50];
		int ilen;
		int i = 0;
		int m = 0;
		int k;
		int b;
		int j;
		int c;
		int[] len = new int[50];

		zfc = new Scanner(System.in).nextLine();
		ilen = zfc.length();

		for (k = 0;k < ilen;k++)
		{
			if (zfc.charAt(k) != ' ')
			{
				a[i][m] = zfc.charAt(k);
				m++;
			}
			else
			{
				a[i][m] = '\0';
				m = 0;
				i++;
			}
		}
		a[i][m] = '\0';
		for (j = 0;j <= i;j++)
		{
			len[j] = String.valueOf(a[j]).length();
		}

		 for (b = 0,j = 1;j <= i;j++)
		 {
			if (len[b] < len[j])
			{
				len[b] = len[j];
				b = j;
			}
		 }
		 len[0] = String.valueOf(a[0]).length();
		 for (c = 0,j = 1;j <= i;j++)
		 {
			 if (len[c] > len[j])
			 {
				len[c] = len[j];
				c = j;
			 }
		 }

		 System.out.printf("%s\n",a[b]);
		 System.out.printf("%s\n",a[c]);

		 return 0;
	}

}
