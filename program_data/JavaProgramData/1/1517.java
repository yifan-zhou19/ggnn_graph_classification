package <missing>;

public class GlobalMembers
{
	public static int l = 0;
	public static int num = 0;
	public static int o;
	public static void f(int i,int in)
	{
		 int j;
		 for (j = i;j < (in + 1);j++)
		 {
			  if (j * (in / j) == in)
			  {
				  // out[l]=j;
				  // l=l+1;
				   o = in / j;
				   /*cout<<j<<endl;
				   cout<<"----------------------"<<endl;*/
				   f(j, in / j);
				   o = o * j;
			  }
			  //else f(j+1,in); 

		 }
			  if (o == 1)
			  {
				  num = num + 1;
			  }
	}
	public static int Main()
	{
		 int t;
		 t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 int i;
		 int in;
		 for (i = 0;i < t;i++)
		 {
			  in = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			  f(2, in);
			  System.out.print(num);
			  System.out.print("\n");
			  num = 0;
		 }
		 return 0;
	}


}

