package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String number = new String(new char[100 + 1]);
		int[] a = new int[100 + 1];
		int lenth;
		int[] shang = new int[100 + 1];
		int i;
		int j;
		int s;
		s = 0;

		number = new Scanner(System.in).nextLine();
		lenth = number.length();
		for (i = 0 ; i <= lenth - 1 ; i++)
		{
			a[i] = number.charAt(i) - '0';
		}

		for (i = 0 ; i <= lenth - 1 ; i++)
		{
			s = s * 10 + (a[i] % 13);
			shang[i] = s / 13;
			s = s % 13;
		}
		for (i = 0 ; i <= lenth - 1 ; i++)
		{
			if (shang[i] != 0)
			{
				break;
			}
		}

		if (i >= lenth)
		{
			System.out.print("0");
		}
		else
		{
			for (j = i ; j <= lenth - 1 ; j++)
			{
			System.out.printf("%d",shang[j]);
			}
		}
			System.out.print("\n");
			System.out.printf("%d\n",s);

			return 0;
	}





}
