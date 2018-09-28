package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 0;i < n;i++)
		{
			String a1 = new String(new char[100]);
			String a2 = new String(new char[100]);
			a1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
			a2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
			System.in.read();
			int l1 = a1.length();
			int l2 = a2.length();


			int[] b1 = new int[100];
			int[] b2 = new int[100];
			int i;
			int j;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(b1,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(b2,0,(Integer.SIZE / Byte.SIZE));
			j = 0;
			for (i = l1 - 1;i >= 0;i--)
			{
				b1[j++] = a1.charAt(i) - '0';
			}
			j = 0;
			for (i = l2 - 1;i >= 0;i--)
			{
				b2[j++] = a2.charAt(i) - '0';
			}

			for (i = 0;i < l1;i++) //??
			{
				b1[i] = b1[i] - b2[i];
				if (b1[i] < 0)
				{
						b1[i] += 10;
						b1[i + 1]--;
				}
			}

			i = 99;
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
		}
		return 0;
	}


}

