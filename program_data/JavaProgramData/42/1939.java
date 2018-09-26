package <missing>;

public class GlobalMembers
{
	//********************************
	//*??????????? **
	//*????? 1300012839 **
	//*???2013.10.31**
	//********************************
	public static int Main()
	{
		int[] a = new int[100000];
		int i; //i,j??????out??????,??flag????
		int j;
		int n;
		int out;
		int count = 0;
		int flag = -1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		out = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			if (a[i] != out)
			{
				count = count + 1; //????out?????
				flag = i; //flag???????out?????
			}
		}
		for (j = 0;j < flag;j++)
		{
			if (a[j] != out)
			{
				System.out.print(a[j]);
				System.out.print(" ");
			}
		}
		if (flag != -1)
		{
			System.out.print(a[flag]);
			System.out.print("\n");
		}
		return 0;
	}
}

