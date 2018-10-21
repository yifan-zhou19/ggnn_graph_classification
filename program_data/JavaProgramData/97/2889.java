package <missing>;

public class GlobalMembers
{
	/****************?????********************
	??? 
	*********************************************/
	public static int pay(int n,int money)
	{
		int num;
		num = n / money;
		System.out.print(num);
		System.out.print("\n");
		num = n % money;
		return num;
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = pay(n, 100);
		n = pay(n, 50);
		n = pay(n, 20);
		n = pay(n, 10);
		n = pay(n, 5);
		n = pay(n, 1);
		return 0;
	}


}

