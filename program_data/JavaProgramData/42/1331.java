package <missing>;

public class GlobalMembers
{
	//***********************************************
	//???:????????                       *
	//??????                                  *
	//??10?29?                                  *
	//***********************************************
	public static int Main()
	{
		int[] a = new int[100000];
		int n;
		int s;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			 a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		s = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[n] = s;
		for (i = 0; i < n; i++)
		{
			 if (a[i] == s)
			 {
			 for (j = i + 1; j < n; j++)
			 {
				 if (a[j] != s)
				 {
					 a[i] = a[j];
					 a[j] = s;
					 break;
				 }
			 }
			 }
		}
		for (i = 0; i < n; i++)
		{
			if (a[i] == s)
			{
			break;
			}
			System.out.print(a[i]);
			if (a[i + 1] != s)
			{
			System.out.print(" ");
			}
		}
		return 0;

	}

}

