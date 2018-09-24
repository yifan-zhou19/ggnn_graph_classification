package <missing>;

public class GlobalMembers
{
	/**
	* @file 2.cpp
	* @author ??? 1100012944
	* @date 2011-11-12
	* @description
	* ???????????
	*/
	public static int change1(String n, int a)
	{
		int s;
		int y = 0;
		int i;
		for (i = 0; !n[i].equals('\0'); i++)
		{
			if (n[i].compareTo('0') >= 0 && n[i].compareTo('9') <= 0)
			{
				s = n[i] - '0'; //9???????10????
			}
			else if (n[i].compareTo('A') >= 0 && n[i].compareTo('Z') <= 0)
			{
				s = n[i] - 'A' + 10;
			}
			else
			{
				s = n[i] - 'a' + 10;
			}
			y = y * a + s;
		}
		return y;
	}
	public static int Main()
	{
		int a;
		int b;
		int i = 0;
		int j;
		int s;
		int t;
		String n = new String(new char[200]);
		String r = new String(new char[200]);
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		s = change1(n, a);
		while (s >= b)
		{
			t = s % b;
			if (t >= 0 && t <= 9)
			{
				r = tangible.StringFunctions.changeCharacter(r, i, t + '0');
			}
			else
			{
				r = tangible.StringFunctions.changeCharacter(r, i, t - 10 + 'A');
			}

			i++;
			s = s / b;
		}
		if (s >= 0 && s <= 9)
		{
			r = tangible.StringFunctions.changeCharacter(r, i, s + '0');
		}
		else
		{
			r = tangible.StringFunctions.changeCharacter(r, i, s - 10 + 'A');
		}
		for (j = i; j >= 0; j--)
		{
			System.out.print(r.charAt(j));
		}
		return 0;
	}




}

