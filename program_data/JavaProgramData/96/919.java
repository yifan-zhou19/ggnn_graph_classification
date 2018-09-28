package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  final String a = "";
	  int i;
	  int j;
	  int k;
	  int t;
	  int m;
	  int[] b = new int[100];
	  int[] c = new int[100];
	  a = ConsoleInput.readToWhiteSpace(true).charAt(0);
	  for (i = 0;i < 100;i++)
	  {
	   if (a.charAt(i) == '\0')
	   {
		   break;
	   }
	  }
	   k = i;
	   for (i = 0;i < k;i++)
	   {
		b[i] = a.charAt(i) - '0'; //for(i=0;i<k;i++)cout<<b[i];cout<<endl;
	   }
		if (k > 1)
		{
		m = b[0] * 10 + b[1];
		if (m < 13 && k == 2)
		{
			System.out.print("0");
			System.out.print("\n");
			System.out.print(m);
		}
		 else
		 {
	   for (i = 2;i <= k;i++)
	   {
		   c[i] = m / 13;
		   t = m % 13;
		   m = (m - c[i] * 13) * 10 + b[i];
	   }
		for (j = 0;j < 4;j++)
		{
		if (c[j] != 0)
		{
			break;
		}
		}
		 for (i = j;i <= k;i++)
		 {
		  System.out.print(c[i]);
		 }
	  System.out.print("\n");
		  System.out.print(t);
		 }
		}
		  else
		  {
			  System.out.print("0");
			  System.out.print("\n");
			  System.out.print(b[0]);
		  }

		  return 0;
	}



}

