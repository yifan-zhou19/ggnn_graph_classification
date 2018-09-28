package <missing>;

public class GlobalMembers
{
	/*
	??? 
	1000012905
	?????????????????????????????????" "? 
	*/ 

	public static int Main()
	{
		int n;
		int i;
		int k;
		int j;
		int sum = 0;
		int p = 0;
		int t;

		//??	
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		for (i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		//???????k?????sum? 
		for (j = 0; j < n; j++)
		{
			if (k != a[j])
			{
				if (p != 0)
				{
				System.out.print(" ");
				}
				System.out.print(a[j]);
				p++;
			}
		}
		return 0;
	}
}

