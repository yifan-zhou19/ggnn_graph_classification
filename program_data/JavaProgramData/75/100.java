package <missing>;

public class GlobalMembers
{
	//********************************
	//*????????             **
	//*??????                 **
	//*???2012.11.12             **
	//*******************************/

	public static int Main()
	{
		int[] a = new int[1000];
		int[] b = new int[1000];
		int[] t = new int[1001];
		int n = 0;
		int i;
		int max = 0;
		do
		{
			a[n] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n++;

		}while (System.in.read() != '\n');
		for (i = 0; i < n; i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (; a[i] < b[i]; a[i]++)
			{
				t[a[i]]++;
			}
			System.in.read();
		}
		for (i = 0; i < 1000; i++)
		{
			if (t[i] > max)
			{
				max = t[i];
			}
		}
		System.out.printf("%d %d", n, max);
		return 0;
	}


}

