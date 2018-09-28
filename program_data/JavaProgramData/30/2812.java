package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int[] a = new int[1000];
		  int b = 0;
		  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  for (i = 0;i < n;i++)
		  {
				a[i] = i + 1;

				if (a[i] % 10 == 7)
				{
					 b = b;
				}
				else if (a[i] % 7 == 0)
				{
					 b = b;
				}
				else if (69 < a[i] && 80> a[i])
				{
					 b = b;
				}
				else
				{
					b = b + a[i] * a[i];
				}
		  }
		  System.out.print(b);
		  int c;
		  c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  return 0;



	}
}

