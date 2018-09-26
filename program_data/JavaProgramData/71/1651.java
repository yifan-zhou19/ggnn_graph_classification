package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 1;
		int n;
		int[] year = new int[201];
		int[] a = new int[201];
		int[] b = new int[201];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= n;i++)
		{
		year[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if ((year[i] % 4 == 0 && year[i] % 100 != 0) || year[i] % 400 == 0) //???????
		{
		 int[] m = {0, 1, 32, 61, 92, 122, 153, 183, 214, 245, 275, 306, 336};
		 int j;
		 int k;
		 j = a[i];
		 k = b[i];
		 if ((((m[k] - m[j]) % 7 == 0) && (m[k] - m[j] > 0)) || (((m[j] - m[k]) % 7 == 0) && (m[j] - m[k] > 0))) //?????
		 {
		 System.out.print("YES");
		 System.out.print("\n");
		 }
		 else
		 {
			 System.out.print("NO");
			 System.out.print("\n");
		 }
		}
		 else
		 {
		 int[] m = {0, 1, 32, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335};
		 int j;
		 int k;
		 j = a[i];
		 k = b[i];
		 if ((((m[k] - m[j]) % 7 == 0) && (m[k] - m[j] > 0)) || (((m[j] - m[k]) % 7 == 0) && (m[j] - m[k] > 0))) //?????
		 {
		 System.out.print("YES");
		 System.out.print("\n");
		 }
		 else
		 {
			 System.out.print("NO");
			 System.out.print("\n");
		 }
		 }
		}

		 return 0;
	}
}

