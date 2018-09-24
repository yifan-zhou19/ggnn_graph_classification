package <missing>;

public class GlobalMembers
{
	public static int Main()

	{
	  int w;
	  int p;
	  w = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  int[] a = {13, 13 + 31, 13 + 31 + 28, 13 + 31 + 28 + 31, 13 + 31 + 28 + 31 + 30, 13 + 31 + 28 + 31 + 30 + 31, 13 + 31 + 28 + 30 + 31 + 30 + 31, 13 + 31 + 28 + 30 + 31 + 30 + 31 + 31, 13 + 31 + 28 + 30 + 31 + 30 + 31 + 31 + 31, 13 + 31 + 28 + 30 + 31 + 30 + 31 + 31 + 30 + 31, 13 + 31 + 28 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 31, 13 + 31 + 28 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 31 + 30};
	  if (w <= 5)
	  {
		p = 6 - w;
	  }
	  else
	  {
		p = 13 - w;
	  }
	  for (int i = 0;i < 12;i++)
	  {
		  if ((a[i] - p) % 7 == 0)
		  {
		   System.out.print(i + 1);
		   System.out.print("\n");
		  }
	  }
	  return 0;
	}
}

