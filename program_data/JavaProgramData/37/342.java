package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int k;
		int[] ct = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int[] t = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int len;
		int a;
		int f = 0;

		String str = new String(new char[100001]);

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (m = 1 ; m <= n ; m++)
		{
			str = ConsoleInput.readToWhiteSpace(true).charAt(0);

			len = str.length();

			//????
			for (i = 97 ; i <= 122 ; i++)
			{
				ct[i] = 0;
			}

			//????
			for (i = 0 ; i <= 26 ; i++)
			{
				t[i] = 0;
			}

			for (i = 0 ; i < len ; i++)
			{
				a = str.charAt(i);

				//?ct[]??
				ct[a]++;
			}

			for (i = 97, j = 0 ; i <= 122 ; i++)
			{
				if (ct[i] == 1)
				{
					t[j++] = i; //t[]?????????ascll
					//cout << i ;
				}
			}

			//????
			f = 0;

			for (i = 0 ; i < len ; i++)
			{
				for (k = 0 ; k < j ; k++)
				{
					if (t[k] == str.charAt(i) && f == 0)
					{
						a = i;
						f = 1;
					}
				}
			}

			if (f == 0)
			{
				System.out.print("no");
				System.out.print("\n");
			}
			else
			{
				System.out.print(str.charAt(a));
				System.out.print("\n");
			}
		}

		return 0;
	}
}

