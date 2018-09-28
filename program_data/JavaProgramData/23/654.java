import java.util.*;

package <missing>;

public class GlobalMembers
{
	//============================================================================
	// Name        : array0213.cpp
	// Author      : 1300012911
	// Version     : 20131113,Wed,10th week
	// Copyright   :
	// Description : ????
	//============================================================================


	public static int Main()
	{
		int i = 0;
		int len = 0;
		int l = -1;
		int num = 0; //????
		int front = 0; //???????????????
		int back = 0;
		String s = new String(new char[101]); //?????
		char[][] a = new char[100][100]; //????
		//??????11???
		s = new Scanner(System.in).nextLine();
		len = s.length();
		front = 0;
		while (s.charAt(front) == ' ')
		{
			front++;
		}
		back = len - 1;
		while (s.charAt(back) == ' ')
		{
			back--;
		}
		for (i = front;i <= back;i++)
		{
			if (s.charAt(i) != ' ')
			{
				l++;
				a[num][l] = s.charAt(i);
			}
			else if (s.charAt(i - 1) != ' ')
			{
				l++;
				a[num][l] = '\0';
				num++;
				l = -1;
			}
		}
		l++;
		a[num][l] = '\0';
		num++;
		//????
		for (i = num - 1;i >= 0;i--)
		{
			if (i == 0)
			{
				System.out.print(a[i]);
			}
			else
			{
				System.out.print(a[i]);
				System.out.print(' ');
			}
		}
		return 0;
	}

}
