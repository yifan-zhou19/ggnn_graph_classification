package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String string = new String(new char[1500]);
		int[] num = new int[350];
		int i;
		int j = 0;
		int max = 0;
		int max2 = 0;
		String = new Scanner(System.in).nextLine();
		for (i = 0;i <= 349;i++)
		{
			num[i] = 0;
		}
		for (i = 0;string.charAt(i) != '\0';i++)
		{
			if (String[i] != ',')
			{
				num[j] = num[j] * 10 + string.charAt(i) - '0';
			}
			else
			{
				j++;
			}
		}
		for (i = 0;i <= j;i++)
		{
			if (num[i] > max)
			{
				max2 = max;
				max = num[i];
			}
			else if (num[i] > max2 && num[i] < max)
			{
				max2 = num[i];
			}
		}
		if (max2 == 0)
		{
			System.out.print("No\n");
		}
		else
		{
		System.out.printf("%d\n",max2);
		}
	}

}
