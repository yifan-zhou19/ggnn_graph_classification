package <missing>;

public class GlobalMembers
{
	public static void in(String str, String substr)
	{
		int i;
		int j;
		int k;
		int r;
		for (i = 0;i <= 9;i++)
		{
			r = 1;
			for (j = i;j <= 9;j++)
			{
				if (str[i].compareTo(str[j]) < 0)
				{
					r = 0;
					break;
				}
			}
			if (r == 1)
			{
				for (k = 12;k >= i + 4;k--)
				{
						str[k] = str[k - 3];
				}
					str[i + 1] = substr[0];
					str[i + 2] = substr[1];
					str[i + 3] = substr[2];
					break;
			}
		}
	}
	public static void Main()
	{
		char[][] str =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		char[][] substr =
		{
			{0, '\0', '\0'}
		};
		int i;
		int n;
		char c;
		for (n = 0;;n++)
		{
			if ((c = System.in.read()) == EOF)
			{
				break;
			}
			else
			{
				str[n][0] = c;
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					str[n][1] = tempVar.charAt(0);
				}
				String tempVar2 = ConsoleInput.scanfRead(" ");
				if (tempVar2 != null)
				{
					substr[n] = tempVar2.charAt(0);
				}
			}
			in(str[n], substr[n]);

		}
		for (i = 0;i <= n - 1;i++)
		{

			System.out.printf("%s\n",str[i]);
		}
	}
}

