package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a1 = new String(new char[251]);
		String a2 = new String(new char[251]);
		int[] b1 = new int[251];
		int[] b2 = new int[251];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b1,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b2,0,(Integer.SIZE / Byte.SIZE));

		a1 = new Scanner(System.in).nextLine();
		a2 = new Scanner(System.in).nextLine();
		int n1 = a1.length();
		int n2 = a2.length();

		int i;
		int j;
		j = 0;
		for (i = n1 - 1;i >= 0;i--)
		{
			b1[j++] = a1.charAt(i) - '0';
		}
		j = 0;
		for (i = n2 - 1;i >= 0;i--)
		{
			b2[j++] = a2.charAt(i) - '0';
		}

		for (i = 0;(i <= n1) || (i <= n2);i++)
		{
			b1[i] += b2[i];
			if (b1[i] >= 10)
			{
					b1[i] = b1[i] % 10;
					b1[i + 1]++;
			}

		}

		i = 250;
		while (b1[i] == 0)
		{
			i--;
			if (i == 0)
			{
				break;
			}
		}

		while (i >= 0)
		{
			System.out.print(b1[i--]);
		}
		System.out.print("\n");

		return 0;
	}


}
