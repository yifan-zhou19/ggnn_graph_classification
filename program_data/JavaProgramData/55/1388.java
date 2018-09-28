package <missing>;

public class GlobalMembers
{
	//????  ??? 12858

	public static int turntoten(int a, String n) //?n???a???10?????c?
	{
		int ans = 0;
		int i;
		int l;
		int lc;
		int w;
		l = n.length();
		lc = 1;
		for (i = l - 1; i >= 0; i--)
		{
			if ((n[i].compareTo('0') >= 0) && (n[i].compareTo('9') <= 0))
			{
				w = n[i] - '0';
			}
			if ((n[i].compareTo('a') >= 0) && (n[i].compareTo('z') <= 0))
			{
				w = n[i] - 'a' + 10;
			}
			if ((n[i].compareTo('A') >= 0) && (n[i].compareTo('Z') <= 0))
			{
				w = n[i] - 'A' + 10; //?w??n??????
			}
			ans += w * lc;
			lc *= a;
		}
		return ans;
	}

	public static void turntob(int b,int c)
	{
		String ans = new String(new char[100]);
		int j;
		int i = 0;
		int ys = 0;
		if (c == 0)
		{
			System.out.print(0);
		}
		while (c > 0) //???????????b???
		{
			ys = c % b;
			if (ys >= 10)
			{
				ans = tangible.StringFunctions.changeCharacter(ans, i, (char) 55 + ys);
			}
			else
			{
				ans = tangible.StringFunctions.changeCharacter(ans, i, (char) 48 + ys);
			}
			i++;
			c = c / b;
		}
		for (j = i - 1; j >= 0; j--)
		{
			System.out.print(ans.charAt(j));
		}
	}

	public static int Main()
	{
		int a;
		int b;
		int c; //c?n???????
		String n = new String(new char[100]);
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		c = turntoten(a, n); //?n???a???10?????c?
		turntob(b, c); //?c???b??????
		System.out.print("\n");
		return 0;
	}
}

