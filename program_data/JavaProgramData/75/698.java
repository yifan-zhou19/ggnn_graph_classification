package <missing>;

public class GlobalMembers
{
	//**********************************
	//*??:????? ***
	//*??:??? 1300012991 ***
	//*??:2013?11?4? ***
	//**********************************

	public static int Main()
	{
		int n; //????
		int i;
		int j;
		int count;
		int num = 1;
		int[] a = new int[1000];
		int[] b = new int[1000];
		char sp; //????sp
	//	int *a = new int [n]; //????a?b
	//	int *b = new int [n];
		for (i = 0; ; i++) //??a????????????
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sp = System.in.read();
			if (sp == '\n')
			{
				break;
			}
		}
		n = i + 1;
		for (i = 0; i < n; i++) //??b????????????
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sp = System.in.read();
			if (sp == '\n')
			{
				break;
			}
		}
		for (i = 1; i < 1002; i++) //???????????????
		{
			count = 0;
			for (j = 0; j < n; j++)
			{
				if (i >= a[j] != 0 && i < b[j])
				{
					count = count++;
				}
			}
			num = (count > num != 0 ? count: num); //????
		}
		System.out.print(n);
		System.out.print(" ");
		System.out.print(num);
		return 0;
	}

}

