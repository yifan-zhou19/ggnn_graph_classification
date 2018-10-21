package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		int k;
		for (i = 4;i <= n;i += 2)
		{
			int count = 0; //???N???????

			int c;
			c = i / 2;

			for (j = 3;j <= c != 0 && count == 0;j += 2) //?  3?  i?????j
			{
				double genhao1;
				double genhao2;
				genhao1 = Math.sqrt(j);
				int temp = 0;

				for (k = 3; k <= genhao1 ; k++)
				{
					if (j % k == 0)
					{
						temp += 1;
					}
				}
				if (temp == 0)
				{
					int er;
					int temp2 = 0;
					er = i - j;
					genhao2 = Math.sqrt(er);
					for (k = 3;k <= genhao2;k++)
					{
						if (er % k == 0)
						{
							temp2 += 1;
						}
					}
					if (temp2 == 0)
					{
						System.out.print(i);
						System.out.print("=");
						System.out.print(j);
						System.out.print("+");
						System.out.print(er);
						System.out.print("\n");
						count += 1;
					}
				}
			}
		}
		return 0;
	}
}

