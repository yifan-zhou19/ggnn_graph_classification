package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	int i;
	int a;
	int b;
	int ca = 0;
	int cb = 0;
	for (i = 0;i < n;i++)
	{
					a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

				   if (a == 0 && b == 1)
				   {
				   ca++;
				   }
					else if (a == 1 && b == 2)
					{
					ca++;
					}
					else if (a == 2 && b == 0)
					{
				ca++;
					}
					 else if (b == 0 && a == 1)
					 {
				   cb++;
					 }
					else if (b == 1 && a == 2)
					{
					  cb++;
					}
					else if (b == 2 && a == 0)
					{
					 cb++;
					}
	}
	if (ca > cb)
	{
	System.out.print("A");
	}
	if (ca == cb)
	{
	System.out.print("Tie");
	}
	if (cb > ca)
	{
	System.out.print("B");
	}

		return 0;
	}

}

