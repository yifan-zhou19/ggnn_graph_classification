package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int num;
	int i;
	int j;
	int k;
	int l;
	int[] len = new int[20];
	char[][] a = new char[20][101];
	char[][] b =
	{
		{' ', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
	};
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		num = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= num;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i] = tempVar2.charAt(0);
	}
	len[i] = String.valueOf(a[i]).length();
	}
	//==2�?�1==== 

	for (k = 1;k <= num;k++)
	{
		for (i = 0;i < len[k];i++)
		{
			if (a[k][i] == '(')
			{
				b[k][i] = '$';
			}
			else if (a[k][i] == ')')
			{
				b[k][i] = '?';
			}
			else
			{
				b[k][i] = ' ';
			}
		}
		for (i = 0;i < len[k] - 1;i++)
		{
			if (b[k][i] == '$')
			{
				for (j = i + 1;j < len[k];j++)
				{
					if (b[k][j] == '?')
					{
						for (l = j - 1;l >= i;l--)
						{
							if (b[k][l] == '$')
							{
								b[k][l] = ' ';
								b[k][j] = ' ';
								break;
							}
						}
					}
				}
			}
		}


	for (i = 0;i < len[k];i++)
	{
		System.out.printf("%c",a[k][i]);
	}
		System.out.print("\n");
	for (i = 0;i < len[k];i++)
	{
		System.out.printf("%c",b[k][i]);
	}
		System.out.print("\n");



	}




	}
}

