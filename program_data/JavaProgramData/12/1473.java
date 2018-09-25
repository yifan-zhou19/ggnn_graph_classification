package <missing>;

public class GlobalMembers
{
	//**************************
	//*?????              **
	//*?????? 1300012863 **
	//*???2013.11.1        **
	//**************************
	public static int Main()
	{
		int[] a = new int[20];
		int n;
		int i;
		int j;
		int k;
		for (k = 1; ;k++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		 memset(a,0,(Integer.SIZE / Byte.SIZE));
		n = 0;
		i = 1;
		a[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (a[1] != (-1))
		{
			if (a[1] != 0)
			{
			for (i = 1; ;)
			{
				i++;
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (a[i] != 0)
				{
				for (j = 1;j <= (i - 1);j++)
				{
					if ((a[i] == 2 * a[j]) || (a[j] == 2 * a[i]))
					{
						n = n + 1;
					}
				}
				}
				else
				{
				System.out.print(n);
				System.out.print("\n");
				break;
				}
			}
			}
		}
		else
		{
			break;
		}
		}
	return 0;
	}

}

