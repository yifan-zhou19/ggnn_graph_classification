package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i = 0;
		int temp;
		int[] num = new int[100];
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 0;i < k;i++)
		{
		num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}


		for (i = 1;i < k;i++) //?????????num[0]
		{
			if (num[i] > num[0])
			{
				temp = num[0];
				num[0] = num[i];
				num[i] = temp;
			}
		}

		for (i = 1;i < k;i++) //?????????num[1]
		{
			if (num[i] > num[1])
			{
				temp = num[1];
				num[1] = num[i];
				num[i] = temp;
			}
		}

		System.out.print(num[0]);
		System.out.print("\n");
		System.out.print(num[1]);
		System.out.print("\n");


		return 0;
	}

}

