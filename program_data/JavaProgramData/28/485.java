package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int len = 0;
		int i = 0;
		int flag = 1;
		int j;
		char c;
		while ((c = System.in.read()) != '\n')
		{
			if (c != ' ')
			{
				if (flag != 0)
				{
					flag = 0;
					len++;
				}
				else
				{
					len++;
				}
			}
			else if (flag == 0)
			{
				flag = 1;
				a[i] = len;
				len = 0;
				i++;
			}
		}
		a[i] = len;
		for (j = 0;j < i;j++)
		{
			System.out.printf("%d,",a[j]);
		}
		System.out.printf("%d\n",a[j]);
	}
}
