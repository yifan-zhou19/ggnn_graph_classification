package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		char[] a = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		char[] b = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		char temp = 0;
		char semp = 0;
		int test = 1;
		for (i = 0;i < 300;i++)
		{
			temp = System.in.read();
			semp = temp;
			if ('\n' == temp)
			{
				break;
			}
			temp = temp - 'a';
			semp = semp - 'A';
			if (0 <= temp && temp < 26)
			{
				a[(int)temp]++;
			}
			if (0 <= semp && semp < 26)
			{
				b[(int)semp]++;
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (b[i] != null)
			{
				System.out.printf("%c=%d\n",('A' + i),b[i]);
				test = 0;
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (a[i] != null)
			{
				System.out.printf("%c=%d\n",('a' + i),a[i]);
				test = 0;
			}
		}
		if (test != 0)
		{
			System.out.print("No\n");
		}
		return 0;
	}
}
