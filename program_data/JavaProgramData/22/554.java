package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int swap = new int(int a, int b);
		int[] a = new int[100];
		int i = 0;
		int j = 0;
		int num;
		int t;
		char c;
		for (num = 0,i = 0;c != '\n';)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			num++;
			i++;
			c = System.in.read();
		}
		if (num != 1)
		{
			for (i = 0;i < num - 1;i++)
			{
			for (j = 0;j < num - 1 - i;j++)
			{
				if (a[j] < a[j + 1])
				{
				t = a[j];
				a[j] = a[j + 1];
				a[j + 1] = t;
				}
			}
			}


			for (i = 0;i < num;i++)
			{
				if (a[i] != a[i + 1])
				{
					System.out.printf("%d",a[i + 1]);
					break;
				}
				else if (a[0] == a[num - 1])
				{
					System.out.print("No");
					break;
				}
			}
		}
				else
				{
					System.out.print("No");
				}
				return 0;
	}
		public static int swap(int a, int b)
		{
			int t;
			t = a;
			a = b;
			b = t;
		}
}

