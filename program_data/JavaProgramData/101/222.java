package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[3];
		int[] b = new int[3];
		int i;
		int j;
		int flag;
		int min;
		for (a[0] = 0;a[0] < 3;a[0]++)
		{
			for (a[1] = 0;a[1] < 3;a[1]++)
			{
				for (a[2] = 0;a[2] < 3;a[2]++)
				{
					b[0] = (a[1] > a[0]) + (a[0] == a[2]);
					b[1] = (a[0] > a[1]) + (a[0] > a[2]);
					b[2] = (a[2] > a[1]) + (a[1] > a[0]);
					flag = 1;
					for (i = 0;i < 2;i++)
					{
						for (j = i + 1;j < 3;j++)
						{
							if (a[i] < a[j] && b[i] < b[j] || a[i]> a[j] && b[i]> b[j] || a[i] == a[j] && b[i] != b[j] || a[i] != a[j] && b[i] == b[j])
							{
								flag = 0;
								break;
							}
							if (flag == 0)
							{
								break;
							}
						}
					}
					if (flag != 0)
					{
						for (i = 0;i < 3;i++)
						{
							min = 0;
							for (j = 0;j < 3;j++)
							{
								if (a[min] > a[j])
								{
									min = j;
								}
							}
							System.out.print((char)(min + 65));
							a[min] = 32767;
						}
						return 0;
					}
				}
			}
		}
		return 0;
	}

}
