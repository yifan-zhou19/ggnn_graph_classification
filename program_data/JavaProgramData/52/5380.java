package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int[] a = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * shu;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		shu = a + n - m;
		i = 0;
		do
		{
			System.out.print(shu);
			System.out.print(" ");
			shu++;
			i++;
			if (shu > a + n - 1)
			{
				shu = a;
			}

		}while (i < n - 1);
		System.out.print(shu);
		return 0;
	}
}

