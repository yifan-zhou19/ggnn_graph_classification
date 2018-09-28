package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] apple = new int[n + 1]; //apple[i]???i?????????
		int i;
		for (i = 1;i < n + 1;i++)
		{
			apple[i] = k; //???
		}
		do
		{
			apple[n] = apple[n] + n; //????????????????n?
			for (i = n - 1;i >= 1;i--)
			{
				if (apple[i + 1] % (n - 1) != 0)
				{
					break;
				}
				else
				{
					apple[i] = apple[i + 1] * n / (n - 1) + k;
				}
			}
		}while (i >= 1);

		System.out.print(apple[1]);
		System.out.print("\n");
		return 0;
	}

}

