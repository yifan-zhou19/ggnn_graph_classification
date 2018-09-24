package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int t;
		int z;
		int b;
		int a;
		int len1;
		int len2;
		char[][] num1 = new char[1000][100];
		char[][] num2 = new char[1000][100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 0 ; i < n ; i++)
		{
			num1[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			num2[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		for (i = 0 ; i < n ; i++)
		{
			len1 = String.valueOf(num1[i]).length();
			len2 = String.valueOf(num2[i]).length();
			for (k = 0 ; k < len2 ; k++)
			{
				a = len1 - k - 1;
				b = len2 - k - 1;
				if (num1[i][a] >= num2[i][b])
				{
					num1[i][a] = num1[i][a] - num2[i][b] + '0';
				}
				else
				{
					for (t = a - 1 ; t >= 0 ; t--)
					{
						if (num1[i][t] > '0')
						{
							break;
						}
					}
					for (z = t + 1 ; z <= a - 1 ; z++)
					{
						if (num1[i][z] == '0')
						{
							num1[i][z] = '9';
						}
					}
					num1[i][t] = num1[i][t] - '1' + '0';
					num1[i][a] = num1[i][a] + '1' - '0' + '9' - '0' - num2[i][b] + '0';
				}
			}
			while (true)
			{
				if (num1[i][0] != '0')
				{
					break;
				}
				else
				{
					for (z = 0 ; z < len1 ; z++)
					{
						num1[i][z] = num1[i][z + 1];
					}
					len1--;
				}
			}
			for (k = 0 ; k < len1 ; k++)
			{
				System.out.print(num1[i][k]);
			}
			System.out.print("\n");
		}
		System.in.read();
		System.in.read();
		return 0;
	}

}

