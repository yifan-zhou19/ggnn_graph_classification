package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int j = 0;
		for (i = 0;i <= 2;i++)
		{
			for (j = 0;j <= 2;j++)
			{
				for (int k = 0;k <= 0;k++)
				{
					if ((i != j) + (i != k) + (j != k) == 3)
					{
						char a;
						char b;
						char c;
						a = (i < j) + (i == k);
						b = (i > j) + (i > k);
						c = (j < k) + (i < j);
						if ((i < j < k) + (a> b> c) == 2)
						{
							System.out.print("ABC");
							System.out.print("\n");
						}
						if ((i < k < j) + (a> c> b) == 2)
						{
							System.out.print("ACB");
							System.out.print("\n");
						}
						if ((j < i < k) + (b> a> c) == 2)
						{
							System.out.print("BAC");
							System.out.print("\n");
						}
						if ((j < k < i) + (b> c> a) == 2)
						{
							System.out.print("BCA");
							System.out.print("\n");
						}
						if ((k < i < j) + (c> a> b) == 2)
						{
							System.out.print("CAB");
							System.out.print("\n");
						}
						if ((k < j < i) + (c> b> a) == 2)
						{
							System.out.print("CBA");
							System.out.print("\n");
						}
					}
				}
			}
		}
		return 0;
	}
}
