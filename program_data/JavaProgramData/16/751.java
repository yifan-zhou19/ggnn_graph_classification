package <missing>;

public class GlobalMembers
{
	//********************
	//??????
	public static int Main()
	{
		int n;
		int i = 0;
		int[] a = new int[6];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 0)
		{
			System.out.print(n);
		}
		else
		{
			while (n > 0)
			{
			 a[i] = n % 10;
			 n = (n - a[i]) / 10;
			 System.out.print(a[i]);
			 i++;
			}
		}
		 return 0;

	}
}

