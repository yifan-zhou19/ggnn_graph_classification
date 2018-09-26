package <missing>;

public class GlobalMembers
{
	//**************************
	//*?????2?N??     **
	//*??????           **
	//*???20131114         **
	//************************** 
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int nLen;
		int h;
		int lg;
		int q;
		int flag;
		int[] a = new int[9999];
		int[] b = new int[9999];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 0)
		{
			System.out.print("1");
			System.out.print("\n");
		}
		if (n == 1)
		{
			System.out.print("2");
			System.out.print("\n");
		}
		if (n != 0 && n != 1)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(b,0,(Integer.SIZE / Byte.SIZE)); //????
			a[0] = 2;
			lg = 1;
			for (i = 1; i <= n - 1; i++)
			{
				for (j = 0; j <= lg - 1; j++)
				{
					b[j] = 2 * a[j]; //?????2
				}
				for (q = 0; q <= n - 1; q++)
				{
					if (q == lg - 1)
					{
						if (b[q] > 9)
						{
							lg++;
						}
					}
					if (b[q] > 9)
					{
						b[q] -= 10;
						b[q + 1] += 1; //????10???
					}
				}
				for (k = 0; k <= lg - 1; k++)
				{
					a[k] = b[k]; //??
				}
			}
			for (h = lg - 1; h >= 0; h--)
			{
				System.out.print(a[h]);
			}
			System.out.print("\n");
		}
		return 0;
	}
}

