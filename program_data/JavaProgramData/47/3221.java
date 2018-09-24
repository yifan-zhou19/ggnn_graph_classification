package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int temp;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p=null;
		int p = null;
			 p = a;
			 for (i = 0;i < n / 2;i++)
			 {
				 temp = (p + i);
				 *(p + i) = *(p + n - 1 - i);
				 *(p + n - 1 - i) = temp;
			 }
		for (i = 0;i < n - 1;i++)
		{
			System.out.print((p + i));
			System.out.print(" ");
		}
		System.out.print((p + n - 1));
		return 0;
	}

}

