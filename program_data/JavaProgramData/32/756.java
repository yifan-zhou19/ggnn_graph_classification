package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int len1;
		int len2;
		int i = 0;
		int j = 0;

		String jian = new String(new char[1001]);
		String bjian = new String(new char[1001]);

		int[] jn = new int[1001];
		int[] bj = new int[1001];

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (m = 1 ; m <= n ; m++)
		{
			bjian = ConsoleInput.readToWhiteSpace(true).charAt(0);
			jian = ConsoleInput.readToWhiteSpace(true).charAt(0);

			len1 = bjian.length();
			len2 = jian.length();

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(jn, 0, (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(bj, 0, (Character.SIZE / Byte.SIZE));

			//cout << bjian << endl << jian << endl ;

			j = 0;

			//???????????????
			for (i = len1 - 1 ; i >= 0 ; i--)
			{
				bj[j++] = bjian.charAt(i) - '0';
			}

			j = 0;

			//???????????????
			for (i = len2 - 1 ; i >= 0 ; i--)
			{
				jn[j++] = jian.charAt(i) - '0';
			}

			if (strcmp(bjian, jian) != 0)
			{

				//????
				for (i = 0 ; i <= len1 ; i++)
				{
					bj[i] = bj[i] - jn[i];

					if (bj[i] < 0)
					{
						bj[i + 1]--;
						bj[i] += 10;
					}
				}

				i = len1;

				//???????0??
				while (bj[i] == 0)
				{
					i--;
				}

				for (; i >= 0 ; i--)
				{
					System.out.print(bj[i]);
				}

				System.out.print("\n");
			}

			else
			{
				System.out.print('0');
				System.out.print("\n");
			}
		}

		return 0;
	}


}

