package <missing>;

public class GlobalMembers
{
	public static int[] a1 = new int[N];
	public static int[] a2 = new int[N];
	public static String s1 = new String(new char[N + 1]);
	public static String s2 = new String(new char[N + 1]);
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			System.in.read();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a1,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a2,0,(Integer.SIZE / Byte.SIZE));
			s1 = new Scanner(System.in).nextLine();
			s2 = new Scanner(System.in).nextLine();
			j = 0;
			int len1 = s1.length();
			for (k = len1 - 1;k >= 0;k--)
			{
				a1[j++] = s1.charAt(k) - '0';
			}
			j = 0;
			int len2 = s2.length();
			for (k = len2 - 1;k >= 0;k--)
			{
				a2[j++] = s2.charAt(k) - '0';
			}
			for (j = 0;j < len2;j++)
			{
				if (a1[j] >= a2[j])
				{
					a1[j] -= a2[j];
				}
				else
				{
					a1[j] = a1[j] + 10 - a2[j];
					a1[j + 1]--;
				}
			}
			for (j = len1 - 1;j >= 0;j--)
			{
				if (a1[j] > 0)
				{
					t = j;
					break;
				}
			}
			for (j = t;j >= 0;j--)
			{
				System.out.printf("%d",a1[j]);
			}
			System.out.print("\n");
		}
		return 0;
	}


}

