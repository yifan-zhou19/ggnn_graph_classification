package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		int[] A = new int[100];
		int[] B = new int[100];
		int[] ans = new int[100];
		int line;
		int len1;
		int len2;
		int len3;
		line = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (line > 0)
		{
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			b = ConsoleInput.readToWhiteSpace(true).charAt(0);
			len1 = a.length();
			for (int i = len1 - 1,j = 0;i >= 0;i--,j++)
			{
				A[j] = a.charAt(i) - '0';
			}
			len2 = b.length();
			for (int i = len2 - 1,j = 0;i >= 0;i--,j++)
			{
				B[j] = b.charAt(i) - '0';
			}
			for (int i = 0;i < len2;i++)
			{
				if (A[i] >= B[i])
				{
				   ans[i] = A[i] - B[i];
				}
				else
				{
					A[i + 1]--;
					ans[i] = A[i] - B[i] + 10;
				}
			}
			for (int i = len2;i < len1;i++)
			{
				ans[i] = A[i];
			}
			if (len1 == len2 && A[len1 - 1] == B[len2 - 1])
			{
				len1--;
			}
			for (int i = len1 - 1;i >= 0;i--)
			{
				System.out.print(ans[i]);
			}
			System.out.print("\n");
			line--;
		}
		return 0;
	}
}

