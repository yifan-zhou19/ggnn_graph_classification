package <missing>;

public class GlobalMembers
{
	//?????????
	public static int Main()
	{
		int i; //????
		int j;
		int m = 0;
		int count = 0;
		int[] num = new int[100];
		for (;;)
		{
			m = 0;
			for (i = 0;;i++)
			{
				num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (num[i] == 0 || num[i] == -1) //??????????
				{
					count = i;
					break;
				}
			}
			if (num[0] == -1)
			{
				break;
			}
			else
			{
				for (i = 0;i < count;i++) //?????????
				{
					for (j = i + 1;j < count;j++)
					{
						if ((num[i] == 2 * num[j]) || (num[j] == 2 * num[i])) //?????????
						{
							m++;
						}
					}
				}
					System.out.print(m);
					System.out.print("\n");
			}
		}
		return 0;
	}
}

