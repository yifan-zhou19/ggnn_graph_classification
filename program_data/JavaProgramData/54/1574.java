package <missing>;

public class GlobalMembers
{
	public static int Main() //???
	{
		int n;
		int k;
		int[] apple = new int[10000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		apple[1] = k; //??????????
		int i = 0;
		do
		{
			apple[1] = apple[1] + n; //??????????????????n
			for (i = 1;i < n;i++) //???????????
			{
				apple[i + 1] = apple[i] * n / (n - 1) + k;
			}
			for (i = 1; i < n; i++) //?????????????
			{
				if ((apple[n] - k) % n != 0)
				{
					break;
				}
			if (apple[i] % (n - 1) != 0)
			{
			break; // ??for??
			}
			}
		} while (i < n - 1); // ? i>=1 ???do??
		// ??????
		System.out.print(apple[n]);
		System.out.print("\n");
		return 0;
	}

}

