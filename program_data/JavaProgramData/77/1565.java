package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[100];
	public static int n; //:n???????n1??????
	public static int n1;
	public static int Main()
	{
		void digui(int);
		String str = new String(new char[100]);
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		n = str.length();
		n1 = n;

		for (int i1 = 0;str.charAt(i1) != '\0';i1++)
		{
			if (str.charAt(i1) == str.charAt(0)) //:????1?????0?????-1
			{
				a[i1] = 1;
			}
			else
			{
				a[i1] = 0;
			}
		}

		digui(n); //:?n??????
		return 0;
	}


	public static void digui(int n)
	{
		int count = 0;
		int t = 0;
		if (n == 2) //:??2?????????
		{
			for (int i = 0;i < n1;i++)
			{
				if (a[i] != -1 && count == 0)
				{
					System.out.print(i);
					System.out.print(" ");
					count++;
					a[i] = -1;
				}
				else if (a[i] != -1 && count > 0)
				{
					System.out.print(i);
					count++;
					a[i] = -1;
				}
			}
			System.out.print("\n");
		}

		else if (n > 2) //:?????????????????????????-1
		{
			for (int i = 0;i < n1 - 1;i++)
			{
				if (a[i] == 1)
				{
					for (int j = i + 1;j < n1;j++)
					{
						if (a[j] == -1)
						{
							continue;
						}
						else if (a[j] == 1)
						{
							break;
						}
						else if (a[j] == 0)
						{
							System.out.print(i);
							System.out.print(" ");
							System.out.print(j);
							System.out.print("\n");
							a[i] = -1;
							a[j] = -1;
							digui(n - 2); //:????2??????????
						}
					}
				}
			}
		}
	}





}

