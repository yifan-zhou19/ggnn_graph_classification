import java.util.*;

public class date
{
	public int year;
	public int month;
	public int day;
}

package <missing>;

public class GlobalMembers
{
	public static date[] data = tangible.Arrays.initializeWithDefaultdateInstances(3);
	public static int[] pingrun = {0, 365, 366};
	public static int[] len = new int[3];
	public static int[][] monthDays =
	{
		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
		{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
		{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
	};
	public static int nian;
	public static int yue;
	public static int ri;
	public static int[] leap = new int[3];
	public static int[] jiange = new int[3];
	public static int i;
	public static int j;
	public static int compute(int x, int y, int z)
	{ //int monthDays[3][13]={{0,0,0,0,0,0,0,0,0,0,0,0,0},{0,31,28,31,30,31,30,31,31,30,31,30,31},{0,31,29,31,30,31,30,31,31,30,31,30,31}};
		int cd = 0;
		int i = 1;
		if (x == 1)
		{
			return y;
		}
		while (i < x)
		{
			cd += monthDays[1 + z][i];
			i++;
		}
		return cd + y;
	}
	public static void canliang(String str, int x)
	{
		int len;
		int i = 0;
		len = str.length();
		while (str[i].equals(' '))
		{
			i++;
		}
		while (Character.isDigit(str[i]))
		{
			data[x].year = data[x].year * 10 + str[i] - '0';
			i++;
		}
		while (str[i].equals(' '))
		{
			i++;
		}
		while (Character.isDigit(str[i]))
		{
			data[x].month = data[x].month * 10 + str[i] - '0';
			i++;
		}
		while (str[i].equals(' '))
		{
			i++;
		}
		while ((str[i].compareTo('0') >= 0) && (str[i].compareTo('9') <= 0) && i < len)
		{
			data[x].day = data[x].day * 10 + str[i] - '0';
			i++;
		}
		//cout << data[x].year << ' ' << data[x].month << ' ' << data[x].day << endl;
		leap[x] = ((data[x].year % 4 == 0 && data[x].year % 100 != 0) || (data[x].year % 400 == 0));
		jiange[x] = compute(data[x].month, data[x].day, leap[x]); //???????????????
	//	cout << jiange[x] << endl;
	}
	public static int Main()
	{
		int sum = 0;
		int res;
		data[1].year = data[1].month = data[1].day = 0;
		data[2].year = data[2].month = data[2].day = 0;
		String rizi1 = new String(new char[500]);
		String rizi2 = new String(new char[500]);
		rizi1 = new Scanner(System.in).nextLine();
		//cin.get();
		rizi2 = new Scanner(System.in).nextLine();
		//cout << rizi[1] << endl;
		//cout << rizi[2] << endl;
		canliang(rizi1, 1);
		canliang(rizi2, 2);
		nian = Math.abs(data[2].year - data[1].year);
		//cout << "jiange1" << jiange[1]<<" " <<  "jiange2" << jiange[2] << endl;
	   //	cout << nian << endl;
		if (nian == 0)
		{
			System.out.print(Math.abs(jiange[2] - jiange[1]));
			System.out.print("\n");
		}
		else if (nian == 1)
		{
			System.out.print((pingrun[leap[1] + 1] - jiange[1] + jiange[2]));
			System.out.print("\n");
		}
		else if (nian >= 2)
		{
			for (i = data[1].year + 1; i < data[2].year; i++)
			{
				res = (i % 4 == 0 && i % 100 != 0) || (i % 400 == 0);
				sum += pingrun[res + 1];
			}
			sum += jiange[2];
			res = pingrun[leap[1] + 1] - jiange[1];
			sum += res;
			System.out.print(sum);
			System.out.print("\n");
		}
			return 0;
	}




}

