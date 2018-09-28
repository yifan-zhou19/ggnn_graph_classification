package <missing>;

public class GlobalMembers
{
	// ?????? ???1000010500 
	// ??2?N?? 
	// 2010-12-15


	public static int Main()
	{
		int[] a = new int[32];
		int i;
		int j;
		int N;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE)); // ???
		if (N == 1) // 1??????2
		{
		   System.out.print("2");
		   System.out.print("\n");
		}
		else if (N == 0)
		{
			 System.out.print("1");
			 System.out.print("\n");
		}
		else
		{
			a[0] = 2;
			for (i = 1;i < N;i++)
			{
				for (j = 0;j < 32;j++) // ????2
				{
					a[j] *= 2;
				}
				for (j = 0;j < 32;j++)
				{
				if (a[j] > 9) // ??
				{
						 a[j] -= 10;
						 a[j + 1]++;
				}
				}
			}
			for (i = 31;i >= 0;i--) // ?????0???
			{
				if (a[i] != 0)
				{
				   break;
				}
			}
			for (i = i;i >= 0;i--)
			{
				System.out.print(a[i]);
			}
			System.out.print("\n");
		}
		return 0;
	}



}

