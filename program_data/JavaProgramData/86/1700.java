package <missing>;

public class GlobalMembers
{
	//************************************
	//*  ?? ?:5-11.cpp                *
	//*  ?   ?:???                  *
	//*  ????:2013.10.31             *
	//*  ????:?????             *
	//************************************
	public static int Main()
	{
	  int n;
	  int m;
	  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  for (int i = 0;i < n;i++)
	  {
	   int w;
	   m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   if (m == 0)
	   {
		 System.out.print("60");
		 System.out.print("\n");
	   }
	   else
	   {
	   int[] p = new int[m];
	   for (int j = 0;j < m;j++)
	   {
		p[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   }
		for (int k = m - 1;k >= 0;k--)
		{
		 if (p[k] + k * 3 <= 60)
		 {
		  w = k;
		  break;
		 }
		}
		 if ((p[w] + 3 * (w + 1)) >= 60)
		 {
		 System.out.print(p[w]);
		 System.out.print("\n");
		 }
		 else
		 {
		 System.out.print(60 - 3 * (w + 1));
		 System.out.print("\n");
		 }
	   }
	  }

	   return 0;
	}




}

