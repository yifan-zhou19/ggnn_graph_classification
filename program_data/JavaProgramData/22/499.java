package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int i;
	  int b = 0;
	  int s;
	  int t;
	  int c;
	  int[] a = new int[300];
	  for (i = 1;;i++)
	  {
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a[i] = Integer.parseInt(tempVar);
		  }
		  if (System.in.read() != ',')
		  {
			  break;
		  }
	  }
	  for (s = 1;s < i;s++)
	  {
		  for (t = 1;t < i + 1 - s;t++)
		  {
		  if (a[t] > a[t + 1])
		  {
			c = a[t + 1];
			a[t + 1] = a[t];
			a[t] = c;
		  }
		  }
	  }
	  for (s = 1;s < i;s++)
	  {
		  if (a[s] == a[s + 1])
		  {
			  b++;
		  }
	  }
	  if (b == i - 1)
	  {
		  System.out.print("No");
	  }
	  else
	  {
		for (s = i - 1;;s--)
		{
			if (a[s] < a[s + 1])
			{
				System.out.printf("%d",a[s]);
				break;
			}
		}
	  }
	  System.out.print("\n");
	}

}

