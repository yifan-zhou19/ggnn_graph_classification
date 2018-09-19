public class book
{
	public int num;
	public String name = new String(new char[27]);
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int l;
		int[] sum = new int[26];
		int t = 0;
		int T = 0;
		book[] a = tangible.Arrays.initializeWithDefaultbookInstances(1000);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(sum,0,(Integer.SIZE / Byte.SIZE));
		char A;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i].num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[i].name = ConsoleInput.readToWhiteSpace(true).charAt(0);
			l = String.valueOf(a[i].name).length();
			for (j = 0;j < l;j++)
			{
				sum[a[i].name.charAt(j) - 'A']++;
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (sum[i] > t)
			{
				t = sum[i];
				T = i;
			}
		}
		A = 'A' + T;
		System.out.print(A);
		System.out.print("\n");
		System.out.print(t);
		System.out.print("\n");
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 27;j++)
			{
				if (a[i].name.charAt(j) == A)
				{
					System.out.print(a[i].num);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

