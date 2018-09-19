package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int[] a = new int[16];
		while (true)
		{
			for (i = 0;;i++)
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (a[i] == 0)
				{
					break;
				}
				if (a[i] == -1)
				{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto end;
				}
			}
			int count = 0;
			for (int m = 0; m < i; m++)
			{
				for (int n = 0; n < i; n++)
				{
					if (a[m] == a[n] * 2)
					{
						count++;
					}
				}
			}
			System.out.print(count);
			System.out.print("\n");
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		end:
		return 0;
	}

}

