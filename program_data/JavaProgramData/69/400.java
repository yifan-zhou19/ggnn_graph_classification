package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[30000]);
		String b = new String(new char[30000]);
		int i;
		int j;
		int[] h = new int[30000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		if (a.length() >= b.length())
		{
				for (i = a.length() - 1;i >= 0;i--)
				{
				j = i - (a.length() - b.length());
				if (j >= 0)
				{
				h[i] = a.charAt(i) - '0' + b.charAt(j) - '0';
				}
				else
				{
				h[i] = a.charAt(i) - '0';
				}
				}
				for (i = a.length() - 1;i > 0;i--)
				{
					if (h[i] >= 10)
					{
						h[i] = h[i] - 10;
						h[i - 1] = h[i - 1] + 1;
					}
					//printf("%d\n",h[i]);
				}
				if (h[0] >= 10)
				{
					System.out.printf("1%c", h[0] + '&');
				}
				if (h[i] > 0 && h[i] < 10)
				{
					System.out.printf("%c",h[0] + '0');
				}
				for (i = 0;i < a.length();i++)
				{
					if (h[i] != 0)
					{
					break;
					}
				}
				if (i == a.length())
				{
				System.out.print("0");
				}
				else
				{
				for (i = 1;i < a.length();i++)
				{
					System.out.printf("%c",h[i] + '0');
				}
				}

		}
		if (a.length() < b.length())
		{
				for (i = b.length() - 1;i >= 0;i--)
				{
				j = i - (b.length() - a.length());
				if (j >= 0)
				{
				h[i] = b.charAt(i) - '0' + a.charAt(j) - '0';
				}
				else
				{
				h[i] = b.charAt(i) - '0';
				}
				}
				for (i = b.length() - 1;i > 0;i--)
				{
					if (h[i] >= 10)
					{
						h[i] = h[i] - 10;
						h[i - 1] = h[i - 1] + 1;
					}
					//printf("%d\n",h[i]);
				}

		if (h[0] >= 10)
		{
					System.out.printf("1%c", h[0] + '&');
		}
				if (h[i] > 0 && h[i] < 10)
				{
					System.out.printf("%c",h[0] + '0');
				}
				for (i = 0;i < b.length();i++)
				{
					if (h[i] != 0)
					{
					break;
					}
				}
				if (i == b.length())
				{
				System.out.print("0");
				}
				else
				{
				for (i = 1;i < b.length();i++)
				{
					System.out.printf("%c",h[i] + '0');
				}
				}
		}
		return 0;
	}

}

