package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int N = 0;N < n;N++)
		{
			String a = new String(new char[110]);
			String b = new String(new char[110]);
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			b = ConsoleInput.readToWhiteSpace(true).charAt(0);
			int[] A = new int[110];
			int[] B = new int[110];
			int[] result = new int[110];
			for (int i = a.length() - 1;i >= 0;i--)
			{
				A[a.length() - i - 1] = a.charAt(i) - '0';
			}
			for (int i = b.length() - 1;i >= 0;i--)
			{
				B[b.length() - i - 1] = b.charAt(i) - '0';
			}



			for (int i = 0;i < 110;i++)
			{
				result[i] += (A[i] - B[i]);
				if (result[i] < 0)
				{
					result[i] += 10;
					result[i + 1]--;
				}
			}
			int t;
			for (t = 109;t > 0;t--)
			{
				if (result[t] != 0)
				{
					break;
				}
			}
			for (;t > 0;t--)
			{
				System.out.print(result[t]);
			}
			System.out.print(result[0]);
			System.out.print("\n");


		}

		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();

	}
}

