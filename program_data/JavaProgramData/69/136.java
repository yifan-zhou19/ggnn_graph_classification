package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a1 = new int[256];
		int[] a2 = new int[256];
		String a11 = new String(new char[255]);
		String a22 = new String(new char[255]);
		a11 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		a22 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int len1;
		int len2;
		len1 = a11.length();
		len2 = a22.length();
		int j = 0;
		for (int i = len1 - 1;i >= 0;i--)
		{
			a1[j++] = a11.charAt(i) - '0';
		}
		j = 0;
		for (int i = len2 - 1;i >= 0;i--)
		{
			a2[j++] = a22.charAt(i) - '0';
		}
		int temp = 0;
		for (int i = 0;i < 201;i++)
		{
			a1[i] = a1[i] + a2[i];
			if (a1[i] >= 10)
			{
				a1[i + 1]++;
				a1[i] -= 10;
			}
			if (a1[i] != 0)
			{
				temp = i;
			}
		}
		for (int j = temp;j >= 0;j--)
		{
			System.out.print(a1[j]);
		}
		return 0;
	}
}

