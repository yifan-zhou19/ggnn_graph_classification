package <missing>;

public class GlobalMembers
{
	public static void turn(String str)
	{
		int n;
		int i;
		int t;
		n = str.length();
		for (i = 0;i <= (n - 1) / 2;i++)
		{
			t = str[i];
			str[i] = str[n - i - 1];
			str[n - i - 1] = t;
		}
	}

	public static int min(int x,int y)
	{
		int z;
		if (x >= y)
		{
			z = y;
		}
		else
		{
			z = x;
		}
		return (z);
	}

	public static void miner(String str1, String str2, String str3)
	{
		int t;
		int i;
		int m;
		int n;
		m = str1.length();
		n = str2.length();
		t = min(m, n);
		for (i = 0;i < t;i++)
		{
			if (str1[i].compareTo(str2[i]) >= 0)
			{
				str3[i] = str1[i] - str2[i].Substring(48);
			}
			else
			{
				str3[i] = str1[i].Substring(10) - str2[i].Substring(48);
				str1[i + 1]--;
				str3[i + 1]--;
			}
		}
	}

	public static void Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String t = new String(new char[2]);
		String c = new String(new char[100]);
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			t = new Scanner(System.in).nextLine();
			a = new Scanner(System.in).nextLine();
			b = new Scanner(System.in).nextLine();
			turn(a);
			turn(b);
			c = a;
			miner(a, b, c);
			turn(c);
			System.out.println(c);
		}
	}


}

