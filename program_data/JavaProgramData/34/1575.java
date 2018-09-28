package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num;
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (num > 1)
		{
		for (int i = 0;;i++)
		{
		if (num % 2 == 1)
		{
		System.out.print(num);
		num = num * 3 + 1;
		System.out.print("*3+1=");
		System.out.print(num);
		System.out.print("\n");
		}
		if (num % 2 == 0)
		{
		System.out.print(num);
		num = num / 2;
		System.out.print("/2=");
		System.out.print(num);
		System.out.print("\n");
		if (num == 1)
		{
		break;
		}
		}
		}
		}
		if (num == 1)
		{
	  System.out.print("End");
	  System.out.print("\n");
		}
		return 0;
	}

}

