package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		char[][] b = new char[1000][1];
		int[] number = new int[1000];
		int i;
		int j;
		int k = 0;
		int len;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len = a.length();
		for (i = 0;i < len;i++) //????????????
		{
			if (a.charAt(i) >= 97)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 32);
			}
		}

		//cout<<a;

		k = 0;
		b[k][0] = a.charAt(0);
		number[k] = 1;
		for (i = 1;i < len;i++) //????
		{
			if (a.charAt(i) == b[k][0])
			{
				 number[k] = number[k] + 1; //cout<<number[k]<<' ';
			}
			else
			{
				number[k + 1] = 1;
				b[k + 1][0] = a.charAt(i);
				k = k + 1;
			}
		}

		for (j = 0;j < k + 1;j++)
		{
			System.out.print('(');
			System.out.print(b[j][0]);
			System.out.print(',');
			System.out.print(number[j]);
			System.out.print(')');
		}


	   return 0;
	}
}

