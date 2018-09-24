package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] man = new char[103][103];
		int[][] flu = new int[10000][2];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(man,'#',(Character.SIZE / Byte.SIZE)); //??man?????????????�???�
		int num = 0; //num????????0?n?????,m???
		int n;
		int m;
		int i;
		int j;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		//if(n==52){cout<<"2311";return 0;}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				man[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (m = m;m > 1;m--)
		{
			k = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(flu,0,(Integer.SIZE / Byte.SIZE));
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					if (man[i][j] == '@')
					{
						flu[k][0] = i;
						flu[k][1] = j;
						k++;
					}
				}
			}
			for (k = k - 1;k >= 0;k--)
			{
				i = flu[k][0];
				j = flu[k][1];
				if (man[i + 1][j] != '#')
				{
					man[i + 1][j] = '@';
				}
				if (man[i - 1][j] != '#')
				{
					man[i - 1][j] = '@';
				}
				if (man[i][j + 1] != '#')
				{
					man[i][j + 1] = '@';
				}
				if (man[i][j - 1] != '#')
				{
					man[i][j - 1] = '@';
				}
			}
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (man[i][j] == '@')
				{
					num++;
				}
			}
		}
		System.out.print(num);
		System.out.print("\n");
		return 0;
	}

}

