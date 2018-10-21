package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	if (n == 1)
	{
		System.out.print("End");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	goto ends;
	}
	do
	{
		if (n % 2 != 0)
		{
		System.out.print(n);
		System.out.print("*3+1=");
		System.out.print(n * 3 + 1);
		System.out.print("\n");
	n = n * 3 + 1;
		}
	if (n % 2 == 0)
	{
	System.out.print(n);
	System.out.print("/2=");
	System.out.print(n / 2);
	System.out.print("\n");
	n = n / 2;
	}
	} while (n != 1);
	System.out.print("End");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	ends:
	return 0;
	}


}

