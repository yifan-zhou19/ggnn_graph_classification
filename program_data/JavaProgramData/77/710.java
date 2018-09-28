package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//void fuck(int n);
	public static int Main()
	{
		char c;
		char boy;
		int[] a = new int[100];
		int i = 0;
		int j;
		boy = System.in.read();
		a[0] = 1;
		while ((c = System.in.read()) != '\n')
		{
			i++;
			if (c == boy)
			{
				a[i] = 1;
			}
			else
			{
				a[i] = -1;
				j = i - 1;
				while (a[j] != 1)
				{
					j--;
				}
				System.out.print(j);
				System.out.print(" ");
				System.out.print(i);
				System.out.print("\n");
				a[j] = 0;
			}
		}
		return 0;
	}

}
