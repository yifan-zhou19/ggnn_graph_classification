package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[1000][50];
		int m;
		int i;
		int[] b = new int[1000];
		int sum;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1 ; i <= m ; i++)
		{
				a[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
				b[i] = String.valueOf(a[i]).length();
		}
		sum = 0;
		for (i = 1 ; i <= m - 1 ; i++)
		{
			sum = sum + b[i] + 1;
			if (sum < 80 && sum + b[i + 1] > 80)
			{
				System.out.print(a[i]);
				System.out.print("\n");
				sum = 0;
			}
			else if (sum == 80)
			{
				System.out.print(a[i]);
				System.out.print("\n");
				sum = 0;
			}
			else if (sum == 81)
			{
				sum = 0;
				System.out.print(a[i]);
				System.out.print("\n");
			}
			else
			{
			System.out.print(a[i]);
			System.out.print(" ");
			}
			{
				cout << a[i] << endl ;
				sum = 0 ;
			}
			else if(sum == 80)
			{
				cout << a[i] << endl ;
				sum = 0 ;
			}
			else
			{
				cout << endl << a[i] ;
				sum = b[i] ;
			}*/
		}
		System.out.print(a[m]);
		return 0;
	}


}

