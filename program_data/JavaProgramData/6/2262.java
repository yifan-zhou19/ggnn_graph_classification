package <missing>;

public class GlobalMembers
{
	//***********************************************************************
	//???????? 
	//???????? 
	//??????
	//***********************************************************************
	public static int Main()
	{
		int k;
		int m;
		int n;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < k; i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			int sum = 0;
			int[][] a = new int[100][100];
			for (int j = 0; j < m; j++)
			{
				for (int l = 0; l < n; l++)
				{
					a[j][l] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			p = a[0];
			for (int j = 0; j < n; j++)
			{
				sum += *p++;
			}
			if (m - 1 != 0)
			{
				p = a[m - 1];
				for (int j = 0; j < n; j++)
				{
				   sum += *p++;
				}
			}
				for (int j = 1; j < m - 1; j++)
				{
				   p = a[j];
				  // cout<<*p<<' '<<*(p + n - 1)<<endl;
				   sum += *p;
				   sum += *(p + n - 1);
				}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}
}

