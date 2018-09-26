package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  int i = 0;
	  int j = 0;
	  int k = 0;
	  int l = 0;
	  int[] a = new int[100];
	  int[] b = new int[100];
	  int[] c = new int[n - 1];
	  int[] d = new int[n - 1];
	  for (i = 0;i < n - 1;i++)
	  {
		c[i] = i;
		d[i] = 0;
	  }

	  while (true)
	  {
		int p;
		int q;
		p = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		q = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		l++;
		if ((p == 0) && (q == 0))
		{
		  break;
		}
		else
		{
		  d[q]++;
		}
	  }
	  for (i = 0;i < l;i++)
	  {
		if (d[i] == n - 1)
		{
		  System.out.print(c[i]);
		  System.out.print("\n");
		  k++;
		  break;
		}
	  }
	  if (k == 0)
	  {
		System.out.print("NOT");
		System.out.print(" ");
		System.out.print("FOUND");
		System.out.print("\n");
	  }
	  System.in.read();
	  System.in.read();
	  System.in.read();
	  return 0;
	}

}

