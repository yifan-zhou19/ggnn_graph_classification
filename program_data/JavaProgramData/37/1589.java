package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[][] a = new int[30][2];
		int num = 0;
		int min = 26;
		char c;
		char out;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (j = 0;j < n;j++)
		{
			//c=getchar();
			num = 0;
			out = 1;
			while ((c = System.in.read()) != '\n')
			{
				if (a[c - 'a'][0] == 0)
				{
					a[c - 'a'][1] = num;
				}
				a[c - 'a'][0]++;
				num++;
			}
			min = 10000;
			for (i = 0;i < 26;i++)
			{
				if (a[i][0] == 1 && a[i][1] < min)
				{
					min = a[i][1];
					out = 'a' + i;
				}
			}
			if (out == 1)
			{
				System.out.print("no");
				System.out.print("\n");
			}
			else
			{
				System.out.print(out);
				System.out.print("\n");
			}
			for (i = 0;i < 26;i++)
			{
				a[i][0] = 0;
			}
			//getchar();
		}
		return 0;
	}
}

