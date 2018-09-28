package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n1 = 0;
		int n2 = 0;
		int i = 0;
		int j = 0;
		int temp = 0;
		n1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a1 = new int[100];
		int[] a2 = new int[100];
		int[] c = new int[200];
		for (i = 0;i < n1;i++)
		{
		a1[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n2;i++)
		{
		a2[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n1 - 1;i++)
		{
			for (j = 0;j < n1 - 1 - i;j++)
			{
			if (a1[j] > a1[j + 1])
			{
				temp = a1[j];
				a1[j] = a1[j + 1];
				a1[j + 1] = temp;
			}
			}
		}
		for (i = 0;i < n2 - 1;i++)
		{
			for (j = 0;j < n2 - 1 - i;j++)
			{
			if (a2[j] > a2[j + 1])
			{
				temp = a2[j];
				a2[j] = a2[j + 1];
				a2[j + 1] = temp;
			}
			}
		}
		for (i = 0;i < n1;i++)
		{
		c[i] = a1[i];
		}
		for (i = n1;i < n1 + n2;i++)
		{
		c[i] = a2[i - n1];
		}
		for (i = 0;i < n1 + n2 - 1;i++)
		{
		System.out.print(c[i]);
		System.out.print(" ");
		}
		System.out.print(c[n1 + n2 - 1]);
		return 0;
	}

}

