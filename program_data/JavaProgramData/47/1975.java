package <missing>;

public class GlobalMembers
{
	public static int i = 0; //???????????????
	public static int num = 1;
	public static void nixu(int n)
	{


		int a;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		i++;
		if (i != n)
		{
			nixu(n);
		}
		if (num != n)
		{
		System.out.print(a);
		System.out.print(' ');
			 num++;
		}
		else
		{
			System.out.print(a);
		}



	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		nixu(n);
		return 0;
	}


}

