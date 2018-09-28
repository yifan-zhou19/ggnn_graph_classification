package <missing>;

public class GlobalMembers
{
	//?? - ??(12-4) ????
	public static int Main()
	{
		String str = new String(new char[MAX]);
		String dig = new String(new char[MAX]);
		int n;
		int i;
		int t = 0;
		int ok = 0;
		int j;
		int k = 0;
		int[] a = new int[MAX];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a, 0, (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(dig,0,(Character.SIZE / Byte.SIZE));
		str = new Scanner(System.in).nextLine();
		n = str.length();
		for (i = 0; i < n; i++)
		{
			if (Character.isDigit(str.charAt(i)) && ok != 0)
			{
				for (j = 0; j < t - 1; j++)
				{
					a[k] += ((int)dig.charAt(j) - '0');
					a[k] *= 10;
				}
				a[k] += dig.charAt(t - 1) - '0';
				k++;
				t = 0;
			}
			if (Character.isDigit(str.charAt(i)))
			{
				dig = tangible.StringFunctions.changeCharacter(dig, t++, str.charAt(i));

				ok = 0;
			}
			if ((ok == 0) && (!Character.isDigit(str.charAt(i))))
			{
				ok = 1;
			}
		}

		for (j = 0; j < t - 1; j++)
		{
			a[k] += (dig.charAt(j) - '0');
			a[k] *= 10;

		}
		a[k] += dig.charAt(t - 1) - '0';

		for (i = 0; i <= k; i++)
		{
			if (a[i] >= 0)
			{
				System.out.printf("%d\n",a[i]);
			}
		}

		return;
	}

}

