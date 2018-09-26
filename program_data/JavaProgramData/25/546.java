package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] num = new int[150];
		int len;
		int k;
		int m;
		int j;
		final String str = "";
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		str = tangible.StringFunctions.changeCharacter(str, 0, '1');
		for (j = 1;j <= m;j++)
		{
		len = str.length();
		k = 0;
		for (i = len - 1;i >= 0;i--)
		{
			n = str.charAt(i) - '0';
			num[k] = n * 2;
			k++;
		}
		for (i = 0;i < 120;i++)
		{
			 // cout<<num[i]<<' '<<num[i+1]<<' ';
			num[i + 1] = num[i + 1] + num[i] / 10;
			num[i] = num[i] % 10;
		   // cout<<num[i]<<' '<<num[i+1]<<endl;
		}



		i = 140;
		while (num[i] == 0)
		{
			i--;
		}
		k = 0;
		for (;i >= 0;i--)
		{
			str = tangible.StringFunctions.changeCharacter(str, k, num[i] + '0');
			k++;
		}

		}
		i = 140;
		while (num[i] == 0)
		{
			i--;
		}
		for (;i >= 0;i--)
		{
		   System.out.print(num[i]);
		}
		if (m == 0)
		{
			System.out.print(1);
		}


			return 0;
	}

}

