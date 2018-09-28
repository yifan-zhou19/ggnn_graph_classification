package <missing>;

public class GlobalMembers
{
	// ??2?N?? 
	public static int Main()
	{
		int i; // i,j?????n?2????
		int j;
		int n;
		int[] a = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a, 0, (Integer.SIZE / Byte.SIZE)); // ????
		a[0] = 1; // ???????1
		for (i = 0; i < n; i++) // n??2
		{
			for (j = 0; j < i + 1; j++) // ???2
			{
				a[j] = a[j] * 2;
			}
			for (j = 0; j < i + 1; j++) // ??
			{
				a[j + 1] += a[j] / 10;
				a[j] = a[j] % 10;
			}
		}
		i = 99; // ????????
		while (a[i] == 0) // ??????
		{
			i--;
		}
		for (j = i; j >= 0; j--) // ????
		{
			System.out.print(a[j]);
		}
		return 0;
	}
}

