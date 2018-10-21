package <missing>;

public class GlobalMembers
{
	public static int[] queue = new int[90010]; //??

	public static int Main()
	{
	   // freopen("1.in","r",stdin);
	   // freopen("1.out","w",stdout);
		int n;
		int m;
		while (true)
		{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 0 && m == 0)
		{
			break;
		}
		int front = 0; //???????????????????
		int rear = n;
		for (int i = 0;i < n;i++)
		{
		  queue[i] = i + 1;
		}
		for (int i = 0;i < n - 1;i++)
		{
				for (int j = 1;j < m;j++)
				{
						queue[rear++] = queue[front];
						front++;
				}
				front++;
		}
		System.out.print(queue[front]);
		System.out.print("\n");
		}
		return 0;
	}

}

