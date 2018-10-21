package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //???n
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int x; //??????x
		x = n; //???x
		for (;x != 1;) //x??1????????
		{
			if (x % 2 == 1) //????
			{
				System.out.print(x);
				System.out.print("*3+1=");
				x = x * 3 + 1;
				System.out.print(x);
				System.out.print('\n');
			}
			else //????
			{
				System.out.print(x);
				System.out.print("/2=");
				x = x / 2;
				System.out.print(x);
				System.out.print('\n');
			}
		}
		System.out.print("End");
		return 0; //?> w <?
	}

}

