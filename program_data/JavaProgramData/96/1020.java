package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

	String a = new String(new char[200]);
	a = ConsoleInput.readToWhiteSpace(true).charAt(0);
	int[] x = new int[200];
	int[] b = new int[200];
	int i;
	for (i = 0;i < a.length();i++)
	{
	x[i] = a.charAt(i) - '0';
	}
	i = 0;
	int s = 0;
	int temp = 0;
	while (i < a.length())
	{
	 temp = temp * 10 + x[i++];
	b[s++] = temp / 13;
	temp = temp % 13;
	}

	int k = 0;
	while (b[k] == 0 && k < s)
	{
	k++;
	}

	if (k == s)
	{
		System.out.print(0);
		System.out.print("\n");
		System.out.print(temp % 13);
		System.out.print("\n");
		return 0;
	}
	for (int i = k;i < s;i++)
	{
	System.out.print(b[i]);
	}
	 System.out.print("\n");
	 System.out.print(temp % 13);
	 System.out.print("\n");


		return 0;
	}


}

