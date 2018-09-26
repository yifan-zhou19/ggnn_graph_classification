package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		int sum;
		int[] m = {100, 50, 20, 10, 5, 1};
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sum = n;
		for (i = 0;i < 6;i++)
		{
		  a = sum / m[i];
		  sum = sum - a * m[i];
		  System.out.print(a);
		  System.out.print("\n");
		}





	return 0;
	}


}

