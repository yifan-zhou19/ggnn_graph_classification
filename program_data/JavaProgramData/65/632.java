package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int n;
		 int a;
		 int b;
		 int aa;
		 int bb;
		 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		aa = 0;
		bb = 0;
		for (int i = 0;i < n;i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a - b == -1 || a - b == 2)
			{
				aa++;
			}
			if (a - b == 1 || a - b == -2)
			{
				bb++;
			}
			if (a == b)
			{
				a += 0;
				b += 0;
			}
		}
		 if (aa > bb)
		 {
			 System.out.print("A");
		 }
		 if (aa < bb)
		 {
			 System.out.print("B");
		 }
		 if (aa == bb)
		 {
			 System.out.print("Tie");
		 }
		return 0;
	}


}

