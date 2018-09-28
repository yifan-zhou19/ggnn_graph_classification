package <missing>;

public class GlobalMembers
{
	//**********************************
	//*  ????homework_9.cpp        *
	//*  ??????1200012884        * 
	//*  ?????2012?10?31?      *
	//*  ??????????          *
	//**********************************

	public static int Main()
	{
		int n;
		int m;
		int i;
		int count;
		int temp;
		int[] a = new int[10000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n != 0 || m != 0)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a, 0, (Integer.SIZE / Byte.SIZE));
			count = n;
			i = 1;
			while (count != 1)
			{
				temp = 0;
				while (temp != m - 1)
				{
					if (a[i] == 0)
					{
						temp++;
					}
					i++;
					if (i > n)
					{
						i -= n;
					}
				}
				while (a[i] == 1)
				{
					i++;
					if (i > n)
					{
						i -= n;
					}
				}
				a[i] = 1;
				count--;
			}
			for (i = 1;i <= n;i++)
			{
				if (a[i] == 0)
				{
					System.out.print(i);
					System.out.print("\n");
				}
			}
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		return 0;
	}

}

