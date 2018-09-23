package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[1000]);
		int count = 0;
		int i;
		int j = 0;
		int[] a = new int[1000];
		int k = 0;
		int m;
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		//cout << "(" << (char)'A + '
		for (i = 0, j = 0 ; str.charAt(i) != '\0' ; i++, j++)
		{
			if (str.charAt(i) >= 97 && str.charAt(i) <= 122)
			{
				a[j] = str.charAt(i) - 'a';
			}
			if (str.charAt(i) >= 65 && str.charAt(i) <= 90)
			{
				a[j] = str.charAt(i) - 'A';
			}
		}
		System.out.print("(");
		System.out.print((char)('A' + a[0]));
		System.out.print(",");
		for (k = 1 ; k < j ; k++)
		{
			if (a[k] == a[k - 1])
			{
				count++;
			}
			else
			{
				System.out.print(count + 1);
				System.out.print(")");
				count = 0;
				System.out.print("(");
				System.out.print((char)('A' + a[k]));
				System.out.print(",");
			}
		}
		//count = 0 ;
		//for (m = j ; a[m] != a[j] ; m --)
		//{
		//	count ++ ;
		//}
		System.out.print(count + 1);
		System.out.print(")");
		System.out.print("\n");
		return 0;
	}

}

