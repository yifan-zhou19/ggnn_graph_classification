package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] str = new int[111];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		int n;
		int m;
		int i;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 0 ; i < n ; i++)
		{
			str[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}

		p = str + n;

		//*p = '\0' ;

		//p = str + n - m ;

		for (i = 0 ; i < n - m ; i++)
		{
			*(p++) = str[i];
			//cout << *(p-1) << ' ' ;
		}

		*p = '\0';

		p = str + n - m;

		System.out.print(p);

		for (p = str + n - m + 1 ; p < str + n + n - m ; p++)
		{
			System.out.print(' ');
			System.out.print(p);
		}

		return 0;
	}



}

