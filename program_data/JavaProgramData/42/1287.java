package <missing>;

public class GlobalMembers
{
	//**********************************
	//*  ????homework_2.cpp        *
	//*  ??????1200012884        * 
	//*  ?????2012?10?29?      *
	//*  ?????????????    *
	//**********************************

	public static int Main()
	{
		int n;
		int[] a = new int[100000];
		int del;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		del = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			if (a[i] == del)
			{
				for (j = i;j < n - 1;j++)
				{
					a[j] = a[j + 1];
				}
				n = n - 1;
				i = i - 1;
			}
		}
		System.out.print(a[0]);
		for (i = 1;i < n;i++)
		{
			System.out.print(" ");
			System.out.print(a[i]);
		}
		return 0;
	}


}

