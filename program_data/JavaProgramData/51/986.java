package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int len;
		int i;
		int j;
		int k;
		int[] num = new int[600];
		int flag;
		final String chuan = "";
		final String cha = "";
		final String comp = "";
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		chuan = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len = chuan.length();
		for (i = 0;i <= (len - n);i++)
		{
			k = 0;
			for (j = i;j < i + n;j++)
			{
				comp = tangible.StringFunctions.changeCharacter(comp, k, chuan.charAt(j));
				k++;
			}
			j = 0;
			flag = 0;
			while (num[j] != 0)
			{
				if (strcmp(comp,cha.charAt(j)) == 0)
				{
					num[j]++;
					flag = 1;
					break;
				}
				j++;
			}
			if (flag == 0)
			{
				for (k = 0;k < n;k++)
				{
				   cha.charAt(j)[k] = comp.charAt(k);
				}
				num[j]++;
			}
		}
		i = 0;
		while (num[i] != 0)
		{
			i++;
		}
		len = i;
		for (i = 0;;i++)
		{
			if (num[i] == 0)
			{
				break;
			}
			for (j = 1;j < len - i;j++)
			{
				if (num[j] == 0)
				{
					break;
				}
				if (num[j - 1] < num[j])
				{
					k = num[j - 1];
					num[j - 1] = num[j];
					num[j] = k;
					comp = cha.charAt(j - 1);
					cha = tangible.StringFunctions.changeCharacter(cha, j - 1, cha.charAt(j));
					cha = tangible.StringFunctions.changeCharacter(cha, j, comp);
				}
			}
		}
		if (num[0] == 1)
		{
			System.out.print("NO");
			System.out.print("\n");
		}
		else
		{
		i = 0;
		System.out.print(num[0]);
		System.out.print("\n");
		while (num[i] == num[0])
		{
			System.out.print(cha.charAt(i));
			System.out.print("\n");
			i++;
		}
		}

		return 0;
	}

}

