package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int j;
		int len;
		char[][] ci = new char[50][50];
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
					ci[i] = tempVar2.charAt(0);
				}
		}
		String ps;
		//int m;
		for (j = 0;j < n;j++)
		{
				//m=strlen(ci[j]);
				ps = ci[j] - 1 + String.valueOf(ci[j]).length();
				k = strcmp(ps,"g");
				if (k != 0)
				{
					/*
						for(int k=0;k<m-3;k++){
								printf("%c",ci[j][k]);
								printf("\n");
								}
								*/
						len = String.valueOf(ci[j]).length();
						ci[j][len - 2] = '\0';
				}
				else if (k == 0)
				{
					/*
					 for(int h=0;h<m-4;h++){
							 printf("%c",ci[j][h]);
							 printf("\n");
					 }
					 */
						len = String.valueOf(ci[j]).length();
					ci[j][len - 3] = '\0';
				}
		}

		for (i = 0;i < n;i++)
		{
				System.out.printf("%s\n",ci[i]);
		}
		return 0;
	}
}

