package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] eat = new int[3]; //eat[3]:??????words[3]:??????i?j??????p???????????
		int[] words = new int[3];
		int i;
		int j;
		int p;
		char ch; //ch:???????????name[3]:?????
		char[] name = {'A', 'B', 'C'};
		for (eat[0] = 0;eat[0] < 3;eat[0]++)
		{
			for (eat[1] = 0;eat[1] < 3;eat[1]++)
			{
					if (eat[1] == eat[0])
					{
						continue;
					}
					eat[2] = 3 - eat[0] - eat[1];
					words[0] = (eat[1] > eat[0]) + (eat[0] == eat[2]);
					words[1] = (eat[0] > eat[1]) + (eat[0] > eat[2]);
					words[2] = (eat[2] > eat[1]) + (eat[1] > eat[0]);
					for (i = 1;i < 3;i++)
					{
						for (j = 1;j < 3 - i;j++)
						{
							if (words[j] > words[j + 1])
							{
								p = words[j];
								words[j] = words[j + 1];
								words[j + 1] = p;
								p = eat[j];
								eat[j] = eat[j + 1];
								eat[j + 1] = p;
								ch = name[j];
								name[j] = name[j + 1];
								name[j + 1] = ch;
							}
						if (eat[0] > eat[1] && eat[1] > eat[2])
						{
							System.out.print(name[2]);
							System.out.print(name[1]);
							System.out.print(name[0]);
						}
						}
					}

			}
		}
		return 0;
	}

}
