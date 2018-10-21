import java.util.*;

package <missing>;

public class GlobalMembers
{
	//********************************
	//*n-gram????*****************
	//*???1300012920**************
	//********************************
	public static int Main()
	{
		String word = new String(new char[600]);
		char[][] gram = new char[600][10]; //?????????
		char[][] temp = new char[600][10];
		int[] cnt = new int[600];
		int count = 0;
		int i;
		int j;
		int n;
		int len;
		int max = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.in.read();
		word = new Scanner(System.in).nextLine(); //??????
		len = word.length(); //??????????????????????
		for (i = 0 ; i < len - n + 1 ; i++)
		{
			for (j = i ; j <= i + n - 1 ; j++)
			{
				*(gram[i] + count) = *(word.Substring(j));
				count++;
			}
			*(gram[i] + count) = '\0';
			count = 0;
		}
		//???????gram[][]???temp[][]?
		for (i = 0 ; i < len - n + 1 ; i++)
		{
			*(temp + i) = *(gram + i);
		}
		//gram?temp??????gram?????
		//?????????????
		for (i = 0 ; i < len - n + 1 ; i++)
		{
			for (j = 0 ; j < len - n + 1 ; j++)
			{
				if (strcmp(*(gram + i),*(temp + j)) == 0)
				{
					cnt[i] += 1;
				}
			}
		}
		//??????
		for (i = 0 ; i < len - n + 1 ; i++)
		{
			if (cnt[i] > max)
			{
				max = cnt[i];
			}
		}
		//??????1???????
		if (max > 1)
		{
			System.out.print(max);
			System.out.print("\n");
			for (i = 0 ; i < len - n + 1 ; i++)
			{
				if (cnt[i] == max && i == 0) //??????????????????
				{
					System.out.print((gram + i));
					System.out.print("\n");
				}
				if (cnt[i] == max && i > 0)
				{
					for (j = 0 ; j < i ; j++) //??????????????????????????????
					{
						if (strcmp(*(gram + i),*(gram + j)) == 0)
						{
							break;
						}
						if (j == i - 1)
						{
							System.out.print((gram + i));
							System.out.print("\n");
						}
					}
				}
			}
		}
		//?????????1???NO
		else
		{
			System.out.print("NO");
			System.out.print("\n");
		}
		return 0;
	}




}

