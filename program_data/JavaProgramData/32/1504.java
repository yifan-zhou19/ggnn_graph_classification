import java.util.*;

package <missing>;

public class GlobalMembers
{
	//********************************
	//*????????   **
	//*?????? 1300012745 **
	//*???2013.11.19  **
	//********************************
	public static int Main()
	{
		String stra = new String(new char[102]);
		String strb = new String(new char[102]);
		int n;
		int[] num1 = new int[102];
		int[] num2 = new int[102];
		int[] num = new int[102];
		int i;
		int lena;
		int lenb;
		int j;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			System.in.read();
			stra = new Scanner(System.in).nextLine();
			strb = new Scanner(System.in).nextLine();
			lena = stra.length();
			lenb = strb.length();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(num1,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(num2,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(num,0,(Integer.SIZE / Byte.SIZE));
			k = 0;
			for (j = lena - 1; j >= 0; j--)
			{
				num1[k++] = stra.charAt(j) - '0';
			}
			k = 0;
			for (j = lenb - 1; j >= 0; j--)
			{
				num2[k++] = strb.charAt(j) - '0';
			}
			for (j = 0; j < 102; j++)
			{
				num1[j] -= num2[j];
				if (num1[j] < 0)
				{
					num1[j] += 10;
					num1[j + 1]--;
				}
			}
			j = lena;
			while (num1[j] == 0)
			{
				j--;
			}
			for (k = j; k >= 0; k--)
			{
				System.out.print(num1[k]);
			}
			System.out.print("\n");
		}
		return 0;
	}









}

