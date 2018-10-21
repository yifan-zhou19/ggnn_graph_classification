package <missing>;

public class GlobalMembers
{
	/*
	??? 
	1000012905  
	*/
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int g;
		int p = 0;

		//?? 
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n + 1];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a, 0, (Integer.SIZE / Byte.SIZE));
		for (i = 1; i <= n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}

		//??????? 
		for (j = 1; j <= n; j++)
		{
			g = 0;

			//????????? 
			for (k = 1; k <= j - 1; k++)
			{
				if (a[j] == a[k])
				{
					g = 1;
				}
			}

			//????????????? 
			if (g == 0)
			{
				if (p != 0)
				{
					System.out.print(" ");
				}
				System.out.print(a[j]);
				p++; //????????
			}
		}
		return 0;
	}
}

