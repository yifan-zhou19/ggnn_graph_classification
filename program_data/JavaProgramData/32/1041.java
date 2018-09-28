package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		int[] ia = new int[101];
		int[] ib = new int[101];
		int n = 0;
		int i = 0;
		int j = 0;
		int q = 0;
		int len1 = 0;
		int len2 = 0;
		int t = 0;
		int[] ans = new int[101];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (t = 0;t < n;t++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a,0,(Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(b,0,(Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(ia,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(ib,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(ans,0,(Integer.SIZE / Byte.SIZE));
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			b = ConsoleInput.readToWhiteSpace(true).charAt(0);
			len1 = a.length();
			len2 = b.length();
			int k = 0;
			for (i = len1 - 1;i >= 0;i--)
			{
				ia[k] = a.charAt(i) - '0';
				k++;
			}
			k = 0;
			for (i = len2 - 1;i >= 0;i--)
			{
				ib[k] = b.charAt(i) - '0';
				k++;
			}

			for (i = 0;i < len2;i++)
			{
				if (ia[i] < ib[i])
				{
					if (ia[i + 1] != 0)
					{
						ia[i + 1]--;
						ia[i] = ia[i] + 10;
						ans[i] = ia[i] - ib[i];
					}
					else
					{
						for (j = i + 2;j < len1;j++)
						{
							if (ia[j] != 0)
							{
								q = j;
								ia[j]--;
								break;
							}
						}
						for (j = i + 1;j < q;j++)
						{
							ia[j] = 9;
						}
						ia[i] = ia[i] + 10;
						ans[i] = ia[i] - ib[i];
					}
				}
				else
				{
					ans[i] = ia[i] - ib[i];
				}
			}
			int p = 0;
			for (i = len1;;i--)
			{
				if (ia[i] != 0)
				{
					p = i;
					break;
				}
			}
			for (i = p;i >= len2;i--)
			{
				ans[i] = ia[i];
			}
			for (i = p;i >= 0;i--)
			{
				System.out.print(ans[i]);
			}
			System.out.print("\n");
		}
		return 0;
	}

}

