package <missing>;

public class GlobalMembers
{
	public static int num;

	public static void func()
	{
	  if ((num & 1) != 0)
	  {
		System.out.print(num);
		System.out.print("*3+1=");
		System.out.print(num * 3 + 1);
		System.out.print("\n");
		num = num * 3 + 1;
	  }
	  else
	  {
		System.out.print(num);
		System.out.print("/2=");
		System.out.print(num / 2);
		System.out.print("\n");
		num /= 2;
	  }
	}

	public static int Main()
	{
	  num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  while (num != 1)
	  {
		func();
	  }
	  System.out.print("End");
	  System.out.print("\n");

	  return 0;
	}

}

