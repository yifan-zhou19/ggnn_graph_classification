package <missing>;

public class GlobalMembers
{
	public static int[] q = new int[1000];
	public static int[] t = new int[1000];

	public static int Main()
	{
	  int n;
	  int i;
	  int qs;
	  int qe;
	  int ts;
	  int te;
	  while ((n != 0 && n != 0 = Boolean.parseBoolean(ConsoleInput.readToWhiteSpace(true))).length() > 0)
	  {
		for (i = 0;i < n;i++)
		{
		  t[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
		  q[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		qs = ts = 0;
		qe = te = n - 1;
		sort(q,q + n);
		sort(t,t + n);
		int price = 0;
		while (n-- != 0)
		{
		  if (t[te] > q[qe])
		  {
			price++;
			te--;
			qe--;
		  }
		  else if (t[ts] > q[qs])
		  {
			price++;
			qs++;
			ts++;
		  }
		  else
		  {
			if (t[ts] > q[qe])
			{
			  price += (qe+1 - qs);
			  break;
			}
			else if (t[ts] < q[qe])
			{
			  price--;
			}
			ts++;
			qe--;
		  }
		}
		System.out.print(price * 200);
		System.out.print("\n");

	  }
	  return 0;
	}





}

