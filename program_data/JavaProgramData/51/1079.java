package <missing>;

public class GlobalMembers
{
				 public static int[][][][] freq = new int[27][27][27][27];
	public static int Main()
	{
		int n;
		int max;
		int i;
		int j;
		int k;
		int l;
		String str = new String(new char[505]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int len = str.length();
		if (n == 2)
		{
				 int[][] fre = new int[27][27];
				 for (i = 1;i <= 26;i++)
				 {
					 for (j = 1;j <= 26;j++)
					 {
						 fre[i][j] = 0;
					 }
				 }
				 for (i = 0;i <= len - 2;i++)
				 {
					 fre[str.charAt(i) - 96][str.charAt(i + 1) - 96]++;
				 }
				 max = 0;
				 for (i = 1;i <= 26;i++)
				 {
					 for (j = 1;j <= 26;j++)
					 {
						 if (fre[i][j] >= max)
						 {
							 max = fre[i][j];
						 }
					 }
				 }
				 if (max == 1)
				 {
					 System.out.print("NO");
					 max = -1;
				 }
				 else
				 {
					 System.out.print(max);
					 System.out.print("\n");
				 }
				 for (i = 0;i <= len - 2;i++)
				 {
					 if (fre[str.charAt(i) - 96][str.charAt(i + 1) - 96] == max)
					 {
						 System.out.print(str.charAt(i));
						 System.out.print(str.charAt(i + 1));
						 System.out.print("\n");
						 fre[str.charAt(i) - 96][str.charAt(i + 1) - 96] = 0;
					 }
				 }
		}
		else if (n == 3)
		{
				 int[][][] fre = new int[27][27][27];
				 for (i = 1;i <= 26;i++)
				 {
					 for (j = 1;j <= 26;j++)
					 {
						 for (k = 1;k <= 26;k++)
						 {
							 fre[i][j][k] = 0;
						 }
					 }
				 }
				 for (i = 0;i <= len - 3;i++)
				 {
					 fre[str.charAt(i) - 96][str.charAt(i + 1) - 96][str.charAt(i + 2) - 96]++;
					 //cout<<str[i]-96<<str[i+1]-96<<str[i+2]-96<<endl;
				 }
				 max = 0;
				 for (i = 1;i <= 26;i++)
				 {
					 for (j = 1;j <= 26;j++)
					 {
						 for (k = 1;k <= 26;k++)
						 {
							 if (fre[i][j][k] >= max)
							 {
								 max = fre[i][j][k];
							 }
						 }
					 }
				 }
				 if (max == 1)
				 {
					 System.out.print("NO");
					 max = -1;
				 }
				 else
				 {
					 System.out.print(max);
					 System.out.print("\n");
				 }
				 for (i = 0;i <= len - 2;i++)
				 {
					 if (fre[str.charAt(i) - 96][str.charAt(i + 1) - 96][str.charAt(i + 2) - 96] == max)
					 {
						 System.out.print(str.charAt(i));
						 System.out.print(str.charAt(i + 1));
						 System.out.print(str.charAt(i + 2));
						 System.out.print("\n");
						 fre[str.charAt(i) - 96][str.charAt(i + 1) - 96][str.charAt(i + 2) - 96] = 0;
					 }
				 }
		}
		else
		{

				 for (i = 1;i <= 26;i++)
				 {
					 for (j = 1;j <= 26;j++)
					 {
						 for (k = 1;k <= 26;k++)
						 {
							 for (l = 1;l <= 26;l++)
							 {
							 freq[i][j][k][l] = 0;
							 }
						 }
					 }
				 }
				 for (i = 0;i <= len - 4;i++)
				 {
					 freq[str.charAt(i) - 96][str.charAt(i + 1) - 96][str.charAt(i + 2) - 96][str.charAt(i + 3) - 96]++;
					 //cout<<str[i]-96<<str[i+1]-96<<str[i+2]-96<<endl;
				 }
				 max = 0;
				 for (i = 1;i <= 26;i++)
				 {
					 for (j = 1;j <= 26;j++)
					 {
						 for (k = 1;k <= 26;k++)
						 {
							 for (l = 1;l <= 26;l++)
							 {
							 if (freq[i][j][k][l] >= max)
							 {
								 max = freq[i][j][k][l];
							 }
							 }
						 }
					 }
				 }
				 if (max == 1)
				 {
					 System.out.print("NO");
					 max = -1;
				 }
				 else
				 {
					 System.out.print(max);
					 System.out.print("\n");
				 }
				 for (i = 0;i <= len - 2;i++)
				 {
					 if (freq[str.charAt(i) - 96][str.charAt(i + 1) - 96][str.charAt(i + 2) - 96][str.charAt(i + 3) - 96] == max)
					 {
						 System.out.print(str.charAt(i));
						 System.out.print(str.charAt(i + 1));
						 System.out.print(str.charAt(i + 2));
						 System.out.print(str.charAt(i + 3));
						 System.out.print("\n");
						 freq[str.charAt(i) - 96][str.charAt(i + 1) - 96][str.charAt(i + 2) - 96][str.charAt(i + 3) - 96] = 0;
					 }
				 }
		}
		//while (1);
	}

}

