package <missing>;

public class GlobalMembers
{
	/*
	??? 
	1000012905
	????????????????????????????????" "? 
	*/ 

	public static int Main()
	{
		int n;
		int i;
		int k;
		int j;
		int p = 0;
		int t;
		int q = 0;

		//??	
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[100000];
		for (i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		//???k?????? 
		for (j = 0; j < n; j++)
		{
			if (k != a[j])
			{
				a[q] = a[j];
				if (p != 0)
				{
				System.out.print(" ");
				}
				System.out.print(a[q]);
				p++;
				q++;
			}
		}
		return 0;
	}
}

