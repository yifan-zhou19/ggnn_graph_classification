package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[] a = {' ', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		char[] b = {' ', '\0', '\0', '\0'};
		while (cin.get(a,11,' '))
		{
			System.in.read();
			cin.get(b,4,'\n');
			int k = 0;
			char max = null;
			for (int j = 0;j < a.length();j++)
			{
				if (a[j] > max)
				{
					max = a[j];
					k = j;
				}
			}
			for (int i = a.length() - 1;i > k;i--)
			{
				a[i + 3] = a[i];
			}
			a[k + 1] = b[0];
			a[k + 2] = b[1];
			a[k + 3] = b[2];
			System.out.print(a);
			System.out.print("\n");
			for (int p = 0;p < 14;p++)
			{
				a[p] = '\n';
			}
		}
		return 0;
	}
}
