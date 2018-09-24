package <missing>;

public class GlobalMembers
{
	//***************************
	//**???1.cpp
	//**??????
	//**???2013.10.30
	//**???????
	//***************************
	public static int Main()
	{
		int[] a = new int[17]; // ??0????17???
		int i;
		int n;
		while (true)
		{
			n = 0;
			a[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

			if (a[1] == -1)
			{
				break; // ???????-1?????
			}
			for (i = 2; ; i++)
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (a[i] == 0)
				{
					break; // ???0???????
				}
			}
			for (int j = 1; j <= i ;j++)
			{
				for (int k = j + 1; k <= i; k++)
				{
					if (a[j] == 2 * a[k] || a[k] == 2 * a[j])
					{
						n++;
					}
				}
			}
			System.out.print(n);
			System.out.print("\n");
		}
		return 0;
	}
}

