package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[100]);
		char[][] str2 = new char[100][100];
		int i;
		int j;
		int k;
		int n = 0;
		int min;
		int max;
		int minno;
		int maxno;
		int[] len = new int[100];
		str = new Scanner(System.in).nextLine();
		for (i = 0;str.charAt(i) != '\0';i++)
		{
			if (str.charAt(i) == 32)
			{
				n++;
			}
		}
		n++;
		//printf("%d",n);
			i = 0;
			for (j = 0;j < n;j++)
			{
				if (str.charAt(i) == '\0')
				{
					break;
					i++;
				}
				else
				{
						for (k = 0;;k++)
						{
							if (str.charAt(i) == 32 || str.charAt(i) == '\0')
							{
									i++;
									break;
							}
							str2[j][k] = str.charAt(i);
							i++;
						}

				}
			}
		for (i = 0;i < n;i++)
		{
			len[i] = String.valueOf(str2[i]).length();
		}
		min = max = len[0];
		for (i = 0;i < n;i++)
		{
				max = max > len[i] != 0?max:len[i];
				min = min < len[i] != 0?min:len[i];
		}
		for (i = n - 1;i >= 0;i--)
		{
			if (max == len[i])
			{
				maxno = i;
			}
			if (min == len[i])
			{
				minno = i;
			}
		}
		for (j = 0;str2[maxno][j] != '\0';j++)
		{
			System.out.printf("%c",str2[maxno][j]);
		}
		System.out.print("\n");
		for (j = 0;str2[minno][j] != '\0';j++)
		{
			System.out.printf("%c",str2[minno][j]);
		}
	}
}
