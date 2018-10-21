package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] shuru = new int[20];

		while (true)
		{
			int i = 1;
			int j;
			int k;
			int s;
			int no;
			s = 0;
			shuru[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (shuru[0] == -1)
			{
				break;
			}

			for (i = 1;i <= 15;i++)
			{
				shuru[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (shuru[i] == 0)
				{
					break;
				}
				for (j = 0;j < i;j++)
				{
					if ((shuru[j] == 2 * shuru[i]) || (2 * shuru[j] == shuru[i]))
					{
						s++;
					}
				}
			}
			//cout << "yes  " << shuru[0] << endl;
			System.out.print(s);
			System.out.print("\n");
			for (i = 0;i <= 14;i++)
			{
			shuru[i] = 0;
			}
		}
		return 0;
	}

}

