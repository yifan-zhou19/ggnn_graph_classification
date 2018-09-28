package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String a = new String(new char[500]);
	  int i;
	  int j;
	  int h;
	  int l;
	  int[] b = new int[500];
	  int k;
	  a = new Scanner(System.in).nextLine();
	  l = a.length() - 1;
	  for (i = 0;i <= l - 1;i++)
	  {
		   b[i] = 0;
	  }
	  for (i = 0;i <= l - 1;i++)
	  {
		   k = 0;
		   while (a.charAt(i - k) == a.charAt(i + 1 + k))
		   {
				  k++;
				  if ((i - k < 0) || (i + k> l))
				  {
					  break;
				  }
		   }
		   b[i] = k;
	  }
	  for (j = 1;j <= l / 2 + 1;j++)
	  {
		for (i = 1;i <= l - 2;i++)
		{
		  if (b[i] >= j)
		  {
			   for (h = i - j + 1;h <= i + j;h++)
			   {
				System.out.printf("%c",a.charAt(h));
			   }
			   System.out.print("\n");
		  }
		}
	  }
	}
}
