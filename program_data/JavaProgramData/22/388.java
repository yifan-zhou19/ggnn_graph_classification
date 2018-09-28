package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int a[300];
		int[] a = new int[300];
		String ch = new String(new char[299]);
		int s = 1;
		int i;
		for (i = 1;i <= 300;i++)
		{
			if (i == 1)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[1] = Integer.parseInt(tempVar);
				}
			}
			else
			{
				ch = tangible.StringFunctions.changeCharacter(ch, i, System.in.read());
				if (ch.charAt(i) != ',')
				{
					break;
				}
				else
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						a[i] = Integer.parseInt(tempVar2);
					}
					s = s + 1;
				}
			}

		}
		int exchange;
		int j;
		int k;
		for (j = 1;j <= s;j++)
		{
			for (k = j + 1;k <= s;k++)
			{
				if (a[j] < a[k])
				{
					exchange = a[j];
					a[j] = a[k];
					a[k] = exchange;
				}
			}
		}
		if (s == 1)
		{
			System.out.print("No");
		}
		else
		{
			for (i = 1;i <= s - 1;i++)
			{
				if (a[i] != a[i + 1])
				{
					System.out.printf("%d",a[i + 1]);
					break;
				}
				else
				{
					if (i == s - 1)
					{
						System.out.print("No");
					}
					else
					{
						continue;
					}
				}
			}
		}

		return 0;


	}
}

