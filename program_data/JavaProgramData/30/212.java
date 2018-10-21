package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i = 1;
		  int b;
		  int c;
		  int s = 0;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }

		  while (i <= n)
		  {
				c = i - i / 10 * 10;
				b = i / 10;

				if (i % 7 == 0)
				{
					i++;
				continue;
				}
				if (b == 7 || c == 7)
				{
				   i++;
				continue;
				}
								 s = s + i * i;
					 i++;
		  }
				System.out.printf("%d",s);

	return 0;
	}

}

