import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 *???: party.cpp
	 *??: ???
	 *????: 2012-11-09
	 *??: 
	 */



	public static int Main()
	{
		int[] times = new int[1000];
		int[] start = new int[1000];
		int[] end = new int[1000];
		int nPeople = 0;
		int mostPeople;
		String str = new String(new char[10000]);
		str = new Scanner(System.in).nextLine();
		int readnum = 0;
		for (int i = 0; ;i++)
		{
			switch (str.charAt(i))
			{
				case ',':
				case '\0':
					start[nPeople++] = readnum;
					readnum = 0;
					break;
				default:
					readnum = readnum * 10 + str.charAt(i) - '0';
			}
			if (!str.charAt(i))
			{
				break;
			}
		}
		for (int i = 0;i < nPeople;i++)
		{
			char endchr;
			if (i < nPeople-1)
			{
				endchr = ',';
			}
			else
			{
				endchr = '\n';
			}
			cin.getline(str,(Character.SIZE / Byte.SIZE),endchr);
			end[i] = Integer.parseInt(str);
		}
		for (int i = 0;i < nPeople;i++)
		{
			for (int j = start[i];j < end[i];j++)
			{
				times[j]++;
			}
		}
		mostPeople = times[0];
		for (int i = 1;i < 1000;i++)
		{
			if (times[i] > mostPeople)
			{
				mostPeople = times[i];
			}
		}
		System.out.print(nPeople);
		System.out.print(' ');
		System.out.print(mostPeople);
		System.out.print("\n");
	}



}
