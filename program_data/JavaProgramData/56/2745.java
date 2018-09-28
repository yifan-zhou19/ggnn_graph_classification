package <missing>;

public class GlobalMembers
{
	public static void Reverse(int n)
	{
		 if (n > 0)
		 {
			System.out.printf("%d",n % 10);
			Reverse(n / 10);
		 }
	}
	public static int Main()
	{
		 int num;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		 Reverse(num);
		 System.out.print("\n");
		 return 0;
	}
}

