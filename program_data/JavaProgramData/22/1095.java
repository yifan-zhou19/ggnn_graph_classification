package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[1000]);
		int[] num = new int[100];
		int i;
		int j;
		int k;
		int m;
		str = new Scanner(System.in).nextLine();
		int index = 0;
		for (i = 0;i < str.length();i = j + 1)
		{
			for (j = i, k = 0;str.charAt(j) != ',' && str.charAt(j) != '\0';j++)
			{
				num[index] = (str.charAt(j) - '0') + num[index] * 10;
				k++;
			}
			index++;
		}
		for (i = 0;i < index;i++)
		{
			for (j = i;j < index;j++)
			{
				if (num[i] < num[j])
				{
					k = num[j];
					num[j] = num[i];
					num[i] = k;
				}
			}
		}

		int max;
		max = num[0];
		for (i = 0;i < index;i++)
		{
			if (num[i] != max)
			{
				System.out.printf("%d",num[i]);
				break;
			}
			else if (i == index - 1)
			{
				System.out.print("No");
			}
		}

	}

}
