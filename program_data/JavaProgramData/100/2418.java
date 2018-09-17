package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String string = new String(new char[1000]);
		String = new Scanner(System.in).nextLine();
		int n;
		int i;
		n = String.length();
		int[] x = new int[200];
		int m;
		int flag = 0;
		for (m = 65;m <= 90;m++)
		{
						for (i = 0;i < n;i++)
						{
										   if (String[i] == m)
										   {
														   x[m] = x[m] + 1;
										   }
						}
						if (x[m] != 0)
						{
								   System.out.printf("%c=%d\n", m, x[m]);
								   flag++;
						}
		}
		for (m = 97;m <= 122;m++)
		{
							for (i = 0;i < n;i++)
							{
										   if (String[i] == m)
										   {
														   x[m] = x[m] + 1;
										   }
							}
						if (x[m] != 0)
						{
								   System.out.printf("%c=%d\n", m, x[m]);
								   flag++;
						}
		}
		if (flag == 0)
		{
		System.out.print("No");
		}
		return 0;
	}

}
