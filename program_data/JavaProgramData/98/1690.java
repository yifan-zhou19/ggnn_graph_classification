package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int j;
		int sum = 0;
		int len;
		int sum1;
		char[][] before = new char[500][40];
		char c;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0 ; i < n ; i++)
		{
			j = 0;
			p = (before + i);
			while (true)
			{
				c = System.in.read();
				if (c == ' ' || c == '\n')
				{
					continue;
				}
				else
				{
					break;
				}
			}
			*p = c;
			while (true)
			{
				c = System.in.read();
				if (c == ' ' || c == '\n')
				{
					break;
				}
				else
				{
					*++p = c;
				}
			}
			*++p = '\0';
		}
		/*	for ( i = 0 ; i < n ; i++ )
		{
			cout << before[i] << " " ;
		}*/
		for (i = 0 ; i < n ; i++)
		{
			len = String.valueOf(before[i]).length();
			sum = sum + len;
			sum1 = sum + 1 + String.valueOf(before[i + 1]).length();
			if (sum > 80)
			{
				sum = len;
				sum1 = sum + 1 + String.valueOf(before[i + 1]).length();
				System.out.print("\n");
			}
			System.out.print(before[i]);
			if (i < n - 1 && sum1 <= 80)
			{
				System.out.print(" ");
				sum++;
			}
			else
			{
				sum++;
			}
		}
		return 0;
	}

}

