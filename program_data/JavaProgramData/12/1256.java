package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[16];
		int i;
		int j;
		int num;
		int h;
		while ((a[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			while (a[0] != -1)
			{
				for (i = 1;i < 16;i++)
				{
					a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					if (a[i] == 0)
					{
						break;
					}
					h = i; //h??????0??????
				}

				num = 0;
				for (i = 0;i <= h;i++)
				{
					for (j = 0;j <= h;j++)
					{
						if (a[i] == 2 * a[j])
						{
							num++;
						}
					}
				}
				System.out.print(num);
				System.out.print("\n");
				break;
			}
			continue;
		}
		return 0;
	}

}

