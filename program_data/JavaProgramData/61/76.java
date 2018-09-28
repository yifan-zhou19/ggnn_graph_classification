package <missing>;

public class GlobalMembers
{
	public static int fab(int num)
	{
		if (num == 1) //??????1
		{
			return 1;
		}
		if (num == 2) //??????1
		{
			return 1;
		}
		if (num != 1 && num != 2) //????
		{
			return fab(num - 1) + fab(num - 2);
		}


	}
	public static int Main() //?????
	{
		int n; //??????n,i,n???????i?????
		int i;
		int num;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++) //??n?????????????
		{
		   num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   System.out.print(fab(num));
		   System.out.print("\n");
		}

	return 0;
	}
}

