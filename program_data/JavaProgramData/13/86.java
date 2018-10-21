package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[20000];
		int i;
		int j;
		int flag;
		int g;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		g = 0;
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			flag = 1;
			for (j = 0; j < i; j++)
			{
				if (a[j] == a[i])
				{
				flag = 0;
				break;
				} //??a[i]????????????????flag
			}
				if (flag == 1)
				{
					if (g != 0)
					{
						System.out.print(" ");
						System.out.print(a[i]);
					}
					else
					{
						System.out.print(a[i]);
						g = 1;
					}
				}
		}
		System.out.print("\n");
		return 0;
	}

}

