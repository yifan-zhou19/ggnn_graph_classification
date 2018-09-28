package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int[] apple = new int[200];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		apple[n] = n + k; //?????n+k????
		while (true)
		{
			for (i = n - 1;i > 0;i--)
			{
				if (apple[i + 1] % (n - 1) != 0)
				{
					break; //???2?n??????????n-1???
				}
				apple[i] = apple[i + 1] * n / (n - 1) + k;
			}
			if (i == 0)
			{
				break;
			}
			apple[n] += n;
		}
		System.out.print(apple[1]);
		return 0;
	}
}

