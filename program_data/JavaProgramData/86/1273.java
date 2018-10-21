package <missing>;

public class GlobalMembers
{
	public static int[] jilu = new int[100];

	public static int Main()
	{

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(jilu,0,(Integer.SIZE / Byte.SIZE));
		int total;
		int i;
		total = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 1;i <= total;i++)
		{
			int[] a = new int[20];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a,0,(Integer.SIZE / Byte.SIZE));
			int n;
			int j;
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (n == 0)
			{
				jilu[i] = 60;
			}
			else
			{
				for (j = 1;j <= n;j++)
				{
					a[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
				if (a[1] >= 60)
				{
					jilu[i] = 60;
				}
				else
				{
					int time;
					for (j = 1;j <= n;j++)
					{
						time = a[j] + 3 * j;
						if (a[j] < 60 && a[j] + 3 * j>60)
						{
							jilu[i] = a[j];
							break;
						}
						else if (time < 60 && (a[j + 1] + 3 * j>60))
						{
							break;
						}
					}
					if (j <= n)
					{
						if ((60 - time > a[j + 1] - a[j]) && a[j + 1] > 0)
						{
							jilu[i] = a[j + 1];
						}
						else if (a[j] < 60 && a[j] + 3 * j>60)
						{
							;
						}
						else
						{
							jilu[i] = 60 - 3 * j;
						}
					}
					else
					{
						jilu[i] = 63 - 3 * j;
					}

				}

			}


		}
		for (i = 1;i <= total;i++)
		{
			System.out.print(jilu[i]);
			System.out.print("\n");
		}


		return 0;
	}

}

