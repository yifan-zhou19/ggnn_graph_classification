import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int l;
		int r;
		int fl;
		int lenth;
		int i;
		int j;
		int k;
		String str = new String(new char[100 + 10]);
		int[] left = new int[101];
		int[] right = new int[101];
		int[] flag = new int[100 + 10];

		while (str = new Scanner(System.in).nextLine())
		{
			l = 1;
			r = 1;
			for (lenth = 0 ; str.charAt(lenth) != '\0' ; lenth++)
			{
				if (str.charAt(lenth) == '(')
				{
					flag[lenth] = 1;
					left[l++] = lenth;
				}
				else if (str.charAt(lenth) == ')')
				{
					flag[lenth] = 2;
					right[r++] = lenth;
				}
				else
				{
					flag[lenth] = 0;
				}
			}

			fl = lenth - 1;

			for (j = l - 1 ; j >= 1 ; j--)
			{
				for (k = 1 ; k <= r - 1 ; k++)
				{
					if (right[k] > left[j])
					{
						flag[right[k]] = 0;
						flag[left[j]] = 0;
						right[k] = -1;
						break;
					}
				}
			}

			for (lenth = 0 ; str.charAt(lenth) != '\0' ; lenth++)
			{
				System.out.printf("%c",str.charAt(lenth));
			}

				System.out.print("\n");

			/*for( j = fl ; j >= 0; j --)
				if(flag[j] != 0) break; */

			/*for( i = 0 ; i <= fl ; i ++)
				if(flag[i] != 0 ) break;*/

			for (lenth = 0 ; lenth <= fl ; lenth++)
			{
				if (flag[lenth] == 0)
				{
					System.out.print(" ");
				}
				else if (flag[lenth] == 1)
				{
					System.out.print("$");
				}
				else if (flag[lenth] == 2)
				{
					System.out.print("?");
				}
			}

			System.out.print("\n");
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(str,0,(Character.SIZE / Byte.SIZE));
		}

		return 0;
	}











}
