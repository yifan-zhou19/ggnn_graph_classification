package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int[] b = new int[100];
		int[] shang = new int[100];
		int len = a.length();
		if (len == 1)
		{
			System.out.print('0');
			System.out.print("\n");
			System.out.print(a);
			System.out.print("\n");
			return 0;
		}
		int i = 0;
		for (i = 0;i < len;i++)
		{
			b[len - 1 - i] = (int)a.charAt(i) - 48;
		}
		if (len == 2 && b[1] * 10 + b[0] < 13)
		{
			System.out.print('0');
			System.out.print("\n");
			System.out.print(b[1] * 10 + b[0]);
			System.out.print("\n");
			return 0;
		}
		int left = b[len - 1];
		int sum = 0;
		for (i = len - 2;i >= 0;i--)
		{
			sum = left * 10 + b[i];
			shang[i] = sum / 13;
			left = sum % 13;
		}
		int temp = len - 2;
		if (shang[temp] == 0)
		{
			temp--;
		}
		for (i = temp;i >= 0;i--)
		{
			System.out.print(shang[i]);
		}
		System.out.print("\n");
		System.out.printf("%d", "\n");
		return 0;
	}
}

