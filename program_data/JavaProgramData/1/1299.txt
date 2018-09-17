package <missing>;

public class GlobalMembers
{
	public static int sum = 0; //????sum???????????used?i???i????????
	public static int[] used = new int[32770];
	public static void f(int n) //??f??n????????
	{
		for (int i = 2;i <= n;i++)
		{
			if (n % i == 0 && used[i] == 0)
			{
				if (i != 2)
				{
					for (int j = 2;j <= i - 1;j++)
					{
						used[j] = 1;
					}
				}
				if (n / i == 1) //??????????
				{
					sum++;
					break;
				}
				else
				{
					f(n / i);
				}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
				memset(used,0,(Integer.SIZE / Byte.SIZE)); //?used???????
			}
		}
	}
	public static int Main()
	{
		int m;
		int[] a = new int[100];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= m;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[i] == 1)
			{
				System.out.print(1);
				System.out.print("\n");
			}
			else
			{
				f(a[i]);
				System.out.print(sum);
				System.out.print("\n");
				sum = 0; //??
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
				memset(used,0,(Integer.SIZE / Byte.SIZE));
			}
		}
		return 0;
	}
}

