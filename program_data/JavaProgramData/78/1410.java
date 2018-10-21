package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] weight = new int[4];
		int i;
		int j;
		int k;
		String[] name = {"z", "q", "s", "l"};
		String t = new String(new char[2]);
		for (weight[0] = 1;weight[0] < 5;weight[0]++)
		{
			for (weight[1] = 1;weight[1] < 5;weight[1]++)
			{
				for (weight[2] = 1;weight[2] < 5;weight[2]++)
				{
					for (weight[3] = 1;weight[3] < 5;weight[3]++)
					{
						if (weight[0] + weight[1] == weight[2] + weight[3] && weight[0] + weight[3] > weight[2] + weight[1] && weight[0] + weight[2] < weight[1])
						{
							break;
						}
					}
					if (weight[0] + weight[1] == weight[2] + weight[3] && weight[0] + weight[3] > weight[2] + weight[1] && weight[0] + weight[2] < weight[1])
					{
							break;
					}
				}
				if (weight[0] + weight[1] == weight[2] + weight[3] && weight[0] + weight[3] > weight[2] + weight[1] && weight[0] + weight[2] < weight[1])
				{
							break;
				}
			}
			if (weight[0] + weight[1] == weight[2] + weight[3] && weight[0] + weight[3] > weight[2] + weight[1] && weight[0] + weight[2] < weight[1])
			{
							break;
			}
		}
		for (i = 0;i < 4;i++)
		{
			for (j = 1;j < 4 - i;j++)
			{
				if (weight[j - 1] < weight[j])
				{
					k = weight[j - 1];
					weight[j - 1] = weight[j];
					weight[j] = k;
					t = name[j - 1];
					name[j - 1] = name[j];
					name[j] = t;
				}
			}
		}
		for (i = 0;i < 4;i++)
		{
			System.out.print(name[i]);
			System.out.print(" ");
			System.out.print(10 * weight[i]);
			System.out.print("\n");
		}
		return 0;

	}


}
