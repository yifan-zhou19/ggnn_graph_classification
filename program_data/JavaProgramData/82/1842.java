package <missing>;

public class GlobalMembers
{
	//********************************
	//*???????????? **
	//*????? 1300012839 **
	//*???2013.10.27**
	//********************************
	public static int Main()
	{
		int n; //ab??????????c?d????e??j???????
		int a;
		int b;
		int i;
		int j;
		int k;
		int[] c = new int[100];
		int[] d = new int[100];
		int[] e = new int[100];
		int result;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i <= n - 1; i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			c[i] = a;
			d[i] = b; //???????c?d??
		}
		for (j = 0;j <= n - 1;j++)
		{
				e[j] = 0;
				for (k = j;k <= n - 1;k++) //???????j????????
				{
					if (c[k] >= 90 && c[k] <= 140 && d[k] >= 60 && d[k] <= 90) //????
					{
						e[j] = e[j] + 1; //????????1
					}
					else
					{
						break; //?????????????
					}
				}
		}
		for (j = 0;j < n - 1;j++)
		{
				result = e[j] > e[j + 1] != 0?e[j]:e[j + 1];
				e[j + 1] = result; //????n???1.??????????e?????????
		}
		if (n != 1)
		{
			System.out.print(result);
			System.out.print("\n");
		}
		else
		{
			System.out.print(e[0]);
			System.out.print("\n");
		}
		return 0;
	}

}

