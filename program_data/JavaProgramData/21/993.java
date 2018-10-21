package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[305];
		int sum = 0;
		int[] b = new int[305];
		int max = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sum = sum + a[i];
			a[i] = a[i] * n;
		}
				for (int i = 0;i < n - 1;i++)
				{
					for (int j = 0;j < n - 1 - i;j++)
					{
						if (a[j] > a[j + 1])
						{
							int temp = a[j];
							a[j] = a[j + 1];
							a[j + 1] = temp;
						}
					}
				}
					for (int i = 0;i < n;i++)
					{
						b[i] = Math.abs(a[i] - sum);
						if (b[i] > max)
						{
							max = b[i];
						}
					}
						int check = 0;
						for (int i = 0;i < n;i++)
						{
							if (b[i] == max)
							{
								if (check == 0)
								{
								System.out.print(a[i] / n);
								}
								else
								{
									System.out.print(",");
									System.out.print(a[i] / n);
								}
								check = 1;
							}
						}
							return 0;
	}
}

