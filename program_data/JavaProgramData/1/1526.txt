package <missing>;

public class GlobalMembers
{
	public static int sum = 0;
	public static int f(int a,int b)
	{
		 for (int i = a;i > 1;i--)
		 {
		 if (a % i != 0)
		 {
			 continue;
		 }
		 else
		 {
		 if (i > b)
		 {
			 continue;
		 }
		 else
		 {
		 int q;
		 q = a / i;
		 if (q == 1)
		 {
			 sum++;
		 }
		 else
		 {
			 f(q, i);
		 }
		 }
		 }
		 }
		 return sum;
	}

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= n;i++)
		{
		int num;
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int c;
		c = f(num, num);
		System.out.print(c);
		System.out.print("\n");
		sum = 0;
		}
		return 0;
	}

}

