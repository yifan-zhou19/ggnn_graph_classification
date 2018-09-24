package <missing>;

public class GlobalMembers
{
	//**************************
	//*????????       **
	//*??????           **
	//*???20131114         **
	//**************************
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int nLen1;
		int nLen2;
		int num1;
		int num2;
		int[] a = new int[101];
		int[] b = new int[101];
		int[] c = new int[101];
		String str1 = new String(new char[101]);
		String str2 = new String(new char[101]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n ;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(str1,0,(Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(str2,0,(Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(b,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(c,0,(Integer.SIZE / Byte.SIZE));
			nLen1 = 0;
			nLen2 = 0;
			num1 = 0;
			num2 = 0;
			str1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
			str2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
			nLen1 = str1.length();
			nLen2 = str2.length();
			for (j = nLen1 - 1; j >= 0; j--)
			{
				a[num1++] = str1.charAt(j) - '0';
			}
			for (k = nLen2 - 1; k >= 0; k--)
			{
				b[num2++] = str2.charAt(k) - '0';
			}
			for (int t = 0; t <= nLen2 - 1; t++)
			{
				if (a[t] >= b[t])
				{
					c[t] = a[t] - b[t];
				}
				else
				{
					c[t] = a[t] - b[t] + 10;
					a[t + 1] -= 1;
				}
			}
			for (int q = nLen2; q <= nLen1 - 1; q++)
			{
				c[q] = a[q];
			}
			for (int l = nLen1 - 1; l >= 0; l--)
			{
				System.out.print(c[l]);
			}
			System.out.print("\n");
		}






		return 0;
	}

}

