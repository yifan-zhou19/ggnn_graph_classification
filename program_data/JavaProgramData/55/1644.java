package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int i;
		int j;
		int k;
		int[] num = new int[100];
		int t;
		int[] shang = new int[100];
		int len;
		int sum = 0;
		String str = new String(new char[100]);
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		len = str.length();
		if (a >= 10)
		{
			for (i = 0;i < len;i++)
			{
				if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
				{
				  num[len - i] = str.charAt(i) - 'A' + 10;
				}
				else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
				{
				  num[len - i] = str.charAt(i) - 'a' + 10;
				}
				else if (str.charAt(i) >= '0' && str.charAt(i) <= '9')
				{
				  num[len - i] = str.charAt(i) - '0';
				}

			}
			t = 1;
			for (k = 1;k <= len;k++)
			{
				sum += num[k] * t;
				t *= a;
			}
		}
		else if (a < 10)
		{
			for (i = 0;i < len;i++)
			{
				num[len - i] = str.charAt(i) - '0';
				t = 1;
				for (k = 1;k <= len;k++)
				{
					sum += num[k] * t;
					t *= a;
				}
			}
		}

			j = 0;
			//if(sum!=1415926 && sum!=2147483647 && sum!=26137359 && sum!=3548776 && sum!=82273847)
			//cout<<sum+1<<endl;
			while (sum != 0)
			{
				shang[j] = sum % b;
				sum = sum / b;
				j++;
			}
			//cout<<j<<endl;
			if (j == 0)
			{
				System.out.print("0");
			}
			for (i = j - 1;i >= 0;i--)
			{
				if (shang[i] >= 0 && shang[i] <= 9)
				{
				  str = tangible.StringFunctions.changeCharacter(str, i, '0' + shang[i]);
				}
				else if (shang[i] >= 10)
				{
				  str = tangible.StringFunctions.changeCharacter(str, i, 'A' - 10 + shang[i]);
				}
				System.out.print(str.charAt(i));
			}


		//int h;cin>>h;
		return 0;
	}

}

