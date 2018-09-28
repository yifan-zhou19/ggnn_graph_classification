package <missing>;

public class GlobalMembers
{
	//********************************
	//*??2?N??                 **
	//*????? 1300012848        **
	//*???2013.11.16             **
	//********************************
	public static int Main()
	{
		final int MAX_LEN = 200;
		int n;
		int i;
		int j;
		int k = MAX_LEN;
		int[] a = new int[MAX_LEN + 1];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE)); //????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 0)
		{
			System.out.print("1");
			System.out.print("\n");
		}
		else
		{
			a[0] = 1;
			for (i = 1; i <= n; i++) //????n?
			{
				for (j = 0; j < MAX_LEN; j++) //??????????
				{
					a[j] = a[j] * 2;
				}
				for (j = 0; j < MAX_LEN; j++) //???????????????
				{
					if (a[j] >= 10)
					{
						a[j] = a[j] % 10; //???10??
						a[j + 1]++; //?????
					}
				}
			}
		while (a[k] == 0)
		{
			k--;
		}
		for (; k >= 0; k--)
		{
		System.out.print(a[k]);
		}
		}
		return 0;
	}
}

