package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] num = new int[15];
		int a;
		int i;
		int x;
		int k;
		int t;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (a != -1)
		{
			 i = 0;
			 x = 0;
			 while (a != 0)
			 {
				num[i] = a;
				i = i + 1;
				a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			 }
			 for (k = 0; k <= i - 1; k++)
			 {
				 for (t = 0; t <= i - 1; t++)
				 {
					 if (num[k] == num[t] * 2)
					 {
					 x = x + 1;
					 }
				 }
			 }
			 System.out.print(x);
			 System.out.print("\n");
			 a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		return 0;
	}


}

