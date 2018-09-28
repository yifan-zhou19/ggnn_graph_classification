import java.util.*;

package <missing>;

public class GlobalMembers
{
	//****************************************************** 
	//* ? ? ?   ??????                            *
	//* ? ?      ????                                *
	//* ? ? ? ??2010 ? 11 ? 17 ?                   * 
	//* ? ?      ?1000012758                            *
	//****************************************************** 
	public static int Main()
	{
		int n;
		int[][] a = new int[3][100];
		int size;
		int m;
		String temp = new String(new char[101]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a,0,(Integer.SIZE / Byte.SIZE));
			//Input & Convert
			for (int j = 0; j < 2; j++)
			{
				m = 99;
				do
				{
					temp = new Scanner(System.in).nextLine();
				}while (temp.charAt(0) == '\0');
				size = temp.length();
				for (int k = size - 1; k >= 0; k--)
				{
					a[j][m--] = temp.charAt(k) - 48;
				}
			}
			//Minus
			for (int j = 99; j >= 0; j--)
			{
				a[2][j] = a[0][j] - a[1][j];
				if (a[2][j] < 0)
				{
					a[0][j - 1]--;
					a[2][j] += 10;
				}
			}
			//Output
			m = 0;
			for (int j = 0; j < 100; j++)
			{
				if (a[2][j] != 0)
				{
					m = 1;
				}
				if (m != 0)
				{
					System.out.print(a[2][j]);
				}
			}
			System.out.print("\n");
		}
		return 0;
	}
}

