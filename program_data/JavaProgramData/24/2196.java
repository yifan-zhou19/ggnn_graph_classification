package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	  int i;
	  int t;
	  int j = -1;
	  int x = 0;
	  int[] b = new int[200];
	  int[] c = new int[200];
	  final String a = "";
	  a = new Scanner(System.in).nextLine();
	  for (i = 0;i < 5000;i++)
	  {
		  if (a.charAt(i) == '\0')
		  {
			   c[x + 1] = i + 1;
			b[x] = i - j - 1;
			x = x + 1;
			j = i;
			 break;
		  }
		  if (a.charAt(i) == ' ')
		  {
			   c[x + 1] = i + 1;
			b[x] = i - j - 1;
			x = x + 1;
			j = i;
		  }
	  }
		for (i = 0;i < 200;i++)
		{
		  if (b[i] == 0)
		  {
		   break;
		  }
		  if (b[i] > b[0])
		  {
			  t = b[0];
		  b[0] = b[i];
		  b[i] = t;
		  t = c[0];
		  c[0] = c[i];
		  c[i] = t;
		  }
		}

		for (i = c[0];i < c[0] + b[0];i++)
		{
		System.out.printf("%c",a.charAt(i));
		}
		System.out.print("\n");
		 for (i = 0;i < 200;i++)
		 {
		  if (b[i] == 0)
		  {
		   break;
		  }
		  if (b[i] < b[0])
		  {
			   t = b[0];
		  b[0] = b[i];
		  b[i] = t;
		  t = c[0];
		  c[0] = c[i];
		  c[i] = t;
		  }
		 }
	   for (i = c[0];i < c[0] + b[0];i++)
	   {
		System.out.printf("%c",a.charAt(i));
	   }
		System.out.print("\n");
	}


}
