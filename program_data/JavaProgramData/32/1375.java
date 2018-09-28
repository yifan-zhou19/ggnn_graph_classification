import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[101]);
		String str2 = new String(new char[101]);
		String kongge = new String(new char[101]);
		int[] num1 = new int[101];
		int[] num2 = new int[101];
		int[] result = new int[101];
		int len1;
		int len2;
		int i;
		int j;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 1; i <= n; i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(str1, 0, 101);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(str2, 0, 101);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(num1, 0, 101);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(num2, 0, 101);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(result, 0, 101);
			str1 = new Scanner(System.in).nextLine();
			len1 = str1.length();
			for (j = 0; j < len1 ; j++)
			{
				num1[j] = str1.charAt(j) - '0';
			}
			str2 = new Scanner(System.in).nextLine();
			len2 = str2.length();
			for (j = 0; j < len2; j++)
			{
				num2[len1 - 1 - j] = str2.charAt(len2 - 1 - j) - '0';
			}
			for (j = len1 - 1; j >= len1 - len2; j--)
			{
				if (num1[j] >= num2[j])
				{
					num1[j] = num1[j] - num2[j];
				}
				else
				{
					num1[j] = 10 + num1[j] - num2[j];
	//				if(num1[j - 1] > 0)
						num1[j - 1] = num1[j - 1] - 1;
	/*				else
					{
						int t = j - 1;
						while(num1[t] == 0)
						{
							num1[t] = 9;
							t--;
						}
						num1[t] = num1[t] - 1;
					}*/
				}
			}
			j = 0;
			while (num1[j] == 0)
			{
				j++;
			}
			for (; j < len1; j++)
			{
				System.out.print(num1[j]);
			}
			System.out.print("\n");
			kongge = new Scanner(System.in).nextLine();
		}
		return 0;
	}







}

