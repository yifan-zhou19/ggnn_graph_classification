import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[252]);
	public static String b = new String(new char[252]);
	public static int[] an = new int[252];
	public static int[] bn = new int[252];
	public static int[] rn = new int[252];
	public static String res = new String(new char[252]);
	public static String temp = new String(new char[252]);
	public static int lenA;
	public static int lenB;
	public static int len;
	public static void change()
	{
		int i;
		for (i = 0; i < lenA; i++)
		{
			an[i] = a.charAt(lenA - i - 1) - '0';
		//	cout << an[i];
		}
	//	cout << endl;
		for (i = 0; i < lenB; i++)
		{
			bn[i] = b.charAt(lenB - i - 1) - '0';
		//	cout << bn[i];
		}
		//cout << endl;
		if (lenA > lenB)
		{
			len = lenA;
			for (i = lenB; i < lenA; i++)
			{
				bn[i] = 0;
			}
		}
		else if (lenB > lenA)
		{
			len = lenB;
			for (i = lenA; i < lenB; i++)
			{
				an[i] = 0;
			}
		}
		else
		{
			len = lenB;
		}
	//	cout <<"len: " << len << endl;
	}
	public static void addAB()
	{
		int i;

		for (i = 0; i < len; i++)
		{
			rn[i] += an[i] + bn[i];
			if (rn[i] > 9)
			{
				rn[i] = rn[i] - 10;
				rn[i + 1]++;
			}
		}
	//	cout << "len: " << i << ":  " << rn[i] << endl;
	//		cout << len << endl;
		if (rn[i] == 1)
		{
			len++;
		}
	//	cout << len << endl;

		for (i = 0; i < len; i++)
		{
			temp = tangible.StringFunctions.changeCharacter(temp, i, rn[len - i - 1] + '0');
	//		cout << temp[i];
		}
	//	cout << endl;
		int begin = 1;
	//	cout << "temp[0]: " << temp[0] << endl;
	//	if(temp[0] == 0)
	//		begin = 1;
	//	cout << "begin: " << begin << endl;
		while (temp.charAt(begin) == 0)
		{
			begin++;
		}
		if (len == 1)
		{
			begin = 0;
		}
		if (temp.charAt(0) != '0')
		{
			begin = 0;
		}
	//		cout << "len: " << len << endl;
	//	cout << "begin: " << begin << endl;
		for (i = 0; i < len - begin; i++)
		{
			res = tangible.StringFunctions.changeCharacter(res, i, temp.charAt(i + begin));
		}
	}

	public static int Main()
	{


		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		lenA = a.length();
		lenB = b.length();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(rn, 0, (Integer.SIZE / Byte.SIZE));
		change();
		addAB();
		System.out.print(res);
		System.out.print("\n");
		return 0;
	}
}

