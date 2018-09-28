package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100]; //a???????b???????
		int[] b = new int[100];
		int n; //n??a?????
		int count = 0; //count??b??????temp?????????
		int temp;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[i] % 2 != 0)
			{
				b[count++] = a[i]; //???a?????b
			}
		}
		for (int i = 0;i < count;i++) //?b?????
		{
			for (int j = count - 1;j > i;j--)
			{
				if (b[j - 1] > b[j])
				{
					temp = b[j - 1];
					b[j - 1] = b[j];
					b[j] = temp;
				}
			}
		}
		for (int i = 0;i < count;i++)
		{ //????????????????','
			if (i != 0)
			{
				System.out.print(',');
			}
			System.out.print(b[i]);
		}
		System.out.print("\n");
		return 0;
	}

}

