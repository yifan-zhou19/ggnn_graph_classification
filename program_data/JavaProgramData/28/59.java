package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[10000]);
		int i;
		int j = 0;
		int[] len = new int[300];
		int add = 0;
		int flag;
		for (i = 0;i < 300;i++)
		{
			len[i] = 0;
		}
		str = new Scanner(System.in).nextLine();
		if (str.charAt(0) != 32)
		{
			flag = 1;
			add++;
			for (i = 1;i < str.length();i++)
			{
				if (str.charAt(i) != 32 && i < str.length() - 1)
				{
					add++;
					flag = 1;
				}
				else if (str.charAt(i) != 32 && i == str.length() - 1)
				{
					add++;
					len[j] = add;
					flag = 0;
					add = 0;
				}


				else if ((str.charAt(i) == 32) && flag != 0)
				{
					len[j] = add;
					flag = 0;
					add = 0;
					j++;
				}

			}
		}
		else
		{
			flag = 0;
			for (i = 1;i < str.length();i++)
			{
				if ((str.charAt(i) != ' ') && flag != 0)
				{
					add++;
				}
				else if ((str.charAt(i) != ' ') && (flag == 0))
				{
					flag = 1;
					add++;
				}
				else if ((str.charAt(i) == ' ') && flag != 0)
				{
					len[j] = add;
					flag = 0;
					add = 0;
					j++;
				}
				else
				{
				}
			}
		}

		System.out.printf("%d",len[0]);
		for (i = 1;len[i] != 0;i++)
		{
			System.out.printf(",%d",len[i]);
		}

	}



}
