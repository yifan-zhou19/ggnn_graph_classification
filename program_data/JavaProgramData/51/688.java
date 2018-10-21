import java.util.*;

package <missing>;

public class GlobalMembers
{
	//************************************************************************
	//*???3.cpp                                                         
	//*???n-gram????                                                        
	//*??????                                                          
	//*???2013?12?12?                                                   
	//************************************************************************
	public static int Main()
	{
		int n; //????num???????????
		int i;
		int j;
		int k;
		int[] num = new int[510];
		int max = 1;
		String str = new String(new char[510]); //??put?????????
		char[][] put = new char[510][8];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read(); //??n???\0
		str = new Scanner(System.in).nextLine();
		int len = str.length();
		for (i = 0; i <= len - n; i++)
		{
			k = 0;
			for (j = i ; j < i + n; j++)
			{
				put[i][k] = str.charAt(j);
				k++;
			}
			put[i][k] = '\0';
		}
		for (i = 0; i <= len - n; i++)
		{
			for (j = i; j <= len - n; j++)
			{
				if (strcmp(put[i], put[j]) == 0)
				{
					num[i]++;
				}
			}
		}
		for (i = 0; i < len - n; i++)
		{

			if (num[i] > max)
			{
				max = num[i];
			}
		}
		if (max == 1)
		{
			System.out.print("NO");
			System.out.print("\n");
		}
		else
		{
			System.out.print(max);
			System.out.print("\n");
			for (i = 0; i < len - n; i++)
			{
				if (num[i] == max)
				{
					System.out.print(put[i]);
					System.out.print("\n");

				}
			}
		}

		return 0;
	}


}

