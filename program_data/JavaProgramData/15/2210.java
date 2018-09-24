package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int[] is1 = new int[4000];
		int[] is2 = new int[4000];
		int s;
		int n;
		int k = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   for (int i = 0; i < n * n;i++)
	   {
				a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				 if (a == 0)
				 {

							 is1[k] = i / n;
							 is2[k++] = i % n;
				 }
	   }
		System.out.print((is1[k - 1] - is1[0] - 1) * (is2[k - 1] - is2[0] - 1));
		return 0;
	}
}

