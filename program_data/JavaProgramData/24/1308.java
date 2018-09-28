package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String m = new String(new char[1000]);
	int i;
	int[] t = new int[1000];
	int k;
	int l;
	int n = 0;
	int[] num1 = new int[100];
	int[] num2 = new int[100];
	int max;
	int min;
	int z1 = 0;
	int z2 = 0;
	m = new Scanner(System.in).nextLine();
	k = -1;
	for (i = 0;i <= m.length();i++)
	{
	l = i;
	if (m.charAt(i) == ' ' || m.charAt(i) == '\0')
	{
		t[n] = l - k - 1;
	num2[n] = l;
	num1[n] = k;
	k = i;
	n++;
	}
	}
	max = t[0];
	min = t[0];
	for (i = 0;t[i] != 0;i++)
	{
		if (t[i] > max)
		{
		max = t[i];
	z1 = i;
		}
	if (t[i] < min)
	{
		min = t[i];
	z2 = i;
	}
	}
	for (i = num1[z1] + 1;i < num2[z1];i++)
	{
		System.out.printf("%c",m.charAt(i));
	}
	System.out.print("\n");
	for (i = num1[z2] + 1;i < num2[z2];i++)
	{
	System.out.printf("%c",m.charAt(i));
	}

	return 0;
	}
}
