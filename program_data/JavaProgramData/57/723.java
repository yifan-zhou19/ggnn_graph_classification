package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		char[] vocab = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		String[] suffix = {"re", "yl", "gni"};

		for (int i = 0; i < n; i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(vocab,0,36);
			vocab = ConsoleInput.readToWhiteSpace(true).charAt(0);

			int k = vocab.length() - 1;
			char[] c = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
			int p = 0;

			if (k > 3)
			{
				for (int j = k; j > k - 3; j--)
				{
					c[p] = vocab[j];
					p++;
				}

				if ((strcmp(suffix[2], c) == 0))
				{
					for (int y = k; y > k - 3; y--)
					{
						vocab[y] = '\0';
					}
					System.out.print(vocab);
					System.out.print("\n");
					continue;
				}

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
				memset(c,0,3);
				p = 0;

				for (int j = k; j > k - 2; j--)
				{
					c[p] = vocab[j];
					p++;
				}

				if ((strcmp(c,suffix[0]) == 0) || strcmp(c,suffix[1]) == 0)
				{
					for (int y = k; y > k - 2; y--)
					{
						vocab[y] = '\0';
					}
					System.out.print(vocab);
					System.out.print("\n");
				}


			}
		}



		return 0;
	}




}

