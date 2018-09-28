package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int m;
		 int x;
		 int y;
		 int a;
		 int b = 0;
		 int k;
		 int l;

		 m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		 for (int i = 3; i <= m / 2 ; i = i + 2)
		 {
			 a = 0;

			 for (k = 2; k * k <= i; k++)
			 {
				 if (i % k == 0)
				 {
					a = 1;
				 }
			 }

			for (l = 2; l * l <= (m - i); l++)
			{
				 if ((m - i) % l == 0)
				 {
					a = 1;
				 }

			}

			if (a == 0)
			{
				System.out.print(i);
				System.out.print(" ");
				System.out.print(m - i);
				System.out.print("\n");
			}
			 else
			 {
				 continue;
			 }

		 }

		 return 0;

	}
}

