package <missing>;

public class GlobalMembers
{
	/*???????
	  ??????
	  ???1100012802*/

	public static void trans(int num,int b)
	{
		int m;
		char l;
		if (num != 0)
		{
			m = num % b;
			if (m >= 10)
			{
				l = 'A' + m - 10;
			}
			else
			{
				l = m + '0';
			}
			num = num / b;
			trans(num, b);
			System.out.print(l);
		}
	}

	public static void shuzhi(String m, int a, int b)
	{
		int i = 0; //i?????
		int temp;
		int num = 0;
		while (!m[i].equals(' '))
		{
			if (m[i].compareTo('a') >= 0 && m[i].compareTo('z') <= 0)
			{
				temp = m[i] - 'a' + 10;
			}
			else if (m[i].compareTo('A') >= 0 && m[i].compareTo('Z') <= 0)
			{
				temp = m[i] - 'A' + 10;
			}
			else
			{
				temp = m[i] - '0';
			}
			num = num * a + temp;
			i++;
		}
		if (num == 0)
		{
			System.out.print(0);
		}
		else
		{
			trans(num, b);
		}
	}

	public static int Main()
	{
		String a = new String(new char[20]);
		int z1;
		int z2;
		int i = -1;
		z1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		do
		{
			i++;
			a = tangible.StringFunctions.changeCharacter(a, i, System.in.read());
		}while (a.charAt(i) != ' ');
		z2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		shuzhi(a, z1, z2);
		return 0;
	}


}

