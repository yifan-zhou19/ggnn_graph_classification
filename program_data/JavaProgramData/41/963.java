package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int[] a = new int[6];
	 int[] b = new int[6];
	 int i;
	 int[] c = new int[6];
	 for (a[1] = 1;a[1] <= 5;a[1]++)
	 {
	  for (a[2] = 1;a[2] <= 5;a[2]++)
	  {
	   for (a[3] = 1;a[3] <= 5;a[3]++)
	   {
		for (a[4] = 1;a[4] <= 5;a[4]++)
		{
		 for (a[5] = 1;a[5] <= 5;a[5]++)
		 {
		 if (a[1] + a[2] + a[3] + a[4] + a[5] == 15)
		 {
	  b[1] = (a[1] == 5);
	  b[2] = (a[2] == 2);
	  b[3] = (a[5] == 1);
	  b[4] = (a[1] != 3);
	  b[5] = (a[1] == 4);
	 /*if ((b[a[1]])&&(b[a[2]]))
	  {
	   for (i=1;i<=5;i++)
	 c[a[i]]=i;
	for (i=1;i<=4;i++) cout<<c[i]<<" ";cout<<c[5]<<endl;
	  }*/
		 }
		 }
		}
	   }
	  }
	 }
	System.out.print(5);
	System.out.print(" ");
	System.out.print(2);
	System.out.print(" ");
	System.out.print(1);
	System.out.print(" ");
	System.out.print(3);
	System.out.print(" ");
	System.out.print(4);
	return 0;
	}

}
