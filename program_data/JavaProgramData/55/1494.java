package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String n_a = new String(new char[100]);
		char[] n_b = {'0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		int a;
		int b;
		int i;
		int n = 0;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read(); //???
		cin.getline(n_a,100,' '); //??????????
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;n_a.charAt(i) != 0;i++) //?n_a???????
		{
			n *= a; //?????????????n?????????a?
			if (n_a.charAt(i) < 'A') //n_a[i]???
			{
				n += n_a.charAt(i) - '0';
			}
			else if (n_a.charAt(i) < 'a') //n_a[i]?????
			{
				n += n_a.charAt(i) - 'A' + 10;
			}
			else //n_a[i]?????
			{
				n += n_a.charAt(i) - 'a' + 10;
			}
		}
		for (i = 0;n != 0;i++) //?????n?????????b???n_b(????)
		{
			if (n % b > 9) //n_b[i]??9?????
			{
				n_b[i] = n % b - 10 + 'A';
			}
			else //n_b[i]??10?????
			{
				n_b[i] = n % b + '0';
			}
			n /= b; //n????
		}
		if (i == 0)
		{
			System.out.print("0");
		}
		for (i--;i >= 0;i--)
		{
			System.out.print(n_b[i]);
		}
		System.out.print("\n");
		return 0;
	}

}

