package <missing>;

public class GlobalMembers
{
	//??????????  ????????  
	public static int Main()
	{
	 int n;
	 int k;
	 int t;
	 int i;
	 int j;
	 int[] apple = new int[100];

	 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 j = n - 1;
	 apple[n] = n - 1;
	for (i = n;i >= 1;i--)
	{
		if (apple[i] % (n - 1) == 0)
		{
		apple[i - 1] = apple[i] * n / (n - 1) + k;
		}
		else
		{
			apple[n] = apple[n] + n - 1;
			i = n + 1;
		}
	}

	System.out.print(apple[0]);
	System.out.print("\n");
	 return 0;

	}
}

