package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] a =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		int i = 0;
		int j;
		int[] b = new int[100];
		int t;
		while (scanf("%s",a[i]) != EOF)
		{
			b[i] = String.valueOf(a[i]).length();
			i++;
		}
		t = b[0];
		for (j = 0;j <= i;j++)
		{
			if (t < b[j])
			{
				t = b[j];
			}
		}
		for (j = 0;j < i;j++)
		{
			if (t == b[j])
			{
				System.out.printf("%s\n",a[j]);
				break;
			}
		}
		t = b[0];
		for (j = 0;j < i;j++)
		{
			if (t > b[j])
			{
				t = b[j];
			}
		}
		for (j = 0;j <= i;j++)
		{
			if (t == b[j])
			{
				System.out.printf("%s",a[j]);
				break;
			}
		}
	}

}
