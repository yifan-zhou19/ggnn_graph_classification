package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (;n != 1;)
	{
	  if (n % 2 == 1)
	  {
		System.out.print(n);
		System.out.print("*3+1=");
		System.out.print(n * 3 + 1);
		System.out.print("\n");
		n = n * 3 + 1;
	  }
	  else
	  {
		System.out.print(n);
		System.out.print("/2=");
		System.out.print(n / 2);
		System.out.print("\n");
		n = n / 2;
	  }
	}
	System.out.print("End");
	System.in.read();
	System.in.read();
	return 0;
	}
}

