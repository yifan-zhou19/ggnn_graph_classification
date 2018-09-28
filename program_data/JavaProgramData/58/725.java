package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j = 0;
		int t;
		int n;
		int r;
		char[] str = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		do
		{
			r = 0;
			str = new Scanner(System.in).nextLine();
			t = str.length();
			for (i = 0;i < t;i++)
			{
				if (i == 0)
				{
					if (str[i] == '_')
					{
						r++;
					}
					if (str[i] > 96 && str[i] < 123)
					{
						r++;
					}
					if (str[i] > 64 && str[i] < 91)
					{
						r++;
					}
				}
				else
				{
					if (str[i] == '_')
					{
						r++;
					}
					if (str[i] > 96 && str[i] < 123)
					{
						r++;
					}
					if (str[i] > 64 && str[i] < 91)
					{
						r++;
					}
					if (str[i] > 47 && str[i] < 58)
					{
						r++;
					}
				}
			}
			if (r == t)
			{
				System.out.print("1\n");
			}
			else
			{
				System.out.print("0\n");
			}
			j++;
		}while (j < n);
		return 0;
	}





}

