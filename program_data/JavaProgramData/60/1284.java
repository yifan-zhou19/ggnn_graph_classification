package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int a;
	  int b = 0;
	  int c;
	  int d = 0;
	  int e = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }

	  for (i = 5;i <= n;i++)
	  {

	  for (a = 2;a < i;a++)
	  {
			  if (i % a == 0)
			  {
			  b++;
			  }
	  }
	  if (b == 0)
	  {

			  for (c = 2;c < (i - 2);c++)
			  {
			  if ((i - 2) % c == 0)
			  {
			  d++;
			  }
			  }




			  if (d == 0)
			  {
			  e++;
			  System.out.printf("%d %d\n",i - 2,i);
			  }
	  }
		b = 0;
		d = 0;
	  }
	 if (e == 0)
	 {
	 System.out.print("empty\n");
	 }

	 return 0;

	}

}

