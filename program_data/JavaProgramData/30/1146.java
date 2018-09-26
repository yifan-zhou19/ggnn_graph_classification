package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int sum = 0;
	int[] s = new int[101];
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 1;i <= n;i++)
	{
		s[i] = i;
	if (s[i] / 10 != 7)
	{

	 if (s[i] - s[i] / 10 * 10 != 7)
	 {

	  if (s[i] % 7 != 0)
	  {
		sum = sum + s[i] * s[i];
	  }
	 }
	}
	}

	System.out.print(sum);
	System.out.print("\n");
	}

}

