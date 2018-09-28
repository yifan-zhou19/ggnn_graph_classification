package <missing>;

public class GlobalMembers
{
	//**********************************
	//***??????  1200012772   ****
	//***???????             ****
	//***???2012?12?7?        ****
	//**********************************
	public static int Main()
	{
		int n = 0;
		int m = 0;
		int[] a = new int[101];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p = 0;
		int i = 0;
		int temp = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		p = a[1];
		for (; p <= a[n]; p++)
		{
			*p = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}

		for (int i = 1; i <= m; i++)
		{
			temp = a[i];
			a[i] = a[n + i - m];
			for (int j = n + i - m; j >= i + 2; j--)
			{
				a[j] = a[j - 1];
			}
			a[i + 1] = temp;
		}
		System.out.print(a[1]);
		for (p = a[2]; p <= a[n]; p++)
		{
				System.out.print(' ');
				System.out.print(p);
		}
			System.out.print("\n");
			return 0;
	}



}

