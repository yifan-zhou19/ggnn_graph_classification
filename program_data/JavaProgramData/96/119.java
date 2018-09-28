package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String a = new String(new char[100]);
		  int len;
		  int i;
		  int[] num = new int[100];
		  int t;
		  int r;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = tempVar.charAt(0);
		  }
		  len = a.length();
		  for (i = 0;i < len;i++)
		  {
				   num[i] = a.charAt(i) - '0';
		  }
		  if (num[0] * 10 + num[1] < 13 && len == 2)
		  {
			  System.out.printf("%d\n%d",0,num[0] * 10 + num[1]);
		  }
			  else if (len == 1)
			  {
					System.out.printf("%d\n%d",0,num[0]);
			  }
					else

					{
			 if (num[0] * 10 + num[1] < 13)
			 {
				   r = num[0] * 10 + num[1];
			 }
			   else
			   {
					r = (num[0] * 10 + num[1]) % 13;
					System.out.printf("%d",(num[0] * 10 + num[1]) / 13);
			   }
		  for (i = 2;i < len;i++)
		  {
				t = (r * 10 + num[i]) / 13;
				r = (r * 10 + num[i]) % 13;
				System.out.printf("%d",t);
		  }
		  System.out.print("\n");
		  System.out.printf("%d",r);
					}
	}
}

