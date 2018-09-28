package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int time;
		int i;
		int j;
		int[] num = new int[100];
		int shu;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			shu = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(num, 0, (Integer.SIZE / Byte.SIZE));
			time = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (time == 0)
			{
				System.out.print(60);
				System.out.print("\n");
			}
			else
			{
				for (j = 0; j < time; j++)
				{
					num[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
				for (j = 0; j < time; j++)
				{
					shu = num[j] + 3 * (j + 1);
					if (shu > 60)
					{
						if (num[j] + 3 * j <= 60)
						{
							shu = num[j];
							break;
						}
						else
						{
							shu = 60 - (num[j - 1] + 3 * j) + num[j - 1];
						}
							break;
					}
				}
				if (j == time)
				{
					shu = 60 - 3 * time;
				}
				System.out.print(shu);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

