package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int num;
		int cur;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *temp = &cur;
		int temp = cur;
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < num; i++)
		{
			a[i] = ConsoleInput.readToWhiteSpace(true);
		}
		for (int i = 0; i < num / 2; i++)
		{
			temp = a[i];
			a[i] = (a + num - i - 1);
			a[num - i - 1] = temp;
		}
		System.out.print(a);
		for (int i = 1; i < num; i++)
		{
			System.out.print(" ");
			System.out.print((a + i));
		}
		return 0;
	}
}

