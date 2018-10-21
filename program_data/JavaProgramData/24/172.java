package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[1000]);
	int[] shu = new int[50];
	int i;
	int j = 0;
	int k = 0;
	int max;
	int min;
	int sum1 = 0;
	int sum2 = 0;
	str = new Scanner(System.in).nextLine();
	for (i = 0;i < str.length();i++)
	{
		if (str.charAt(i) != ' ')
		{
			j++;
		}
		else
		{
			shu[k] = j;
			k++;
			j = 0;
		}

		if (i == (str.length() - 1))
		{
			shu[k] = j;
		}
	}
	max = shu[0];
	min = shu[0];
	for (i = 0;i <= k;i++)
	{
		if (shu[i] > max)
		{
			max = shu[i];
		}
	}
	for (i = 0;i <= k;i++)
	{
		if (shu[i] < min)
		{
			min = shu[i];
		}
	}
	for (i = 0;i <= k;i++)
	{
		if (shu[i] == max)
		{
			break;
		}
		else
		{
			sum1 = sum1 + shu[i];
		}
	}
	for (j = i + sum1;j < i + sum1 + shu[i];j++)
	{
	System.out.printf("%c",str.charAt(j));
	}
	System.out.print("\n");
	for (i = 0;i <= k;i++)
	{
		if (shu[i] == min)
		{
			break;
		}
		else
		{
			sum2 = sum2 + shu[i];
		}
	}
	for (j = i + sum2;j < i + sum2 + shu[i];j++)
	{
	System.out.printf("%c",str.charAt(j));
	}

	}

}
