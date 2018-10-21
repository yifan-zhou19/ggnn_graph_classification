package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int len1 = 0;
	public static int len2 = 0;
	public static String a1 = new String(new char[101]);
	public static String b1 = new String(new char[101]);
	public static int[] a = new int[101];
	public static int[] b = new int[101];
	public static int Main()
	{
		int i;
		int j;
		int k;
		int m;
		int t = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;++i)
		{
				a1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
				b1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
				len1 = 0;
				len2 = 0;
				m = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
				memset(a,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
				memset(b,0,(Integer.SIZE / Byte.SIZE));
				while (a1.charAt(len1) != null)
				{
					len1++;
				}
				while (b1.charAt(len2) != null)
				{
					len2++;
				}
				for (j = len1 - 1;j >= 0;--j)
				{
					a[j] = (int)a1.charAt(len1 - j - 1) - 48;
				}
				for (j = len2 - 1;j >= 0;--j)
				{
					b[j] = (int)b1.charAt(len2 - j - 1) - 48;
				}
				if (len1 < len2)
				{
						t = len1;
						len1 = len2;
						len2 = t;
						for (j = 0;j < 101;++j)
						{
								t = a[j];
								a[j] = b[j];
								b[j] = t;
						}
						System.out.print("-");
				}
				for (j = 0;j < len1;++j)
				{
						a[j] -= b[j];
				}
				for (j = 0;j < len1;++j)
				{
						while (a[j] < 0)
						{
								a[j] += 10;
								a[j + 1] -= 1;
						}
				}
				for (j = len1 - 1;j >= 0;--j)
				{
						if (a[j] != 0)
						{
							m = 1;
						}
						if (m != 0)
						{
							System.out.print(a[j]);
						}
				}
				System.out.print("\n");
		}
		return 0;
	}




}

