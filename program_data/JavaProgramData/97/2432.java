package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int x;
		int i;
		int an = 0;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (m / 100 > 0)
		{
			System.out.print(m / 100);
			System.out.print("\n");
			m = m % 100;
		}
		else
		{
			System.out.print(0);
			System.out.print("\n");
		}
		  if (m / 50 > 0)
		  {
			  System.out.print(m / 50);
			  System.out.print("\n");
			  m = m % 50;
		  }
		  else
		  {
			  System.out.print(0);
			  System.out.print("\n");
		  }
			if (m / 20 > 0)
			{
				System.out.print(m / 20);
				System.out.print("\n");
				m = m % 20;
			}
			else
			{
				System.out.print(0);
				System.out.print("\n");
			}
			  if (m / 10 > 0)
			  {
				  System.out.print(m / 10);
				  System.out.print("\n");
				  m = m % 10;
			  }
			  else
			  {
				  System.out.print(0);
				  System.out.print("\n");
			  }
				if (m / 5 > 0)
				{
					System.out.print(m / 5);
					System.out.print("\n");
					m = m % 5;
				}
				else
				{
					System.out.print(0);
					System.out.print("\n");
				}
		 System.out.print(m);
	 m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		return 0;

	}

}

