package <missing>;

public class GlobalMembers
{
	//?????
	public static int Main()
	{
		int i;
		int[] apple = new int[100];
		int n;
		int k;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = k;
		do
		{
			m = m + n; //m?????
			apple[n] = m;
			for (i = n - 1;i >= 1;i--) //??????????
			{
				if (apple[i + 1] % (n - 1) == 0)
				{
					apple[i] = apple[i + 1] * n / (n - 1) + k;
				}
				else
				{
					break;
				}
			}
		}while (i >= 1);
		System.out.print(apple[1]);
		System.out.print("\n");
		return 0;
	}
}

