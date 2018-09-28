package <missing>;

public class GlobalMembers
{
	//********************************
	//*??  ??????        *****
	//*????? 1300012753     ***** 
	//*???2013.11.20          *****   
	//********************************
	public static int cal(int i)
	{
		if (i == 1 || i == 2)
		{
		return 1;
		}
		else
		{
		return cal(i - 1) + cal(i - 2);
		}
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[100];
		for (int i = 1; i <= n; i++)
		{
			int t;
			t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[i] = cal(t);
		}
		for (int i = 1; i <= n; i++)
		{
		System.out.print(a[i]);
		System.out.print("\n");
		}
		return 0;
	}
}

