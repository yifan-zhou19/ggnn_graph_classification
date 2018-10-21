import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String word = new String(new char[100000 + 1]);
		char h;
		int t;
		int i;
		int j;
		int k;
		int n;
		int min;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}

		for (i = 1 ; i <= t ; i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(word,0,(Character.SIZE / Byte.SIZE));
			if (i == 1)
			{
				h = System.in.read();
			}
			word = new Scanner(System.in).nextLine();
					int[][] flag = new int[2][30];
			p = 0;
			min = 30;

			for (j = 0 ; word.charAt(j) != '\0' ; j++)
			{
				n = word.charAt(j) - 'a';
				flag[0][n]++;
				flag[1][n] = j;
			}

			for (k = 0 ; k <= 25 ; k++)
			{
				if (flag[0][k] == 1)
				{
					p = 1;
					if (min > flag[1][k])
					{
						min = flag[1][k];
					}
				}
			}

			if (p == 1)
			{
				System.out.printf("%c\n",word.charAt(min));
			}
			else
			{
				System.out.print("no\n");
			}
		}
		return 0;

	}












}

