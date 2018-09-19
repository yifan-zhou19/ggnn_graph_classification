package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A;
		int B;
		int[] a = new int[5];
		int i = 0;
		int j = 0;
		A = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		do
		{
				B = A / 10;
				a[i] = A - B * 10;
				A = B;
				i++;
				j++;
		} while (A != 0);
		for (i = 0;i < j;i++)
		{
			System.out.print(a[i]);
		}
		return 0;
	}


}

